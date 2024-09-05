package com.zancada.core.presentation.designsystem

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

val DarkColorScheme = darkColorScheme(
    primary = ZancadaGreen,
    background = ZancadaBlack,
    surface = ZancadaDarkGray,
    secondary = ZancadaWhite,
    tertiary = ZancadaWhite,
    primaryContainer = ZancadaGreen30,
    onPrimary = ZancadaBlack,
    onBackground = ZancadaWhite,
    onSurface = ZancadaWhite,
    onSurfaceVariant = ZancadaGray,
    error = ZancadaDarkRed,
)

@Composable
fun ZancadaTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}