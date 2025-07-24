package com.photoroom.util.di

import android.annotation.SuppressLint
import android.content.Context
import androidx.startup.Initializer
import org.koin.androix.startup.KoinInitializer
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module

@SuppressLint("EnsureInitializerNoArgConstr")
abstract class ModuleInitializer(
    private val module: Module,
    private val dependencies: List<Class<out Initializer<Unit>>> = emptyList(),
) : Initializer<Unit> {
    override fun create(context: Context) {
        loadKoinModules(module)
    }

    @OptIn(KoinExperimentalAPI::class)
    override fun dependencies(): List<Class<out Initializer<*>?>?> =
        mutableListOf(
            KoinInitializer::class.java,
            *dependencies.toTypedArray()
        )
}