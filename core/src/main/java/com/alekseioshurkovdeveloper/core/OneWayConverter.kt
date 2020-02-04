package com.alekseioshurkovdeveloper.core

/**
 * Base class for converter class, from <V> model to <T> model data
 */
abstract class OneWayConverter <T, V> {

    /**
     * Convert model
     */
    abstract fun convert(input: V): T
}