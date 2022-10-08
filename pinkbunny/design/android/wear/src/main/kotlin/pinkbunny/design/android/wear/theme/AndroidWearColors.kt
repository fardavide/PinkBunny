@file:Suppress("MagicNumber")
package pinkbunny.design.android.wear.theme

import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.Colors
import pinkbunny.design.android.theme.Purple200
import pinkbunny.design.android.theme.Purple700
import pinkbunny.design.android.theme.Red400
import pinkbunny.design.android.theme.Teal200

internal val wearColorPalette: Colors = Colors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200,
    secondaryVariant = Teal200,
    error = Red400,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onError = Color.Black
)
