package com.example.linkedln.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    var pesquisa by remember { mutableStateOf("") }
    Scaffold(
        topBar = {TopAppBarSample(onNameChange = {pesquisa = it})},
        content = { paddingValues ->
            ConstraintLayout(
                modifier = Modifier
                    .padding(paddingValues)

            ) {
                Text(text = "Ops")
            }
        },
        bottomBar = {
//            val navController = rememberNavController()
//            BottomNavigation(navController = navController)
        }
    )
}