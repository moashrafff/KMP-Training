package com.moashrafff.kmp.training

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.moashrafff.kmp.training.database.DBFactory


fun MainViewController() = ComposeUIViewController {
    val dao = remember {
        DBFactory().createDatabase().peopleDao()
    }
    App(remember { BatteryManager() }, dao)
}