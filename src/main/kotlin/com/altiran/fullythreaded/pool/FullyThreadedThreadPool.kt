package com.altiran.fullythreaded.pool

import com.altiran.fullythreaded.factory.FullyThreadedThreadFactory
import java.util.concurrent.ExecutorService
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

/**
 * @author Ab20zip
 * Create a thread pool so that we don't have to create a thread every time we call the multithreading protocol.
 */
object FullyThreadedThreadPool {
    val executorPool: ExecutorService = ThreadPoolExecutor(
        0, Int.MAX_VALUE,
        60L, TimeUnit.SECONDS,
        SynchronousQueue(),
        FullyThreadedThreadFactory
    );
}
