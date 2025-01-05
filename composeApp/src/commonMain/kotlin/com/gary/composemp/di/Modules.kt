package com.gary.composemp.di

import com.gary.composemp.dependencies.MyRepository
import com.gary.composemp.dependencies.MyRepositoryImpl
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
}