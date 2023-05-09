package com.igorpk.kmmpoc.android.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.igorpk.kmmpoc.MainScreenTexts
import com.igorpk.kmmpoc.android.MyApplicationTheme

@Composable
fun CardView(paddingValues: PaddingValues, texts: MainScreenTexts) {
    Card(modifier = Modifier
        .padding(paddingValues)
        .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onBackground),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = texts.cardText(), color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview
@Composable
fun CardDefaultPreview() {
    MyApplicationTheme {
        CardView(PaddingValues(), MainScreenTexts())
    }
}
