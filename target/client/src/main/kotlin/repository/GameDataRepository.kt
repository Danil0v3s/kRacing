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
import kotlinx.coroutines.flow.flow
import kotlinx.serialization.json.Json

object GameDataRepository {

    val client = HttpClient(OkHttp) {
        install(WebSockets)
        install(ContentNegotiation) {
            json()
        }
    }

    val iRacingData = flow {
        client.webSocket(
            method = HttpMethod.Get,
            host = "192.168.1.208",
            port = 8080,
            path = "/telemetry",
            request = {
                headers.append("Authorization", "Basic cm9vdDpwYXNz")
            }
        ) {
            while (true) {
                try {
                    val othersMessage = incoming.receive() as? Frame.Text ?: continue
                    emit(Json.decodeFromString<IRacingData>(othersMessage.readText()))
                } catch (e: Exception) {
                    emit(null)
                }
            }
        }
    }
}
