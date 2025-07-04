package com.moashrafff.kmp.training.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.moashrafff.kmp.training.dependencies.MyViewModel
import com.moashrafff.kmp.training.dependencies.Repository
import com.moashrafff.kmp.training.dependencies.RepositoryImpl
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule : Module

val sharedModule = module {
    singleOf(::RepositoryImpl).bind<Repository>()
    viewModel { MyViewModel(get()) }

}