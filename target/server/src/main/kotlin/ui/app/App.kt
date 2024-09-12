package ui.app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import iracing.IRacingReader
import ui.FooterUi
import ui.ServerUi
import ui.SettingsUi

@Composable
fun App(
    IRacingReader: IRacingReader = IRacingReader()
) = MaterialTheme {
    Row(modifier = Modifier.fillMaxSize()) {
        Column {
            ServerUi(IRacingReader)
            Divider()
            SettingsUi()
            FooterUi()
        }
    }
}
