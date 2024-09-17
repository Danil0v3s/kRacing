package repository

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.HttpRequestRetry
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.timeout
import io.ktor.client.plugins.websocket.WebSockets
import io.ktor.client.plugins.websocket.webSocket
import io.ktor.http.HttpMethod
import io.ktor.serialization.kotlinx.json.json
import io.ktor.websocket.Frame
import io.ktor.websocket.readText
import iracing.IRacingData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.serialization.json.Json

object GameDataRepository {

    val client = HttpClient(OkHttp) {
        install(HttpRequestRetry) {
            retryOnException(retryOnTimeout = true)
        }
        install(HttpTimeout)
        install(WebSockets)
        install(ContentNegotiation) {
            json()
        }
    }

    fun telemetry(filters: List<String>): Flow<IRacingData> = flow {
        webSocket("/telemetry?filter=${filters.joinToString(",")}") {
            try {
                emit(Json.decodeFromString<IRacingData>(it))
            } catch (e: Exception) {
                println(e)
            }
        }
    }.flowOn(Dispatchers.IO)

    fun session(): Flow<IRacingData> = flow {
        webSocket("/session") {
            try {
                emit(Json.decodeFromString<IRacingData>(it))
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
                timeout {
                    socketTimeoutMillis = Long.MAX_VALUE
                }
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
