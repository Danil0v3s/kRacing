package ui.components.dashboards.map

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.asSkiaPath
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.res.useResource
import androidx.compose.ui.unit.dp
import iracing.IRacingData

@Composable
fun MapDash(data: IRacingData) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        MapCanvas(data.session.WeekendInfo?.TrackID ?: "", Modifier.size(400.dp))
    }
}

@Composable
private fun MapCanvas(trackId: String, modifier: Modifier = Modifier) {
    val animateSize = remember { Animatable(0f) }
    LaunchedEffect(Unit) {
        animateSize.animateTo(1f,
            tween(5000, easing = LinearEasing)
        )
    }

    Canvas(modifier = modifier) {
        val trackPath = useResource("/track_images/$trackId.svg") { stream ->
            val svg = stream.bufferedReader().use { it.readText() }
            val first = svg.substring(svg.indexOf(" d=") + 4)
            val path = first.split("\"")
            path[0]
        }
        val startLinePath = useResource("/start_finish/$trackId.svg") { stream ->
            val svg = stream.bufferedReader().use { it.readText() }
            val first = svg.substring(svg.indexOf(" d=") + 4)
            val path = first.split("\"")
            path[0]
        }

        val path = PathParser().parsePathString(trackPath).toPath()
        val start = PathParser().parsePathString(startLinePath).toPath()
        path.addPath(start)
        val bounds = path.asSkiaPath().bounds
        val matrix = Matrix()
        val scaleFactor = size.width / bounds.width

        path.translate(Offset(-bounds.left, -bounds.top))
        start.translate(Offset(-bounds.left, -bounds.top))
        matrix.scale(scaleFactor, scaleFactor)
        path.transform(matrix)
        start.transform(matrix)
        path.translate(Offset(0f, (size.height - (scaleFactor * bounds.height)) / 2f))
        start.translate(Offset(0f, (size.height - (scaleFactor * bounds.height)) / 2f))

        val measurer = PathMeasure().apply { setPath(path, false) }
        path.addOval(Rect(measurer.getPosition(measurer.length * animateSize.value), 5f))

        drawPath(
            path = path,
            color = Color.Black,
        )
    }
}