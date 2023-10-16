package com.example.linkedln.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.linkedln.presentation.components.Home


@Composable
fun NavGraphHost(navController: NavHostController, starDest: String) {
    NavHost(navController = navController, startDestination = starDest) {
        composable(route = "Home") {
            Home(navController = navController)
        }

    }
}