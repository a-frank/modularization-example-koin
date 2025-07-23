package com.photoroom.feature.user.internal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.photoroom.aggregator.userplan.model.UserPlan

@Composable
internal fun UserScreen(viewModel: UserViewModel) {
    val state by viewModel.state.collectAsStateWithLifecycle()


    UserLayout(state.currentUserPlan)
}

@Composable
private fun UserLayout(userPlan: UserPlan) {
    Column(
        modifier = Modifier.padding(32.dp)
    ) {

        Text("Hello User")
        Spacer(modifier = Modifier.size(16.dp))
        Text("You are currently on the $userPlan Plan")
    }
}