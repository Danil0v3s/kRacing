package ui.components.dashboards

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import iracing.IRacingData
import ui.components.dashboards.ferrari.FerrariDash
import ui.components.dashboards.map.MapDash

enum class Dashboard {
    Ferrari,
    Map
}

@Composable
fun MainDashboard(data: IRacingData) {

    var currentDash by remember { mutableStateOf(Dashboard.Map.ordinal) }

    Box(modifier = Modifier
        .clickable {
            currentDash += 1
        }) {
        when (currentDash % Dashboard.entries.size) {
            0 -> FerrariDash(data)
            1 -> MapDash(data)
        }
    }
}
