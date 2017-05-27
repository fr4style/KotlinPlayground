package com.fflorio

/**
 * Created by francesco on 2017-05-26.
 */

fun main(args: Array<String>) {
    helloWorld()
    helloWorld(lastName = "Florio", name = "Francesco")
}


fun helloWorld(name: String = "World", lastName: String? = null) {
    var message = "Hello " + (if (lastName == null) name else "$name $lastName") + "!"
    println(message)
}