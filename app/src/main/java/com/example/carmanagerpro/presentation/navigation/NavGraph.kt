package com.example.carmanagerpro.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.carmanagerpro.presentation.LoginScreen

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Main : Screen("main")
}

@Composable
fun NavGraph(startDestination: String = Screen.Login.route) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Login.route) {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Screen.Main.route) {
                        popUpTo(Screen.Login.route) { inclusive = true }
                    }
                }
            )
        }

        composable(Screen.Main.route) {
            androidx.compose.material3.Text("Добро пожаловать в CarManagerPro!")
        }
    }
}
