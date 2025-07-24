package com.photoroom.dataprovider.outpaint.internal.local

import android.graphics.Bitmap
import org.koin.core.annotation.Single

@Single
internal class OutpaintLocalDataSource {
    fun getImageForStudio(source: Bitmap, string: String): Bitmap? {
        // search cached image
        return null
    }

    fun saveImageForStudio(source: Bitmap, prompt: String, result: Bitmap) {
        // cache image
    }
}