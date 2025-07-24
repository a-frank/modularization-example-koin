package com.photoroom.dataprovider.outpaint.internal.remote

import android.graphics.Bitmap
import androidx.core.graphics.createBitmap
import kotlinx.coroutines.delay
import org.koin.core.annotation.Single

@Single
internal class OutpaintRemoteDataSource {
    suspend fun outpaintStudio(source: Bitmap, prompt: String): Result<Bitmap> {
        // do network call
        delay(1_000)
        return Result.success(createBitmap(100, 100))
    }

    suspend fun outpaintV3(source: Bitmap, prompt: String): Result<Bitmap> {
        // do network call
        delay(1_000)
        return Result.success(createBitmap(100, 100))
    }
}