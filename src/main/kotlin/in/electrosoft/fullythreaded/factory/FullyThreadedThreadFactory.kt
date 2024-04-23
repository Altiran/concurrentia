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

package `in`.electrosoft.fullythreaded.factory

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
