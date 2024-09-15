package ui.components.dashboards.map

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.graphics.asSkiaPath
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.res.useResource
import androidx.compose.ui.text.TextLayoutInput
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import iracing.IRacingData
import iracing.LapDistPct

@Composable
fun MapDash(data: IRacingData) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        MapCanvas(data.session.WeekendInfo?.TrackID ?: "", data.LapDistPct, Modifier.size(400.dp))
    }
}

@Composable
private fun MapCanvas(trackId: String, lapPercentage: Float, modifier: Modifier = Modifier) {
    val animateSize = remember { Animatable(0f) }
    val rememberTextMeasurer = rememberTextMeasurer()

    LaunchedEffect(Unit) {
        animateSize.animateTo(
            1f,
            tween(5000, easing = LinearEasing)
        )
    }

    Canvas(modifier = modifier) {
        val trackPath = getSvgPath("/track_images/$trackId.svg")
        val startLinePath = getSvgPath("/start_finish/$trackId.svg")
//        val turnsPath = getSvgPath("/turns/$trackId.svg")
        val pitroadPath = getSvgPath("/pitroad/$trackId.svg")

        val path = PathParser().parsePathString(trackPath).toPath()
        val start = PathParser().parsePathString(startLinePath).toPath()
//        val turns = PathParser().parsePathString(turnsPath).toPath()
        val pitroad = PathParser().parsePathString(pitroadPath).toPath()

        val bounds = path.asSkiaPath().bounds
        val matrix = Matrix()
        val scaleFactor = size.width / bounds.width

        val translateOffset = Offset(-bounds.left, -bounds.top)
        val secondTranslateOffset = Offset(0f, (size.height - (scaleFactor * bounds.height)) / 2f)

        path.translate(translateOffset)
        start.translate(translateOffset)
//        turns.translate(translateOffset)
        pitroad.translate(translateOffset)

        matrix.scale(scaleFactor, scaleFactor)

        path.transform(matrix)
        start.transform(matrix)
//        turns.transform(matrix)
        pitroad.transform(matrix)

        path.translate(secondTranslateOffset)
        start.translate(secondTranslateOffset)
//        turns.translate(secondTranslateOffset)
        pitroad.translate(secondTranslateOffset)

        val measurer = PathMeasure().apply { setPath(path, false) }
//        val percentage = (0.43f - lapPercentage).mod(1f)
        val percentage = lapPercentage
        val progress = measurer.length * percentage
        path.addOval(Rect(measurer.getPosition(progress), 5f))
        drawText(rememberTextMeasurer, "$trackId -> $percentage% - $progress")

        drawPath(
            path = path,
            color = Color.Black,
        )

        drawPath(
            path = start,
            color = Color.Red,
        )

//        drawPath(
//            path = turns,
//            color = Color.Black,
//        )

        drawPath(
            path = pitroad,
            color = Color.Blue,
        )
    }
}

private fun getSvgPath(resourcePath: String): String = useResource(resourcePath) { stream ->
    val svg = stream.bufferedReader().use { it.readText() }
    val first = svg.substring(svg.indexOf(" d=") + 4)
    val path = first.split("\"")
    path[0]
}