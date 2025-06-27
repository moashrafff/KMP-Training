package com.moashrafff.kmp.training.database


expect class DBFactory {
    fun createDatabase(): PeopleDatabase
}