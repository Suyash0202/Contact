package com.example.contact.Presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.contact.Prasentation.navigation.Routes

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.HomeScreen.toString()) {
        composable(Routes.HomeScreen.toString()) {
            // TODO: Implement HomeScreen Composable
        }

        composable(Routes.AddEditScreen.toString()) {
            // TODO: Implement AddEditScreen Composable
        }
    }
}

