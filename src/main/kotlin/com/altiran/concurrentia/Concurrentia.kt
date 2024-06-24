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

package com.altiran.concurrentia

import com.altiran.concurrentia.strategy.MultithreadingProtocol

/**
 * The main class of the library, allows you to execute runnable
 * in separate and more efficient threads.
 * <p>
 * This is the entry point to the library. You can create a new
 * instance of this class and use it to retrieve the multithreading
 * protocol implementation.
 *
 * @author Ab20zip
 * @since 1.0
 * @see [com.altiran.concurrentia.strategy.MultithreadingProtocol]
 */
open class Concurrentia() {
    val multiThreading: MultithreadingProtocol = MultithreadingProtocol()
}
