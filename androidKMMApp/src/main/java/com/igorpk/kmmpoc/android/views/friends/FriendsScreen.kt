package com.igorpk.kmmpoc.android.views.friends

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.igorpk.kmmpoc.android.viewmodels.FriendsViewModel
import com.igorpk.kmmpoc.android.views.components.FriendsView


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FriendsScreen(
    viewModel: FriendsViewModel = viewModel(),
    popUp: () -> Unit
) {
    val list = viewModel.friendList.observeAsState(initial = listOf())

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Friends Screen", color = MaterialTheme.colorScheme.primary)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        popUp.invoke()
                    }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            "Back Button",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.onBackground)

            )
        }
    ) {
        LaunchedEffect(key1 = Unit) {
            viewModel.fetchFriends()
        }

        Column(
            modifier = Modifier
                .padding(it)
                .background(MaterialTheme.colorScheme.onBackground)
                .fillMaxWidth(),
        ) {
            Text(text = "Friends Screen")

            LazyColumn(modifier = Modifier.padding(top = 16.dp), state = rememberLazyListState()) {
                items(list.value.size) { item ->
                    FriendsView(list.value[item])
                }
            }
        }

    }
}
