package com.photoroom.feature.user

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.photoroom.feature.user.internal.UserScreen
import org.koin.androidx.compose.koinViewModel

const val USER_GRAPH = "user"

fun NavGraphBuilder.attachUserGraph() {
    this.navigation("user-home", "user") {
        composable("user-home") {
            UserScreen(viewModel = koinViewModel())
        }
    }
}