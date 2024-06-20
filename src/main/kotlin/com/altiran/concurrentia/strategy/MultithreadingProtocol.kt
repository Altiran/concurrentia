package com.altiran.concurrentia.strategy

import com.altiran.concurrentia.exceptions.MaxThreadsExceededException
import com.altiran.concurrentia.pool.ConcurrentiaThreadPool
import java.util.concurrent.ThreadPoolExecutor

/**
 * Contains the core multithreading protocol.
 */
class MultithreadingProtocol {
    fun run(r: Runnable) {
        try {
            ConcurrentiaThreadPool.executorPool.execute(r)
        } catch (e: Exception) {
            throw MaxThreadsExceededException(e)
        }
    }

    fun getTotalRunningThreads(): Int {
        return (ConcurrentiaThreadPool.executorPool as ThreadPoolExecutor).activeCount
    }
}
