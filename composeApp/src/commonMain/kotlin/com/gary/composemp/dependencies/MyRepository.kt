package com.gary.composemp.dependencies

interface MyRepository {
    fun verifyDIReturnString(): String
}

class MyRepositoryImpl(
    private val dbClient: DbClient
) : MyRepository{
    override fun verifyDIReturnString(): String {
        return "Hello World! DI verified!"
    }
}