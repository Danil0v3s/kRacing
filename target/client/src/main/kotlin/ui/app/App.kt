package ui.app

import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import iracing.IRacingData
import iracing.telemetry.TelemetryData
import iracing.yaml.SessionInfoData
import led.LedsController
import repository.GameDataRepository
import ui.components.dashboards.MainDashboard

@Composable
fun App() = MaterialTheme {
    val state by GameDataRepository.iRacingData.collectAsState(null)

    LaunchedEffect(state) {
        when (val s = state) {
            is IRacingData.Session -> updateSession(s.data)
            is IRacingData.Telemetry -> updateRPM(s.data)
            null -> Unit
        }
    }

    when (val s = state) {
        is IRacingData.Telemetry -> MainDashboard(s)
        else -> Box{}
    }
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