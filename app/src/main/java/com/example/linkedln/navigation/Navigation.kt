package com.example.linkedln.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.linkedln.presentation.components.AddPostScreen
import com.example.linkedln.presentation.components.BottomNavItem
import com.example.linkedln.presentation.components.Home
import com.example.linkedln.presentation.components.JobScreen
import com.example.linkedln.presentation.components.NetworkScreen
import com.example.linkedln.presentation.components.NotificationScreen


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route) {
        composable(BottomNavItem.Home.screen_route) {
            Home()
        }
        composable(BottomNavItem.MyNetwork.screen_route) {
            NetworkScreen()
        }
        composable(BottomNavItem.AddPost.screen_route) {
            AddPostScreen()
        }
        composable(BottomNavItem.Notification.screen_route) {
            NotificationScreen()
        }
        composable(BottomNavItem.Jobs.screen_route) {
            JobScreen()
        }
    }
}