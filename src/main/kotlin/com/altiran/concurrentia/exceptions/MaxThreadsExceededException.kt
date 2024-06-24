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

package com.altiran.concurrentia.exceptions

/**
 * Exception to be thrown when the maximum compatible number of threads is exceeded.
 * Thrown at the runtime if the machine cannot support more threads.
 *
 * @author Ab20zip
 * @param cause The cause of the exception.
 * @since 1.0
 */
class MaxThreadsExceededException(cause: Throwable) :
    Exception(
        String.format(
            String.format(
                "Concurrentia Error: The maximum thread capability was reached.",
                "Cannot create more threads. Check the system resources and try again",
                cause
            )
        )
    )
