package com.igorpk.kmmpoc.android

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {

        darkColorScheme(
            primary = Color(241, 246, 249),
            inversePrimary = Color(155, 164, 181),
            secondary = Color(57, 72, 103),
            background = Color(33, 42, 62),
            onBackground = Color(155, 164, 181),
        )
    } else {
        lightColorScheme(
            primary = Color(246, 241, 241),
            inversePrimary = Color(20, 108, 148),
            secondary = Color(175, 211, 226),
            background = Color(246, 241, 241),
            onBackground = Color(25, 167, 206),
        )
    }
    val typography = Typography(
        displayMedium = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    )
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(10.dp)
    )

    MaterialTheme(
        colorScheme = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
