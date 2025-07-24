package com.photoroom.aggregator.aibackground

import android.graphics.Bitmap

interface GenerateAiBackgroundPlanUseCase {
    suspend operator fun invoke(source: Bitmap, prompt: String): Result<Bitmap>
}