package com.igorpk.kmmpoc.android.views.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.igorpk.kmmpoc.MainScreenTexts
import com.igorpk.kmmpoc.android.MyApplicationTheme
import com.igorpk.kmmpoc.android.R
import com.igorpk.kmmpoc.android.data.Friend


@Composable
fun FriendsView(modifier: Modifier, friend: Friend) {
    Column(modifier = modifier) {
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp),
                painter = painterResource(id = R.drawable.ic_person),
                contentDescription = "Icon"
            )

            Column(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(text = friend.name, fontWeight = FontWeight.Bold)
                    Text(modifier = Modifier.padding(top = 4.dp), text = friend.phoneNumber)
                }
            }
        }

        Divider(
            modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 16.dp),
            color = MaterialTheme.colorScheme.outline
        )
    }

}


@Preview
@Composable
fun FriendsDefaultPreview() {
    MyApplicationTheme {
        CardView(PaddingValues(), MainScreenTexts())
    }
}