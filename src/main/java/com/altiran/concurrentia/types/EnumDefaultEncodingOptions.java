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

package com.altiran.concurrentia.types;

/**
 * This enumeration contains the commonly used encoding options.
 */
public enum EnumDefaultEncodingOptions {
    /**
     * UTF-8 encoding.
     */
    UTF8("UTF-8"),

    /**
     * ASCII encoding.
     */
    ASCII("ASCII"),

    /**
     * UTF-16 encoding.
     */
    UTF16("UTF-16"),

    /**
     * UTF-32 encoding.
     */
    UTF32("UTF-32");

    private final String s;

    EnumDefaultEncodingOptions(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
