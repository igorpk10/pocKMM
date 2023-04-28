package com.igorpk.kmmpoc.android.views.friends

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.material.Text

class FriendsView : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme{
                Scaffold() {
                    Column(
                        modifier = Modifier.padding(it)
                    ) {
                        Text(text = "Friends Screen")
                    }
                }
            }
        }
    }
}