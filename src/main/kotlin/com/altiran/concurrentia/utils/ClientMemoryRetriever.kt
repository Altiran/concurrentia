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

package com.altiran.concurrentia.utils

import net.jafama.FastMath
import java.lang.management.ManagementFactory


/**
 * Gets the maximum amount of memory available to the JVM at that time.
 */
object ClientMemoryRetriever {
    fun getMaxMemory(): Long {
        // Get the maximum memory that the JVM can use
        val maxMemory = Runtime.getRuntime().maxMemory()
        // Convert bytes to megabytes
        return bytesToMegabytes(maxMemory)
    }

    fun getAppMemoryUsage(): Long {
        // Get memory usage of the current application
        val memoryMXBean = ManagementFactory.getMemoryMXBean()
        val heapMemoryUsage = memoryMXBean.heapMemoryUsage.used
        val nonHeapMemoryUsage = memoryMXBean.nonHeapMemoryUsage.used
        // Convert bytes to megabytes and return the sum
        return bytesToMegabytes(heapMemoryUsage + nonHeapMemoryUsage)
    }

    private fun bytesToMegabytes(bytes: Long): Long = (bytes / FastMath.powQuick(2.0, 20.0)).toLong()
}
