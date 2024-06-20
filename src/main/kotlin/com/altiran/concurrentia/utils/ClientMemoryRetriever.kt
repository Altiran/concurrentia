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
