package com.moashrafff.kmp.training

import android.app.Application
import com.moashrafff.kmp.training.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApplication)
        }
    }
}