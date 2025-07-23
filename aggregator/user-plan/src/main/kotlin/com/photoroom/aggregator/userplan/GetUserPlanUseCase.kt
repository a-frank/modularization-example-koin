package com.photoroom.aggregator.userplan

import com.photoroom.aggregator.userplan.model.UserPlan
import kotlinx.coroutines.flow.Flow

interface GetUserPlanUseCase {
    operator fun invoke(): Flow<UserPlan>
}