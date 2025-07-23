package org.koin.ksp.generated

import org.koin.core.module.Module
import org.koin.dsl.*
import org.koin.core.module.dsl.viewModel
import org.koin.meta.annotations.ExternalDefinition
import org.koin.core.definition.KoinDefinition
@ExternalDefinition("com.photoroom.feature.user.internal")
public fun Module.defineComPhotoroomFeatureUserInternalUserViewModel() : Unit { viewModel() { _ -> com.photoroom.feature.user.internal.UserViewModel(getUserPlanUseCase=get()) }  }

public val _defaultModule : Module get() = module {
	defineComPhotoroomFeatureUserInternalUserViewModel()
}
public val defaultModule : org.koin.core.module.Module get() = _defaultModule
public fun org.koin.core.KoinApplication.defaultModule(): org.koin.core.KoinApplication = modules(defaultModule)
