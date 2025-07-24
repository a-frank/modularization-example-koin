package com.photoroom.aggregator.aibackground.internal.di

import com.photoroom.dataprovider.outpaint.di.OutpaintModuleInitializer
import com.photoroom.dataprovider.user.di.UserModuleInitializer
import com.photoroom.util.di.ModuleInitializer
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.ksp.generated.module

@Module
@ComponentScan("com.photoroom.aggregator.aibackground")
internal object AiBackgroundModule

internal class AiBackgroundModuleInitializer : ModuleInitializer(
    module = AiBackgroundModule.module,
    dependencies = listOf(
        OutpaintModuleInitializer::class.java,
        UserModuleInitializer::class.java
    )
)