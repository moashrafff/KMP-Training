package com.moashrafff.kmp.training

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kmptraining.composeapp.generated.resources.Res
import kmptraining.composeapp.generated.resources.hello_world
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    batteryManager: BatteryManager
) {
    MaterialTheme {
        Column (modifier = Modifier.fillMaxSize()) {
            Text(
                text = "The current battery level is ${batteryManager.getBatteryLevel()}%"
            )
            Text(
                text = stringResource(Res.string.hello_world)
            )
        }
    }
}