package iracing.telemetry

data class TelemetryVarHeader(
    val name: String,
    val unit: String,
    val desc: String,
    val type: Int,
    val count: Int,
    val offset: Int
)