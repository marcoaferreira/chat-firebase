package com.pedromoura.chatfirebase.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class Screen(val route: String) {
    object Login: Screen("Login")
    object Chat: Screen("chat")
}

@Composable
fun NavGraph(startDestination: String = Screen.Login.route) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {

        composable(Screen.Login.route){ /* chamar a screen de login */}
        composable(Screen.Chat.route){/* chamar a screen de chat */}

    }
}