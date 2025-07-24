package com.photoroom.aggregator.aibackground.internal

import android.graphics.Bitmap
import com.photoroom.aggregator.aibackground.GenerateAiBackgroundPlanUseCase
import com.photoroom.dataprovider.outpaint.OutpaintRepository
import com.photoroom.dataprovider.user.UserRepository
import com.photoroom.dataprovider.user.model.UserPlan
import org.koin.core.annotation.Factory

@Factory
internal class GenerateAiBackgroundPanUseCaseImpl(
    private val userRepository: UserRepository,
    private val outpaintRepository: OutpaintRepository,
) : GenerateAiBackgroundPlanUseCase {
    override suspend fun invoke(source: Bitmap, prompt: String): Result<Bitmap> {
        val userPlan = userRepository.currentUserPlan.value

        return when (userPlan) {
            UserPlan.Free,
            is UserPlan.Pro -> outpaintRepository.outpaintStudio(source, prompt)

            is UserPlan.Max -> outpaintRepository.outpaintV3(source, prompt)
        }
    }
}