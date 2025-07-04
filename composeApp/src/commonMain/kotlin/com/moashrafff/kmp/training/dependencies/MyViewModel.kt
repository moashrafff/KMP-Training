package com.moashrafff.kmp.training.dependencies

import androidx.lifecycle.ViewModel

class MyViewModel(private val repository: Repository) : ViewModel() {
    fun getHelloWorld() = repository.helloWorld()
}