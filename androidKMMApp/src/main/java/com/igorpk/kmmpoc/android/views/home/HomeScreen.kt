package com.igorpk.kmmpoc.android.views.home


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.igorpk.kmmpoc.MainScreenTexts
import com.igorpk.kmmpoc.android.MyApplicationTheme
import com.igorpk.kmmpoc.android.views.components.CardView
import com.igorpk.kmmpoc.android.views.components.PrimaryButton


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToFriends: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Home", color = MaterialTheme.colorScheme.primary)
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.onBackground)

            )
        }

    ) {
        body(paddingValues = it, onNavigateToFriends)
    }

}

@Composable
fun body(paddingValues: PaddingValues, onNavigateToFriends: () -> Unit) {

    val texts = MainScreenTexts()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        CardView(paddingValues = paddingValues, texts = texts)
        PrimaryButton(text = texts.buttonFriendsScreen(), onNavigateToFriends)
    }
}

@Composable
@Preview
fun preview() {
    MyApplicationTheme {
        body(
            paddingValues = PaddingValues(horizontal = 24.dp, vertical = 24.dp),
            onNavigateToFriends = {

            }
        )
    }
}