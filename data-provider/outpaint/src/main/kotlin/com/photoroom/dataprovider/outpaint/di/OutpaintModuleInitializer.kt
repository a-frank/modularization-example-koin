package com.photoroom.dataprovider.outpaint.di

import com.photoroom.dataprovider.outpaint.internal.di.OutpaintModule
import com.photoroom.util.di.ModuleInitializer
import org.koin.ksp.generated.module

class OutpaintModuleInitializer : ModuleInitializer(
    module = OutpaintModule.module,
)