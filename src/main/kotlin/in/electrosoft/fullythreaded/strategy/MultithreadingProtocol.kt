/*
 * Copyright 2017-present ElectroSoft LLC. All rights reserved. All wrongs reversed.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package `in`.electrosoft.fullythreaded.strategy

import `in`.electrosoft.fullythreaded.exceptions.MaxThreadAmountExceededException
import `in`.electrosoft.fullythreaded.pool.FullyThreadedThreadPool
import java.util.concurrent.ThreadPoolExecutor

/**
 * Contains the core multithreading protocol.
 */
class MultithreadingProtocol {
    fun run(r: Runnable) {
        try {
            FullyThreadedThreadPool.executorPool.execute(r)
        } catch (e: Exception) {
            throw MaxThreadAmountExceededException(e)
        }
    }

    fun getTotalRunningThreads(): Int {
        return (FullyThreadedThreadPool.executorPool as ThreadPoolExecutor).activeCount
    }
}
