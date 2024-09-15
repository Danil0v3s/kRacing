package iracing

import iracing.telemetry.TelemetryData
import iracing.yaml.SessionInfoData
import kotlinx.serialization.Serializable

@Serializable
data class IRacingData(
    val telemetry: Map<String, TelemetryData>,
    val session: SessionInfoData,
)