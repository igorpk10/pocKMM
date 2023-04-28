package com.igorpk.kmmpoc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform