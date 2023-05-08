package com.igorpk.kmmpoc.android.views.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.igorpk.kmmpoc.MainScreenTexts
import com.igorpk.kmmpoc.android.MyApplicationTheme
import com.igorpk.kmmpoc.android.data.Friend


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FriendsView(friend: Friend) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onBackground)

    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            GlideImage(
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp),
                model = friend.pictureURL,
                contentDescription = "Friend Person"
            )
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = friend.name)
                Text(text = friend.phoneNumber)
            }
        }
    }
}


@Preview
@Composable
fun FriendsDefaultPreview() {
    MyApplicationTheme {
        CardView(PaddingValues(), MainScreenTexts())
    }
}