package iracing

import iracing.telemetry.TelemetryData
import iracing.yaml.SessionInfoData
import kotlinx.serialization.Serializable

@Serializable
sealed class IRacingData {
    abstract val dataType: IRacingDataType

    data class Telemetry(
        override val dataType: IRacingDataType = IRacingDataType.Telemetry,
        val data: Map<String, TelemetryData>,
    ) : IRacingData()

    data class Session(
        override val dataType: IRacingDataType = IRacingDataType.Session,
        val data: SessionInfoData
    ) : IRacingData()
}

enum class IRacingDataType(val value: String) {
    Telemetry("TELEMETRY"),
    Session("SESSION"),
}