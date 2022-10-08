package pinkbunny.design.android.wear.theme

import androidx.compose.runtime.Composable
import androidx.wear.compose.material.MaterialTheme

@Composable
fun PinkBunnyAndroidWearTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = wearColorPalette,
        typography = Typography,
        content = content
    )
}
