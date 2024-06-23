/**
 * Concurrentia - Simple and open-source multithreading utility for Java, Kotlin, etc.
 * Copyright © 2024 Altiran Systems Pvt. Ltd.
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
