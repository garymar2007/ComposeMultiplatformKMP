package com.gary.composemp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform