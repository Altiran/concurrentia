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

package `in`.electrosoft.fullythreaded.utils

import net.jafama.FastMath

/**
 * Gets the maximum amount of RAM available to the VM at that time.
 */
object ClientMemoryRetriever {
    fun getMaxMemory(): Int {
        return bytesToMegabytes(Runtime.getRuntime().maxMemory())
    }

    private fun bytesToMegabytes(bytes: Long): Int = (bytes / FastMath.powQuick(2.0, 20.0)).toInt()
}
