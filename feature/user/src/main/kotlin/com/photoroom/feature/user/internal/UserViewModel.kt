package com.photoroom.feature.user.internal

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.photoroom.aggregator.userplan.GetUserPlanUseCase
import com.photoroom.aggregator.userplan.model.UserPlan
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class UserViewModel(
    getUserPlanUseCase: GetUserPlanUseCase
) : ViewModel() {

    val state = getUserPlanUseCase()
        .map { UserViewState(it) }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = UserViewState(UserPlan.Free)
        )

}