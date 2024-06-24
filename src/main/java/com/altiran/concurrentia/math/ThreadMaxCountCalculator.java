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

package com.altiran.concurrentia.math;

import com.altiran.concurrentia.utils.ClientMemoryRetriever;

/**
 * Used for calculating the maximum number of threads that the system can handle.
 *
 * @author Ab20zip
 * @since 1.0
 */
public class ThreadMaxCountCalculator {
    // Constants for stack size per thread (default 1 MB)
    private static final long STACK_SIZE_PER_THREAD = 1024 * 1024; // 1 MB

    // Singleton instance of ClientMemoryRetriever.
    private static final ClientMemoryRetriever INSTANCE = ClientMemoryRetriever.INSTANCE;

    /**
     * Default constructor for ThreadMaxCountCalculator.
     */
    public ThreadMaxCountCalculator() {
        super();
    }

    /**
     * Calculates the maximum number of threads that the system can support.
     * We assume that the system can handle 1 MB of memory per thread.
     *
     * @return Max number of threads that the system can handle (as integer)
     */
    public static int getMaxThreadCapability() {
        final long availableMemory = INSTANCE.getMaxMemory();

        // Get memory usage of the current application (approximate)
        long appMemoryUsage = INSTANCE.getAppMemoryUsage();

        // Calculate the remaining memory available for threads
        long remainingMemory = availableMemory - appMemoryUsage;

        // Calculate the maximum number of threads
        long maxThreads = remainingMemory / STACK_SIZE_PER_THREAD;

        // Return the maximum number of threads as an integer
        return (int) maxThreads;
    }
}
