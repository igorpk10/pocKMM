package com.igorpk.kmmpoc

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(MainScreenTexts().greet().contains("Hello"), "Check 'Hello' is mentioned")
    }
}