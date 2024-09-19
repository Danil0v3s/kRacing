package ui.app

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import iracing.IRacingData
import iracing.RPM
import iracing.yaml.SessionInfoData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.filterIsInstance
import kotlinx.coroutines.launch
import led.LedsController
import repository.GameDataRepository
import ui.components.dashboards.MainDashboard

class AppViewModel : ViewModel() {
    val filters = listOf("RPM")

    init {
        CoroutineScope(Dispatchers.IO).launch {
            GameDataRepository
                .telemetry(filters)
                .filterIsInstance(IRacingData.Telemetry::class)
                .collect {
                    LedsController.updateRevs(it.RPM.toInt())
                }

            GameDataRepository
                .session()
                .filterIsInstance(IRacingData.Session::class)
                .collect {
                    updateSession(it.session)
                }
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
}

@Composable
fun App(viewModel: AppViewModel = viewModel()) = MaterialTheme {
    MainDashboard()
}