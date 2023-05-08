package com.igorpk.kmmpoc.android

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.igorpk.kmmpoc.android.views.friends.FriendsScreen
import com.igorpk.kmmpoc.android.views.home.HomeScreen

@Composable
fun KMMPocApp(
) {
    PocNavHost()
}

@Composable
fun PocNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onNavigateToFriends = {
                    navController.navigate("friends")
                },
            )
        }

        composable("friends") {
            FriendsScreen(){
                navController.popBackStack()
            }
        }
    }

}