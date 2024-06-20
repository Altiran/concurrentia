package com.altiran.concurrentia.types;

/**
 * This enum contains the commonly used encoding options.
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
