package ui.components.dashboards.map

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.asSkiaPath
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import iracing.CarIdxLapDistPct
import iracing.IRacingData
import iracing.PlayerCarIdx
import iracing.yaml.SessionInfoData
import repository.GameDataRepository
import java.util.regex.Pattern
import kotlin.math.floor

class DashViewModel : ViewModel() {

    private val filters = listOf("CarIdxLapDistPct", "PlayerCarIdx")
    val telemetry = GameDataRepository.telemetry(filters)
    val sessionData = GameDataRepository.session()

}

@Composable
fun MapDash(viewModel: DashViewModel = viewModel()) {

    val telemetry by viewModel.telemetry.collectAsState(IRacingData.Telemetry(telemetry = emptyMap()))
    val sessionData by viewModel.sessionData.collectAsState(SessionInfoData())

    if (sessionData.WeekendInfo?.TrackID == null) {
        return
    }

    Content(
        trackId = { sessionData.WeekendInfo?.TrackID ?: "" },
        carPositions = {
            telemetry.CarIdxLapDistPct.split(",").map { pctString ->
                (pctString.toFloatOrNull() ?: 0f).coerceAtLeast(0f)
            }
        },
        playerIdx = { telemetry.PlayerCarIdx },
        modifier = Modifier.fillMaxSize()
    )

}

@Composable
private fun Content(
    trackId: () -> String,
    carPositions: () -> List<Float>,
    playerIdx: () -> Int,
    modifier: Modifier = Modifier
) {

    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        MapCanvas(
            trackId = trackId,
            carPositions = carPositions,
            playerIdx = playerIdx,
            modifier = Modifier.size(400.dp)
        )
    }
}

@Composable
private fun MapCanvas(
    trackId: () -> String,
    carPositions: () -> List<Float>,
    playerIdx: () -> Int,
    modifier: Modifier = Modifier
) {
    val playerPainter = remember { Paint().asFrameworkPaint().apply { color = Color.Blue.toArgb() } }
    val otherPainter = remember { Paint().asFrameworkPaint().apply { color = Color.Red.toArgb() } }

    val trackPath = remember(trackId()) { getSvgPath("/track_images/${trackId()}.svg") }
    val startLinePath = remember(trackId()) { getSvgPath("/start_finish/${trackId()}.svg") }
    val pitroadPath = remember(trackId()) { getSvgPath("/pitroad/${trackId()}.svg") }
    val isTrackClockwise = remember(trackId()) { isTrackClockwise(trackId()) }

    val path = remember(trackId()) { PathParser().parsePathString(trackPath).toPath() }
    val start = remember(trackId()) { PathParser().parsePathString(startLinePath).toPath() }
    val pitroad = remember(trackId()) { PathParser().parsePathString(pitroadPath).toPath() }

    val measurer = remember(trackId()) { PathMeasure().apply { setPath(path, false) } }
    val startMeasurer = remember(trackId()) { PathMeasure().apply { setPath(start, false) } }

    Canvas(modifier = modifier) {
        val bounds = path.asSkiaPath().bounds
        val matrix = Matrix()
        val scaleFactor = size.width / bounds.width

        val translateOffset = Offset(-bounds.left, -bounds.top)
        val secondTranslateOffset = Offset(0f, (size.height - (scaleFactor * bounds.height)) / 2f)

        matrix.scale(scaleFactor, scaleFactor)

        path.translate(translateOffset)
        start.translate(translateOffset)
        pitroad.translate(translateOffset)
        path.transform(matrix)
        start.transform(matrix)
        pitroad.transform(matrix)

        path.translate(secondTranslateOffset)
        start.translate(secondTranslateOffset)
        pitroad.translate(secondTranslateOffset)

        measurer.setPath(path, false)
        startMeasurer.setPath(start, false)

        val startPos = startMeasurer.getPosition(startMeasurer.length * .77f)
        val points = mutableListOf<Offset>()
        for (i in 0..1000) {
            points.add(measurer.getPosition(measurer.length * (i / 1000f)))
        }
        val closestPoint = points
            .map { it to ((it.y - startPos.y) - (it.x - startPos.x)).let { it * it / it } }
            .filter { it.second > 0f }.minByOrNull { it.second }!!.first
        val pathStartFinishLinePoint = points.indexOf(closestPoint)

        val newPoints = points.subList(pathStartFinishLinePoint, points.size)
        newPoints.addAll(points.subList(0, pathStartFinishLinePoint - 1))

        drawPath(
            path = path,
            color = Color.Black,
            style = Stroke(
                width = 1f,
                join = StrokeJoin.Round,
                cap = StrokeCap.Round
            )
        )

        drawPath(
            path = start,
            color = Color.Red,
        )

        drawPath(
            path = pitroad,
            color = Color.Blue,
        )

        this.drawContext.canvas.nativeCanvas.apply {
            carPositions().forEachIndexed { index, position ->
                val rawPosition = if (isTrackClockwise) (1f - position).mod(1f) else position
                val progress = floor(newPoints.size * rawPosition).toInt()
                val offset = newPoints[progress]

                this.drawCircle(
                    x = offset.x,
                    y = offset.y,
                    radius = 5f,
                    paint = if (index == playerIdx()) playerPainter else otherPainter
                )
            }
        }
    }
}

private fun getSvgPath(resourcePath: String): String {
    val svg = NativeResourceLoader.load(resourcePath)
    val first = svg.substring(svg.indexOf(" d=") + 4)
    val path = first.split("\"")
    return path[0]
}

private fun isTrackClockwise(trackId: String): Boolean {
    val turnsSvg = NativeResourceLoader.load("/turns/$trackId.svg")
    val regexNumber = Pattern.compile(">(.*?)<")
    val regexTransform = Pattern.compile("\\((.*?)\\)")
    val textLines = turnsSvg
        .split("\n")
        .filter { it.isNotBlank() && it.startsWith("<text") }

    val turnNumbers = textLines.mapIndexed { index, el ->
        index to regexNumber.matcher(el).let {
            it.find()
            it.group(1)
        }.toIntOrNull()
    }.filterNot { it.second == null }

    val turnTransform = textLines.mapIndexed { index, el ->
        val transform = regexTransform.matcher(el).let {
            it.find()
            it.group(1)
        }.split(" ")

        index to transform.drop(if (transform.size > 2) 4 else 0).dropLast(1)
    }

    val turn1Index = turnNumbers.first { it.second == 1 }.first
    val turn2Index = turnNumbers.first { it.second == 2 }.first

    val turn1Points = turnTransform.first { it.first == turn1Index }.second
    val turn2Points = turnTransform.first { it.first == turn2Index }.second

    return turn1Points[0].toFloat() - turn2Points[0].toFloat() < 0f
}

private fun getSvgPaths(resourcePath: String): List<String> {
    val svg = NativeResourceLoader.load(resourcePath)

    val first = svg.substring(svg.indexOf(" d=") + 4)
    val path = first.split("\"")


    return path
}

class NativeResourceLoader {
    companion object {
        fun load(path: String): String {
            return NativeResourceLoader::class.java.getResourceAsStream(path)?.bufferedReader()
                .use { it?.readText().orEmpty() }
        }
    }
}