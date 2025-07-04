package com.moashrafff.kmp.training

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.moashrafff.kmp.training.database.DBFactory
import com.moashrafff.kmp.training.di.initKoin


fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
//    val dao = remember {
//        DBFactory().createDatabase().peopleDao()
//    }
    App(
//        remember { BatteryManager() },
        )
}