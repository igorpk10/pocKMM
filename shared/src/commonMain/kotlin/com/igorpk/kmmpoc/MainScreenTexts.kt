package com.igorpk.kmmpoc

class MainScreenTexts {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun cardTitle(): String {
        return "Poc Application to test KMM"
    }

    fun cardSubTitle(): String {
        return "Developed by me"
    }

    fun buttonFriendsScreen(): String = "Navegar para a tela de amigos"
}