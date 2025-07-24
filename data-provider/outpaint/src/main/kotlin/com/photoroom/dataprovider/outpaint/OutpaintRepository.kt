package com.photoroom.dataprovider.outpaint

import android.graphics.Bitmap

interface OutpaintRepository {
    suspend fun outpaintStudio(source: Bitmap, prompt: String): Result<Bitmap>
    suspend fun outpaintV3(source: Bitmap, prompt: String): Result<Bitmap>

}