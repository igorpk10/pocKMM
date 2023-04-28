package com.igorpk.kmmpoc

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(MainScreenTexts().greet().contains("iOS"), "Check iOS is mentioned")
    }
}