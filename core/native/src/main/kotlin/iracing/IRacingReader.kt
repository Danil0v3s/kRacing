@file:OptIn(ExperimentalStdlibApi::class)

package iracing

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.exc.MismatchedInputException
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.WinNT
import iracing.MAHMSizes.IRSDK_MAX_DESC
import iracing.MAHMSizes.IRSDK_MAX_STRING
import iracing.telemetry.TelemetryData
import iracing.telemetry.TelemetryVarHeader
import iracing.yaml.SessionInfoData
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import win32.WindowsService
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.charset.StandardCharsets

object MAHMSizes {
    const val IRSDK_MAX_BUFS = 4
    const val IRSDK_MAX_STRING = 32

    // descriptions can be longer than max_string!
    const val IRSDK_MAX_DESC = 64

    const val IRSDK_UNLIMITED_LAPS = 32767
    const val IRSDK_UNLIMITED_TIME = 604800.0f

    // latest version of our telemetry headers
    const val IRSDK_VER = 2
}

private const val YML_MAP_FILE_NAME = "Local\\IRSDKMemMapFileName"
private const val EVENTS_MAP_FILE_NAME = "Local\\IRSDKDataValidEvent"

class IRacingReader {

    private val windowsService = WindowsService()
    private var pollingJob: Job? = null

    private var memoryMapFile: WinNT.HANDLE? = null
    private var eventFile: WinNT.HANDLE? = null
    private var telemetryPointer: Pointer? = null

    private var header: IRacingDataHeader? = null

    private val yamlParser by lazy {
        ObjectMapper(YAMLFactory()).apply {
            configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            registerModule(KotlinModule())
        }
    }

    private var telemetryVarLookup = mutableMapOf<String, TelemetryVarHeader>()

    var pollingInterval = 200L

    val sessionFlow = flow {
        initialize()
        var isConnected = false
        while (true) {
            try {
                emit(readSessionInfoData().copy(IsConnected = isConnected))
            } catch (e: MismatchedInputException) {
                println(e)
            } finally {
                isConnected = windowsService.waitForEvent(eventFile!!)
            }
        }
    }

    var telemetryFilter = mutableListOf<String>()
    val telemetryFlow = flow {
        initialize()
        // emit first time from build
        emit(buildTelemetryDataLookup())

        while (true) {
            emit(readTelemetryData())
            delay(33)
        }
    }

    private suspend fun initialize() {
        while (telemetryPointer == null || eventFile == null) {
            tryOpenMemoryFile()
            if (telemetryPointer == null || eventFile == null) {
                println("Couldn't connect to iRacing. Delaying 1 second")
                delay(1_000L)
            } else {
                println("Connected to iRacing")
            }
        }
    }

    fun stopPolling() {
        pollingJob?.cancel()
        pollingJob = null
        telemetryPointer?.let { windowsService.unmapViewOfFile(it) }
        memoryMapFile?.let { windowsService.closeHandle(it) }
        eventFile?.let { windowsService.closeHandle(it) }
    }

    fun tryOpenMemoryFile() {
        if (memoryMapFile == null) {
            windowsService.openMemoryMapFile(YML_MAP_FILE_NAME)?.let { handle ->
                memoryMapFile = handle
                telemetryPointer = windowsService.mapViewOfFile(handle)
            }
        }

        if (eventFile == null) {
            windowsService.openEventFile(EVENTS_MAP_FILE_NAME)?.let { handle ->
                eventFile = handle
            }
        }
    }

    private fun readHeader(pointer: Pointer): IRacingDataHeader {
        val buffer = getByteBuffer(pointer, IRacingDataHeader.HEADER_SIZE)

        return readHeader(buffer)
    }

    private fun buildTelemetryDataLookup(): Map<String, TelemetryData> {
        val pointer = telemetryPointer ?: return emptyMap()
        val header = readHeader(pointer)
        this.header = header
        val latestPointerBuffer = header.getLatestVarByteBuffer(pointer)
        val telemetryData = buildTelemetryDataLookup(header, pointer, latestPointerBuffer)

        return telemetryData
    }

    private fun readSessionInfoData(): SessionInfoData {
        if (header == null || telemetryPointer == null) {
            tryOpenMemoryFile()
            this.header = readHeader(telemetryPointer!!)
        }
        val sessionInfoData =
            readSessionInfoData(getByteBuffer(telemetryPointer!!, header!!.sessionInfoLen, header!!.sessionInfoOffset))

        return sessionInfoData
    }

    private fun readTelemetryData(): Map<String, TelemetryData> {
        val latestPointerBuffer = header?.getLatestVarByteBuffer(telemetryPointer!!) ?: return emptyMap()

        return telemetryVarLookup
            .filter { if (telemetryFilter.size > 0) telemetryFilter.contains(it.key) else true }
            .mapValues { varHeader ->
                val value = readVariable(
                    varHeader.value.type,
                    varHeader.value.count,
                    latestPointerBuffer,
                    varHeader.value.offset
                )

                TelemetryData(
                    value = value,
                )
            }
    }

