package ui.app

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import iracing.IRacingData
import iracing.telemetry.TelemetryData
import iracing.yaml.SessionInfoData
import led.LedsController
import repository.GameDataRepository
import ui.components.dashboards.MainDashboard

@Composable
fun App() = MaterialTheme {
//    val filters = remember { listOf("RPM") }
//    val telemetryData by GameDataRepository.telemetry(filters).collectAsState(IRacingData.Telemetry(telemetry = emptyMap()))
//    val sessionData by GameDataRepository.session().collectAsState(null)

    MainDashboard()
}

private fun updateSession(session: SessionInfoData) {
    session.DriverInfo?.also {
        LedsController.setRevOptions(
            it.DriverCarIdleRPM,
            it.DriverCarSLFirstRPM,
            it.DriverCarSLShiftRPM,
            it.DriverCarSLLastRPM,
            it.DriverCarSLBlinkRPM
        )
    } ?: LedsController.setIdle()
}

private fun updateRPM(data: Map<String, TelemetryData>) {
    data["RPM"]?.value?.let {
        LedsController.updateRevs(it.toFloatOrNull()?.toInt() ?: 0)
    }
}