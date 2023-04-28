package com.igorpk.kmmpoc.android.views.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.igorpk.kmmpoc.MainScreenTexts
import com.igorpk.kmmpoc.android.MyApplicationTheme

@Composable
fun CardView(paddingValues: PaddingValues, texts: MainScreenTexts) {
    Card(modifier = Modifier
        .padding(paddingValues)
        .fillMaxWidth(),
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.primaryVariant,
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = texts.cardTitle())
            Text(text = texts.cardSubTitle())
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        CardView(PaddingValues(), MainScreenTexts())
    }
}
