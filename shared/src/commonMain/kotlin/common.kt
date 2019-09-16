package com.example

expect fun platformName(): String

class Greeting {
    fun greeting(): String = "Hello ${platformName()}"
}