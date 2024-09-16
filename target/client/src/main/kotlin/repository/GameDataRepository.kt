package repository

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.websocket.WebSockets
import io.ktor.client.plugins.websocket.webSocket
import io.ktor.http.HttpMethod
import io.ktor.serialization.kotlinx.json.json
import io.ktor.websocket.Frame
import io.ktor.websocket.readText
import iracing.IRacingData
import iracing.telemetry.TelemetryData
import iracing.yaml.SessionInfoData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.serialization.json.Json

object GameDataRepository {

    val client = HttpClient(OkHttp) {
        install(WebSockets)
        install(ContentNegotiation) {
            json()
        }
    }

    fun telemetry(filters: List<String>): Flow<IRacingData.Telemetry> = flow {
        webSocket("/telemetry?filter=${filters.joinToString(",")}") {
            try {
                val data = Json.decodeFromString<Map<String, TelemetryData>>(it)
                emit(IRacingData.Telemetry(telemetry = data))
            } catch (e: Exception) {
                println(e)
            }
        }
    }.flowOn(Dispatchers.IO)

    fun session(): Flow<SessionInfoData> = flow {
        webSocket("/session") {
            try {
                emit(Json.decodeFromString<SessionInfoData>(it))
            } catch (e: Exception) {
                println(e)
            }
        }
    }.flowOn(Dispatchers.IO)

    private suspend fun <T> webSocket(path: String, block: suspend (String) -> T) {
        client.webSocket(
            method = HttpMethod.Get,
            host = "192.168.1.208",
            port = 8080,
            path = path,
            request = {
                headers.append("Authorization", "Basic cm9vdDpwYXNz")
            },
        ) {
            while (true) {
                val othersMessage = incoming.receive() as? Frame.Text ?: continue
                block(othersMessage.readText())
            }
        }
    }
}
