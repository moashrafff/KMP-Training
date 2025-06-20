package com.moashrafff.kmp.training

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform