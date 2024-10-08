package ui

import Label
import PreferencesRepository
import Title
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Stop
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import io.ktor.server.application.Application
import io.ktor.server.application.ApplicationStarted
import io.ktor.server.application.ApplicationStopped
import io.ktor.server.application.install
import io.ktor.server.auth.Authentication
import io.ktor.server.auth.UserIdPrincipal
import io.ktor.server.auth.authenticate
import io.ktor.server.auth.basic
import io.ktor.server.engine.ApplicationEngineEnvironment
import io.ktor.server.engine.EngineConnectorConfig
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.netty.NettyApplicationEngine
import io.ktor.server.routing.routing
import io.ktor.server.websocket.WebSockets
import io.ktor.server.websocket.webSocket
import io.ktor.websocket.send
import iracing.IRacingData
import iracing.IRacingReader
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

data class ServerState(
    val isRunning: Boolean = false,
    val port: String = "8080",
    val user: String = "root",
    val pass: String = "pass",
    val pollingRate: Long = 200L
)

sealed class ServerEvent {
    data class Started(val connector: EngineConnectorConfig) : ServerEvent()
    object Stopped : ServerEvent()
}

@Composable
fun ServerUi(
    reader: IRacingReader
) {
    var state by remember { mutableStateOf(ServerState()) }
    fun updateState(serverEvent: ServerEvent) {
        state = when (serverEvent) {
            is ServerEvent.Started -> {
                state.copy(isRunning = true)
            }

            is ServerEvent.Stopped -> {
                state.copy(isRunning = false)
            }
        }
    }

    var server by remember {
        mutableStateOf(
            createServer(
                reader = reader,
                options = state,
                onServerEvent = ::updateState
            )
        )
    }
    val pollingRateOptions = listOf("200", "300", "400", "500", "600")

    LaunchedEffect(Unit) {
        if (PreferencesRepository.getPreferenceBoolean(PREFERENCE_AUTO_START_SERVER, false)) {
            server.start(wait = false)
        }
    }

    Box(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Row {
            Column {
                Title(text = "Server configuration")

                Row(
                    modifier = Modifier.padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        maxLines = 1,
                        modifier = Modifier.width(120.dp),
                        value = state.port,
                        onValueChange = { state = state.copy(port = it) },
                        label = { Text("Port") }
                    )

                    DropdownMenu(
                        options = pollingRateOptions,
                        onValueChanged = { state = state.copy(pollingRate = it.toLong()) }
                    )
                }

                Row(
                    modifier = Modifier.padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        maxLines = 1,
                        modifier = Modifier.width(120.dp),
                        value = state.user,
                        onValueChange = { state = state.copy(user = it) },
                        label = { Text("User") }
                    )

                    OutlinedTextField(
                        maxLines = 1,
                        modifier = Modifier.width(120.dp),
                        value = state.pass,
                        onValueChange = { state = state.copy(pass = it) },
                        label = { Text("Password") }
                    )
                }

                serverButtonRows(
                    state = state,
                    onStopServerClicked = {
                        if (state.isRunning) {
                            server.stop(1000L, 3000L)
                        }
                    },
                    onStartServerClicked = {
                        if (!state.isRunning) {
                            server = createServer(
                                reader = reader,
                                options = state,
                                onServerEvent = ::updateState
                            )
                            server.start(wait = false)
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun serverButtonRows(
    state: ServerState,
    onStopServerClicked: () -> Unit,
    onStartServerClicked: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Label(text = "ws://localhost:${state.port}")
        }

        Row(
            modifier = Modifier
                .background(color = MaterialTheme.colors.primary, shape = MaterialTheme.shapes.small)
                .height(36.dp)
                .padding(end = 12.dp, start = 6.dp)
                .clickable {
                    if (state.isRunning) {
                        onStopServerClicked()
                    } else {
                        onStartServerClicked()
                    }
                },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val icon: ImageVector
            val label: String
            if (state.isRunning) {
                icon = Icons.Filled.Stop
                label = "Stop Server"
            } else {
                icon = Icons.Filled.PlayArrow
                label = "Start Server"
            }
            Icon(
                imageVector = icon, null, tint = Color.White
            )
            Label(text = label, style = MaterialTheme.typography.subtitle2.copy(color = Color.White))
        }
    }
}

@Composable
fun DropdownMenu(
    options: List<String>,
    onValueChanged: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf(options.first()) }

    Box(
        modifier = Modifier.width(120.dp)
    ) {
        OutlinedTextField(
            maxLines = 1,
            modifier = Modifier.fillMaxWidth().align(Alignment.CenterEnd),
            value = selectedOption,
            onValueChange = {},
            readOnly = true,
            label = { Text("Poll Rate (ms)") }
        )
        Icon(
            modifier = Modifier.align(Alignment.CenterEnd).clickable { expanded = !expanded },
            imageVector = Icons.Filled.ArrowDropDown,
            contentDescription = ""
        )

        if (expanded) {
            LazyColumn(
                modifier = Modifier.fillMaxWidth().background(Color.White)
            ) {
                items(options) {
                    Text(
                        modifier = Modifier.fillMaxWidth().padding(4.dp).clickable {
                            selectedOption = it
                            onValueChanged(it)
                            expanded = !expanded
                        },
                        text = it
                    )
                }
            }
        }
    }
}

private fun createServer(
    reader: IRacingReader,
    options: ServerState,
    onServerEvent: (ServerEvent) -> Unit
): NettyApplicationEngine {
    return embeddedServer(Netty, port = options.port.toInt()) {
        extracted(options, reader, onServerEvent)
    }
}

private fun Application.extracted(
    options: ServerState,
    reader: IRacingReader,
    onServerEvent: (ServerEvent) -> Unit
) {
    install(WebSockets)
    install(Authentication) {
        basic("auth-basic") {
            validate { credentials ->
                if (credentials.name == options.user && credentials.password == options.pass) {
                    UserIdPrincipal(credentials.name)
                } else {
                    null
                }
            }
        }
    }

    routing {
        authenticate("auth-basic") {
            webSocket("/session") {
                reader
                    .sessionFlow
                    .catch { println(it) }
                    .distinctUntilChanged()
                    .map { Json.encodeToString(it) }
                    .collect(::send)
            }

            webSocket("/telemetry") {
                val queryParams = call.request.queryParameters
                reader.telemetryFilter.addAll(queryParams["filter"]?.split(",").orEmpty())
                reader
                    .telemetryFlow
                    .catch { println(it) }
                    .distinctUntilChanged()
                    .map { Json.encodeToString(it) }
                    .collect(::send)
            }
        }
    }

    environment.monitor.apply {
        subscribe(ApplicationStarted) {
            reader.pollingInterval = options.pollingRate.toLong()
            reader.tryOpenMemoryFile()
            onServerEvent(ServerEvent.Started((environment as ApplicationEngineEnvironment).connectors.first()))
        }
        subscribe(ApplicationStopped) {
            onServerEvent(ServerEvent.Stopped)
            reader.stopPolling()
        }
    }
}
