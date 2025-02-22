package com.example.contact.Prasentation.navigation

import kotlinx.serialization.Serializable

sealed class Routes {
    @Serializable
    object HomeScreen

    @Serializable
    object AddEditScreen
}