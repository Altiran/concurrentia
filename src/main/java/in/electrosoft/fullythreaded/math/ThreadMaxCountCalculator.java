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

package in.electrosoft.fullythreaded.math;

import in.electrosoft.fullythreaded.utils.ClientMemoryRetriever;

/**
 * Used for calculating the maximum number of threads that the system can handle.
 */
public class ThreadMaxCountCalculator {
    /**
     * Calculates the maximum number of threads that the system can support.
     * Based on my calculations, the number of threads is inversely proportional to the amount of memory.
     * Source: StackOverflow
     *
     * @return Max number of threads that the system can handle (as Integer)
     */
    public static int getMaxThreadCapability() {
        final int memory = ClientMemoryRetriever.INSTANCE.getMaxMemory();

        if (memory <= 1) {
            return 1; // memory space is too low
        } else if (memory == 2) {
            return 5744; // 2 mb is actually enough
        } else if (memory <= 4) {
            return 5743;
        } else if (memory <= 8) {
            return 5735;
        } else if (memory <= 12) {
            return 5724;
        } else if (memory <= 16) {
            return 5712;
        } else if (memory < 24) {
            return 5687;
        } else if (memory <= 32) {
            return 5662;
        } else if (memory <= 48) {
            return 5610;
        } else if (memory <= 64) {
            return 5561;
        } else if (memory <= 96) {
            return 5457;
        } else if (memory <= 128) {
            return 5357;
        } else if (memory <= 192) {
            return 5190;
        } else if (memory <= 256) {
            return 5014;
        } else if (memory <= 384) {
            return 4604;
        } else if (memory <= 512) {
            return 4202;
        } else if (memory <= 768) {
            return 3388;
        } else if (memory <= 1024) {
            return 2583;
        } else if (memory <= 2048) {
            return 2468;
        }

        return Integer.MAX_VALUE; // otherwise the memory space is enough for ~any number of threads
    }
}
