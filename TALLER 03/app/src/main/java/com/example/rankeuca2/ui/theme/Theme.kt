package com.example.rankeuca2.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary              = Teal600,
    onPrimary            = White,
    primaryContainer     = LightSurf,
    onPrimaryContainer   = TealDark,

    secondary            = TealDark,
    onSecondary          = White,
    secondaryContainer   = LightSurf,
    onSecondaryContainer = Dark,

    background           = White,
    onBackground         = Black,

    surface              = OffWhite,
    onSurface            = Black,
    surfaceVariant       = LightSurf,
    onSurfaceVariant     = TealDark,
    surfaceContainerLowest = OffWhite,

    error                = Color(0xFFB00020),
    onError              = White,

    outline              = Teal400,
)

private val DarkColors = darkColorScheme(
    primary              = Teal400,
    onPrimary            = Dark,
    primaryContainer     = Teal800,
    onPrimaryContainer   = OffWhite,

    secondary            = Teal200,
    onSecondary          = Dark,
    secondaryContainer   = TealDark,
    onSecondaryContainer = OffWhite,

    background           = Black,
    onBackground         = White,

    surface              = DarkCard,
    onSurface            = White,
    surfaceVariant       = DarkSurf,
    onSurfaceVariant     = Teal200,
    surfaceContainerLowest = Dark,

    error                = Color(0xFFCF6679),
    onError              = Dark,

    outline              = Teal800,
)

@Composable
fun RankeUca2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColors else LightColors

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view)
                .isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography  = Typography,
        content     = content
    )
}