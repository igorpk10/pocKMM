package com.igorpk.kmmpoc

class MainScreenTexts {
    private val platform: Platform = getPlatform()

    fun screenName(): String = "Home"

    fun greet(): String = "Hello, ${platform.name}!"

    fun cardText(): String = "Poc Application to test KMM"

    fun buttonFriendsScreen(): String = "Navegar para a tela de amigos"
}