package com.photoroom.feature.user.internal.di

import android.content.Context
import androidx.startup.Initializer
import org.koin.androix.startup.KoinInitializer
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.core.annotation.Module
import org.koin.core.context.loadKoinModules
import org.koin.ksp.generated.module
import kotlin.jvm.java

@Module
@ComponentScan
internal object UserModule

internal class UserModuleInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        loadKoinModules(UserModule.module)
    }

    @OptIn(KoinExperimentalAPI::class)
    override fun dependencies(): List<Class<out Initializer<*>?>?> =
        mutableListOf(KoinInitializer::class.java)

}