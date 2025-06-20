package com.moashrafff.kmp.training

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Kmp Training",
    ) {
        App()
    }
}