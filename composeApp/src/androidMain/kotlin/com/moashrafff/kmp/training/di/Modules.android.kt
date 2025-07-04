package com.moashrafff.kmp.training.di

import androidx.lifecycle.ViewModel
import com.moashrafff.kmp.training.dependencies.DbClient
import com.moashrafff.kmp.training.dependencies.MyViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)

}