package com.photoroom.feature.user.internal.di

import com.photoroom.util.di.ModuleInitializer
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.ksp.generated.module

@Module
@ComponentScan
internal object UserModule

internal class UserModuleInitializer : ModuleInitializer(
    module = UserModule.module
)