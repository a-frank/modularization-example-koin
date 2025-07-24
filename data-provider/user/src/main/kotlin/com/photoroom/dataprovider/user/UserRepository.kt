package com.photoroom.dataprovider.user

import com.photoroom.dataprovider.user.model.UserPlan
import kotlinx.coroutines.flow.StateFlow

interface UserRepository {
    val currentUserPlan: StateFlow<UserPlan>
}