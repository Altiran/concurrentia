package com.altiran.fullythreaded.strategy

import com.altiran.fullythreaded.exceptions.MaxThreadsExceededException
import com.altiran.fullythreaded.pool.FullyThreadedThreadPool
import java.util.concurrent.ThreadPoolExecutor

/**
 * Contains the core multithreading protocol.
 */
class MultithreadingProtocol {
    fun run(r: Runnable) {
        try {
            FullyThreadedThreadPool.executorPool.execute(r)
        } catch (e: Exception) {
            throw MaxThreadsExceededException(e)
        }
    }

    fun getTotalRunningThreads(): Int {
        return (FullyThreadedThreadPool.executorPool as ThreadPoolExecutor).activeCount
    }
}
