package com.photoroom.dataprovider.user.internal

import com.photoroom.dataprovider.user.UserRepository
import com.photoroom.dataprovider.user.model.UserPlan
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.koin.core.annotation.Single

@Single
internal class UserRepositoryImpl : UserRepository {

    private val currentUserPlanState = MutableStateFlow<UserPlan>(UserPlan.Free)

    override val currentUserPlan: StateFlow<UserPlan>
        get() = currentUserPlanState.asStateFlow()
}