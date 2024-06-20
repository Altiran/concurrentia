package com.altiran.fullythreaded.factory

import java.util.concurrent.ThreadFactory
import java.util.concurrent.atomic.AtomicInteger

/**
 * All the threads that are used to achieve multithreading are created in this class.
 * Supporting class for ThreadPool
 */
object FullyThreadedThreadFactory : ThreadFactory {
    private var counter: AtomicInteger = AtomicInteger(1)

    override fun newThread(r: Runnable): Thread {
        return Thread(r, String.format("Fully Threaded Thread %s", counter.incrementAndGet()))
    }
}
