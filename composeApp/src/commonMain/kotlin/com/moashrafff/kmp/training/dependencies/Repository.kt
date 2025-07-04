package com.moashrafff.kmp.training.dependencies

interface Repository {
    fun helloWorld() : String
}

class RepositoryImpl(
    private val dbClient: DbClient
) : Repository {
    override fun helloWorld(): String = "Hello World!"
}