package com.igorpk.kmmpoc.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.igorpk.kmmpoc.MainScreenTexts
import com.igorpk.kmmpoc.android.views.components.CardView
import com.igorpk.kmmpoc.android.views.components.PrimaryButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Scaffold(
                ) {
                    body(paddingValues = it)
                }
            }
        }
    }
}

@Composable
fun body(paddingValues: PaddingValues) {
    val texts = MainScreenTexts()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        CardView(paddingValues = paddingValues, texts = texts)
        PrimaryButton(text = texts.buttonFriendsScreen()) {
            navigateToFriendsScreen()
        }

    }
}

private fun navigateToFriendsScreen() {

}

@Composable
@Preview
fun preview() {
    MyApplicationTheme {
        body(paddingValues = PaddingValues(horizontal = 24.dp, vertical = 24.dp))
    }
}