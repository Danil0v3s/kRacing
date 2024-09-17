package iracing

import iracing.telemetry.TelemetryData
import iracing.yaml.SessionInfoData
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

@Serializable
sealed class IRacingData {
    abstract val dataType: IRacingDataType

    @Serializable
    data class Telemetry(
        override val dataType: IRacingDataType = IRacingDataType.Telemetry,
        val telemetry: Map<String, TelemetryData>
    ) : IRacingData()

    @Serializable
    data class Session(
        override val dataType: IRacingDataType = IRacingDataType.Session,
        val session: SessionInfoData,
    ) : IRacingData()

    @Serializable
    data object Disconnected : IRacingData() {
        override val dataType: IRacingDataType
            get() = IRacingDataType.Disconnected
    }
}

enum class IRacingDataType {
    Disconnected, Telemetry, Session
}

val module = SerializersModule {
    polymorphic(IRacingData::class) {
        subclass(IRacingData.Telemetry::class)
        subclass(IRacingData.Session::class)
        subclass(IRacingData.Disconnected::class)
    }
}
val formatter = Json { serializersModule = module }