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

package `in`.electrosoft.fullythreaded.pool

import `in`.electrosoft.fullythreaded.factory.FullyThreadedThreadFactory
import java.util.concurrent.ExecutorService
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

/**
 * @author Ab20zipYT
 * Create a thread pool so that we don't have to create a thread every time we call the {@link in.electrosoft.fullythreaded.strategy.MultithreadingProtocol} method.
 */
object FullyThreadedThreadPool {
    val executorPool: ExecutorService = ThreadPoolExecutor(
        0, Int.MAX_VALUE,
        60L, TimeUnit.SECONDS,
        SynchronousQueue(),
        FullyThreadedThreadFactory
    );
}
