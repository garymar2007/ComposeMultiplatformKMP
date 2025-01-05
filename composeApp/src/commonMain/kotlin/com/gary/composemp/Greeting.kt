package com.gary.composemp

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}

// Example of a DI
interface MyRepository

class ProductionRepository: MyRepository

class DevRepository: MyRepository

class MyService (
    private val repository: MyRepository,
    private val platform: String
) {
    fun getRepository(): MyRepository =
        when(platform) {
            "Production" -> ProductionRepository()
            else -> DevRepository()
        }
}