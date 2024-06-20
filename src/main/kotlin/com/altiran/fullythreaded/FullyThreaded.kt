package com.altiran.fullythreaded

import com.altiran.fullythreaded.strategy.MultithreadingProtocol

/**
 * Allows you to run code in separate and more efficient threads.
 */
open class FullyThreaded() {
    val multiThreading: MultithreadingProtocol = MultithreadingProtocol()
}
