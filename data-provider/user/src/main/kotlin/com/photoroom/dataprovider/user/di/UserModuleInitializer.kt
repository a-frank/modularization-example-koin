package com.photoroom.dataprovider.user.di

import com.photoroom.dataprovider.user.internal.di.UserModule
import com.photoroom.util.di.ModuleInitializer
import org.koin.ksp.generated.module

class UserModuleInitializer : ModuleInitializer(
    module = UserModule.module,
)