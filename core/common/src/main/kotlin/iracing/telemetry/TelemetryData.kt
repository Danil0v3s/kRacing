package iracing.telemetry

import kotlinx.serialization.Serializable

@Serializable
data class TelemetryData(
    val value: String,
)
