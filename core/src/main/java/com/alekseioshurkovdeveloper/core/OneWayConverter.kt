package com.alekseioshurkovdeveloper.core

/**
 * Base class for converter class, from <V> model to <T> model data
 */
interface OneWayConverter <T, V> {

    /**
     * Convert model
     */
    fun convert(input: T): V
}