package com.photoroom.aggregator.userplan.internal.di

import android.content.Context
import androidx.startup.Initializer
import com.photoroom.aggregator.userplan.GetUserPlanUseCase
import com.photoroom.aggregator.userplan.internal.GetUserPanUseCaseImpl
import org.koin.androix.startup.KoinInitializer
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

internal val userPlanModule = module {
    factory<GetUserPlanUseCase> { GetUserPanUseCaseImpl() }
}

internal class UserPlanModuleInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        loadKoinModules(userPlanModule)
    }

    @OptIn(KoinExperimentalAPI::class)
    override fun dependencies(): List<Class<out Initializer<*>?>?> =
        mutableListOf(KoinInitializer::class.java)
}