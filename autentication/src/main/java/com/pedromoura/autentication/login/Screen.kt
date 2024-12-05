package com.pedromoura.autentication.login

sealed class Screen(val route: String) {
    object Chat: Screen("chat")
}