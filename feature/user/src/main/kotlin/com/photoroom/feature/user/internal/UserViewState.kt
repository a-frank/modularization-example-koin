package com.photoroom.feature.user.internal

import com.photoroom.aggregator.userplan.model.UserPlan

data class UserViewState(
    val currentUserPlan: UserPlan
)