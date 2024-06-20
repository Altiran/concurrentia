package com.altiran.concurrentia.factory

import java.util.concurrent.ThreadFactory
import java.util.concurrent.atomic.AtomicInteger

/**
 * All the threads that are used to achieve multithreading are created in this class.
 * Supporting class for the thread pool.
 */
object ConcurrentiaThreadFactory : ThreadFactory {
    private var counter: AtomicInteger = AtomicInteger(1)

    override fun newThread(r: Runnable): Thread {
        return Thread(r, String.format("Concurrentia Thread %s", counter.incrementAndGet()))
    }
}
