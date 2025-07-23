package org.koin.ksp.generated

import org.koin.core.module.Module
import org.koin.dsl.*

import org.koin.meta.annotations.ExternalDefinition
import org.koin.core.definition.KoinDefinition
@ExternalDefinition("com.photoroom.aggregator.userplan.internal")
public fun Module.defineComPhotoroomAggregatorUserplanInternalGetUserPanUseCaseImpl() : Unit { factory() { _ -> com.photoroom.aggregator.userplan.internal.GetUserPanUseCaseImpl() } bind(com.photoroom.aggregator.userplan.GetUserPlanUseCase::class) }

public val _defaultModule : Module get() = module {
	defineComPhotoroomAggregatorUserplanInternalGetUserPanUseCaseImpl()
}
public val defaultModule : org.koin.core.module.Module get() = _defaultModule
public fun org.koin.core.KoinApplication.defaultModule(): org.koin.core.KoinApplication = modules(defaultModule)
