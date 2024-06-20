package com.altiran.concurrentia

import kotlinx.coroutines.*
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.lang.Runnable

@ExperimentalCoroutinesApi
class MultithreadingTest {
    @Test
    @OptIn(DelicateCoroutinesApi::class)
    @DisplayName("Asynchronous execution")
    fun testRunExecutesAsync() = runTest {
        val protocol = Concurrentia().multiThreading
        var counter = 0

        val runnable = Runnable {
            GlobalScope.launch {
                delay(1000)
                counter++
            }
        }

        protocol.run(runnable)

        // Check counter immediately after calling run
        assertEquals(0, counter, "Runnable should not have executed yet")

        // Give some time for the runnable to execute
        runBlocking { delay(2000) }

        assertEquals(1, counter, "Runnable should have executed by now")
    }

    @Test
    @DisplayName("Total running threads count")
    fun testGetTotalRunningThreadsReturnsCorrectCount() = runTest {
        val protocol = Concurrentia().multiThreading
        var counter = 0

        val runnable = Runnable {
            for (i in 1..Integer.MAX_VALUE) {
                counter++
            }
        }

        // Start 5 threads
        for (i in 1..5) {
            protocol.run(runnable)
        }

        // Give some time for the threads to start
        delay(1000)

        assertEquals(5, protocol.getTotalRunningThreads())
    }
}
