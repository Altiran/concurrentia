package com.altiran.concurrentia.exceptions

/**
 * Thrown when the max compatible number of threads is exceeded.
 */
class MaxThreadsExceededException(cause: Throwable) :
    Exception(
        String.format(
            String.format(
                "The maximum thread amount capability was reached",
                cause
            )
        )
    )
