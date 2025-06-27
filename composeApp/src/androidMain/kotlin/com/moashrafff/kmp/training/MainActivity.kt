package com.moashrafff.kmp.training

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import com.moashrafff.kmp.training.database.DBFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        val dao =  DBFactory(applicationContext).createDatabase().peopleDao()

        setContent {
            App(batteryManager = remember { BatteryManager(applicationContext) }, peopleDao = dao)
        }
    }
}