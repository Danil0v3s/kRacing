package ui.components.dashboards.map

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.asSkiaPath
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import iracing.CarIdxLapDistPct
import iracing.CarIdxPosition
import iracing.IRacingData
import iracing.PlayerCarIdx
import repository.GameDataRepository
import ui.components.Cell
import ui.components.grid.GridPad
import ui.components.grid.GridPadCells
import java.util.regex.Pattern
import kotlin.math.floor

class DashViewModel : ViewModel() {

    private val filters = listOf("CarIdxLapDistPct", "PlayerCarIdx", "CarIdxPosition")
    val telemetry = GameDataRepository.telemetry(filters)
    val sessionData = GameDataRepository.session()

}

@Composable
fun MapDash(viewModel: DashViewModel = viewModel()) {
    val telemetryData = viewModel.telemetry.collectAsState(IRacingData.Disconnected)
    val sessionData = viewModel.sessionData.collectAsState(IRacingData.Disconnected)

    val weekendInfo by remember {
        derivedStateOf {
            when (val data = sessionData.value) {
                is IRacingData.Session -> data.session.WeekendInfo
                else -> null
            }
        }
    }
    val telemetry by remember {
        derivedStateOf {
            when (val data = telemetryData.value) {
                is IRacingData.Telemetry -> data
                else -> null
            }
        }
    }

    if (weekendInfo == null || telemetry == null) {
        return
    }

    Content(
        trackId = { weekendInfo!!.TrackID },
        trackTitle = { weekendInfo!!.TrackDisplayShortName },
        carPositions = {
            telemetry!!.CarIdxLapDistPct.split(",").map { pctString ->
                (pctString.toFloatOrNull() ?: 0f).coerceAtLeast(0f)
            }
        },
        carStandings = {
            telemetry!!.CarIdxPosition.split(",").map { pctString ->
                (pctString.toIntOrNull() ?: 0).coerceAtLeast(0)
            }
        },
        playerIdx = { telemetry!!.PlayerCarIdx },
        modifier = Modifier.fillMaxSize()
    )

}

@Composable
private fun Content(
    trackId: () -> String,
    trackTitle: () -> String,
    carPositions: () -> List<Float>,
    playerIdx: () -> Int,
    carStandings: () -> List<Int>,
    modifier: Modifier = Modifier,
) {
    GridPad(
        cells = GridPadCells(rowCount = 5, columnCount = 5),
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {
        item(row = 0, column = 0, rowSpan = 3, columnSpan = 2) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
                    .padding(4.dp)
            ) {

                Box(
                    modifier = modifier
                        .fillMaxSize()
                        .align(Alignment.Center)
                        .border(BorderStroke(2.dp, Color.White))
                )

                Text(
                    text = trackTitle(),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight(450),
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .background(Color.Black)
                        .padding(horizontal = 6.dp)
                        .offset(y = (-4).dp)
                )

                MapCanvas(
                    trackId = trackId,
                    carPositions = carPositions,
                    playerIdx = playerIdx,
                    carStandings = carStandings,
                    modifier = Modifier.align(Alignment.Center).width(200.dp)
                )
            }
        }

        item(row = 0, column = 2, rowSpan = 3, columnSpan = 1) {
            Cell(content = "N", fontSize = 128.sp, modifier = Modifier.background(Color.Red))
        }

        item(row = 0, column = 3) {
            Cell("Speed", content = "0")
        }

        item(row = 0, column = 4) {
            Cell("ABS") {

            }
        }

        item(row = 1, column = 3, columnSpan = 2) {
            Cell(title = "Lap Time", content = "0:00.000")
        }

        item(row = 2, column = 3) {
            Cell(title = "Lap Delta", content = "0:00.000")
        }

        item(row = 2, column = 4) {
            Cell(title = "Opt Time", content = "0:00.000")
        }

        item(row = 3, column = 0, columnSpan = 3, rowSpan = 2) {
            Cell("Relatives") {

            }
        }

        item(row = 3, column = 3) {
            Cell(title = "Brake Bias", content = "4.32")
        }

        item(row = 3, column = 4) {
            Cell(title = "Fuel", content = "4L")
        }

        item(row = 4, column = 3) {
            Cell(title = "Position", content = "1")
        }

        item(row = 4, column = 4) {
            Cell(title = "Fuel", content = "4L")
        }
    }
}

