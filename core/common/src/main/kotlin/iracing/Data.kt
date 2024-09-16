package iracing

import iracing.telemetry.TelemetryData
import iracing.yaml.SessionInfoData
import kotlinx.serialization.Serializable

@Serializable
sealed class IRacingData {
    abstract val type: IRacingDataType

    @Serializable
    data class Telemetry(
        override val type: IRacingDataType = IRacingDataType.Telemetry,
        val telemetry: Map<String, TelemetryData>
    ) : IRacingData()

    @Serializable
    data class Session(
        override val type: IRacingDataType = IRacingDataType.Session,
        val session: SessionInfoData,
    ) : IRacingData()

    @Serializable
    data object Disconnected : IRacingData() {
        override val type: IRacingDataType
            get() = IRacingDataType.Disconnected
    }
}

enum class IRacingDataType {
    Disconnected, Telemetry, Session
}