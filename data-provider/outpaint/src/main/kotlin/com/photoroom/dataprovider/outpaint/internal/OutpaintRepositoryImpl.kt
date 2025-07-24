package com.photoroom.dataprovider.outpaint.internal

import android.graphics.Bitmap
import com.photoroom.dataprovider.outpaint.OutpaintRepository
import com.photoroom.dataprovider.outpaint.internal.local.OutpaintLocalDataSource
import com.photoroom.dataprovider.outpaint.internal.remote.OutpaintRemoteDataSource
import org.koin.core.annotation.Single

@Single
internal class OutpaintRepositoryImpl(
    private val remoteDataSource: OutpaintRemoteDataSource,
    private val localDataSource: OutpaintLocalDataSource,
) : OutpaintRepository {
    override suspend fun outpaintStudio(source: Bitmap, prompt: String): Result<Bitmap> =
        localDataSource.getImageForStudio(source, prompt)
            ?.let { return Result.success(it) }
            ?: remoteDataSource.outpaintStudio(source, prompt)
                .onSuccess {
                    localDataSource.saveImageForStudio(source, prompt, it)
                }

    override suspend fun outpaintV3(
        source: Bitmap,
        prompt: String
    ): Result<Bitmap> = remoteDataSource.outpaintV3(source, prompt)
}