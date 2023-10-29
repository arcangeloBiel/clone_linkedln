@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.linkedln

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.compose.rememberNavController
import com.example.linkedln.navigation.NavigationGraph
import com.example.linkedln.presentation.components.BottomNavigation
import com.example.linkedln.presentation.home.Home
import com.example.linkedln.ui.theme.LinkedlnTheme
import com.google.firebase.FirebaseApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            FirebaseApp.initializeApp(this)
            LinkedlnTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    // NavigationGraph(navController = navController)
                }
                MainScreenView()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreenView() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            NavigationGraph(navController = navController)
        },
        content = { paddingValues ->
            ConstraintLayout(
                modifier = Modifier
                    .padding(paddingValues)

            ) {
              Home()
            }
        },
        bottomBar = { BottomNavigation(navController = navController) },

        )
}