    private fun buildTelemetryDataLookup(
        header: IRacingDataHeader,
        pointer: Pointer,
        latestPointerBuffer: ByteBuffer
    ): MutableMap<String, TelemetryData> {
        val telemetryData = mutableMapOf<String, TelemetryData>()

        for (i in 0 until header.numVars) {
            val buffer = pointer.getByteArray(header.varHeaderOffset + (144L * i), 144).let {
                ByteBuffer.wrap(it).order(
                    ByteOrder.LITTLE_ENDIAN
                )
            }

            val type = buffer.int
            val offset = buffer.int
            val count = buffer.int

            var localBuffer = ByteArray(IRSDK_MAX_STRING)
            buffer.position(16)
            buffer[localBuffer, 0, localBuffer.size]
            val name = String(localBuffer).replace("[\u0000]".toRegex(), "")

            buffer.position(16 + IRSDK_MAX_STRING + IRSDK_MAX_DESC)
            buffer[localBuffer, 0, localBuffer.size]
            val unit = String(localBuffer).replace("[\u0000]".toRegex(), "")

            localBuffer = ByteArray(IRSDK_MAX_DESC)
            buffer.position(16 + IRSDK_MAX_STRING)
            buffer[localBuffer, 0, localBuffer.size]
            val desc = String(localBuffer).replace("[\u0000]".toRegex(), "")

            val value = readVariable(type, count, latestPointerBuffer, offset)

            telemetryData[name] = TelemetryData(
                value = value,
            )

            telemetryVarLookup[name] = TelemetryVarHeader(
                name, unit, desc, type, count, offset
            )
        }
        return telemetryData
    }

    private fun readVariable(
        type: Int,
        count: Int,
        latestPointerBuffer: ByteBuffer,
        offset: Int
    ): String {
        val value = when (type) {
            // char, bool
            0, 1 -> if (count == 1) {
                latestPointerBuffer.getChar(offset).toString().toBoolean().toString()
            } else {
                // Read multiple boolean values
                List(count) { i ->
                    latestPointerBuffer.getChar(offset + i * 2).toString().toBoolean() // Each char is 2 bytes
                }.joinToString(",")
            }

            2, 3 -> if (count == 1) {
                latestPointerBuffer.getInt(offset).toString()
            } else {
                // Read multiple int values
                IntArray(count) { i ->
                    latestPointerBuffer.getInt(offset + i * 4) // Each int is 4 bytes
                }.joinToString(",")
            }

            4 -> if (count == 1) {
                latestPointerBuffer.getFloat(offset).toString()
            } else {
                // Read multiple float values
                FloatArray(count) { i ->
                    latestPointerBuffer.getFloat(offset + i * 4) // Each float is 4 bytes
                }.joinToString(",")
            }

            5 -> if (count == 1) {
                latestPointerBuffer.getDouble(offset).toString()
            } else {
                // Read multiple double values
                DoubleArray(count) { i ->
                    latestPointerBuffer.getDouble(offset + i * 8) // Each double is 8 bytes
                }.joinToString(",")
            }

            else -> "-1"
        }
        return value
    }

    private fun readSessionInfoData(buffer: ByteBuffer): SessionInfoData {
        val yml = buffer.readString(buffer.remaining())
        return yamlParser.readValue(yml, SessionInfoData::class.java)
    }

    private fun getByteBuffer(pointer: Pointer, size: Int, skip: Int = 0): ByteBuffer {
        val buffer = ByteBuffer.allocateDirect(size)
        buffer.put(pointer.getByteArray(skip * 1L, size))
        buffer.order(ByteOrder.LITTLE_ENDIAN)
        buffer.rewind()
        // buffer.position(skip)

        return buffer
    }

    private fun readHeader(buffer: ByteBuffer) = IRacingDataHeader(
        version = buffer.int,
        status = buffer.int,
        tickRate = buffer.int,
        sessionInfoUpdate = buffer.int,
        sessionInfoLen = buffer.int,
        sessionInfoOffset = buffer.int,
        numVars = buffer.int,
        varHeaderOffset = buffer.int,
        numBuf = buffer.int,
        bufLen = buffer.int
    )

    private fun ByteBuffer.readString(size: Int): String {
        val array = ByteArray(size)
        get(array, 0, size)

        return String(trim(array), StandardCharsets.UTF_8)
    }

    private fun trim(bytes: ByteArray): ByteArray {
        var i = bytes.size - 1
        while (i >= 0 && bytes[i].toInt() == 0) {
            --i
        }
        return bytes.copyOf(i + 1)
    }
}
