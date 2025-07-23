package com.photoroom.aggregator.userplan.internal

import com.photoroom.aggregator.userplan.GetUserPlanUseCase
import com.photoroom.aggregator.userplan.model.UserPlan
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import org.koin.core.annotation.Factory
import java.util.Date

@Factory
internal class GetUserPanUseCaseImpl : GetUserPlanUseCase {
    override fun invoke(): Flow<UserPlan> = flowOf(UserPlan.Pro(Date()))
}