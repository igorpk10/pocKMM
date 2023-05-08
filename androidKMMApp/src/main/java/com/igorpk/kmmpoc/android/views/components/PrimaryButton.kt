package com.igorpk.kmmpoc.android.views.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.igorpk.kmmpoc.MainScreenTexts
import com.igorpk.kmmpoc.android.MyApplicationTheme

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.onBackground),
        onClick = onClick
    ) {
        Text(
            modifier = Modifier.padding(8.dp),
            text = text
        )
    }
}

@Preview
@Composable
fun PrimaryButtonDefaultPreview() {
    MyApplicationTheme {
        PrimaryButton("Primary Button"){
            //Nothing
        }
    }
}