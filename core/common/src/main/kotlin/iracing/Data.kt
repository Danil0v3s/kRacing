package iracing

import iracing.telemetry.TelemetryData
import iracing.yaml.SessionInfoData
import kotlinx.serialization.KSerializer
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

@Serializable
sealed class IRacingData {

    @Serializable
    data class Telemetry(
        val telemetry: Map<String, TelemetryData>
    ) : IRacingData()

    @Serializable
    data class Session(
        val session: SessionInfoData,
    ) : IRacingData()

    @Serializable
    data object Disconnected : IRacingData()
}