@Composable
private fun MapCanvas(
    trackId: () -> String,
    carPositions: () -> List<Float>,
    playerIdx: () -> Int,
    carStandings: () -> List<Int>,
    modifier: Modifier = Modifier
) {
    val playerPainter = remember { Paint().asFrameworkPaint().apply { color = Color.Green.toArgb() } }
    val otherPainter = remember { Paint().asFrameworkPaint().apply { color = Color.Blue.toArgb() } }
    val aheadPainter = remember { Paint().asFrameworkPaint().apply { color = Color.Red.toArgb() } }
    val behindPainter = remember { Paint().asFrameworkPaint().apply { color = Color.White.toArgb() } }

    val trackPath = remember(trackId()) { getSvgPath("/track_images/${trackId()}.svg") }
    val startLinePath = remember(trackId()) { getSvgPath("/start_finish/${trackId()}.svg") }
    val pitroadPath = remember(trackId()) { getSvgPath("/pitroad/${trackId()}.svg") }
    val isTrackClockwise = remember(trackId()) { isTrackClockwise(trackId()) }

    val path = remember(trackId()) { PathParser().parsePathString(trackPath).toPath() }
    val start = remember(trackId()) { PathParser().parsePathString(startLinePath).toPath() }
    val pitroad = remember(trackId()) { PathParser().parsePathString(pitroadPath).toPath() }

    val measurer = remember(trackId()) { PathMeasure().apply { setPath(path, false) } }
    val startMeasurer = remember(trackId()) { PathMeasure().apply { setPath(start, false) } }

    val newPoints = remember { mutableStateOf<List<Offset>>(emptyList()) }
    val size = remember { mutableStateOf(Size.Zero) }

    LaunchedEffect(trackId(), size) {
        val bounds = path.asSkiaPath().bounds
        val matrix = Matrix()
        val scaleFactor = size.value.width / bounds.width

        val translateOffset = Offset(-bounds.left, -bounds.top)
        val secondTranslateOffset = Offset(0f, (size.value.height - (scaleFactor * bounds.height)) / 2f)

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

        val np = points.subList(pathStartFinishLinePoint, points.size)
        np.addAll(points.subList(0, pathStartFinishLinePoint - 1))

        newPoints.value = np
    }

    Canvas(modifier = modifier.onSizeChanged {
        size.value = it.toSize()
    }) {
        drawPath(
            path = path,
            color = Color.White,
            style = Stroke(
                width = 1f,
                join = StrokeJoin.Round,
                cap = StrokeCap.Round
            )
        )

        drawPath(
            path = start,
            color = Color.Cyan,
        )

        drawPath(
            path = pitroad,
            color = Color.Cyan,
        )

        if (newPoints.value.isEmpty()) {
            return@Canvas
        }

        this.drawContext.canvas.nativeCanvas.apply {
            val standings = carStandings()
            val player = playerIdx()
            val style = TextStyle(color = Color.Black)
            carPositions().forEachIndexed { index, position ->
                val rawPosition = if (isTrackClockwise) (1f - position).mod(1f) else position
                val progress = floor(newPoints.value.size * rawPosition).toInt()
                val offset = newPoints.value[progress]
                val playerStanding = standings[player]
                val standing = standings[index]

                this.drawCircle(
                    x = offset.x,
                    y = offset.y,
                    radius = 8f,
                    paint = when {
                        index == player -> playerPainter
                        index != player -> {
                            if (standing > playerStanding) {
                                aheadPainter
                            } else {
                                behindPainter
                            }
                        }

                        else -> otherPainter
                    }
                )

//                this@Canvas.drawText(
//                    textMeasurer = textMeasurer,
//                    text = standing.toString(),
//                    topLeft = Offset(offset.x - 4, offset.y-9),
//                    style = style
//                )
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