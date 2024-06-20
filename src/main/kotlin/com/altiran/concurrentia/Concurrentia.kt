package com.altiran.concurrentia

import com.altiran.concurrentia.strategy.MultithreadingProtocol

/**
 * Allows you to run code in separate and more efficient threads.
 */
open class Concurrentia() {
    val multiThreading: MultithreadingProtocol = MultithreadingProtocol()
}
