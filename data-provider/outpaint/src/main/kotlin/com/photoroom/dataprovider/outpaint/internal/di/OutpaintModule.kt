package com.photoroom.dataprovider.outpaint.internal.di

import android.content.Context
import androidx.startup.Initializer
import org.koin.androix.startup.KoinInitializer
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.core.annotation.Module
import org.koin.core.context.loadKoinModules
import org.koin.ksp.generated.module

@Module
@ComponentScan("com.photoroom.dataprovider.outpaint")
internal object OutpaintModule

