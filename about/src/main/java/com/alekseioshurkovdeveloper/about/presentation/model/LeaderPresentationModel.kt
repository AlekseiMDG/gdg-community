package com.alekseioshurkovdeveloper.about.presentation.model

/**
 * Model represent leader community on presentation layer
 */
data class LeaderPresentationModel(
    /**
     * Identifier leader
     */
    val id: Int,
    /**
     * Full name leader
     */
    val name: String,
    /**
     * Link photo's leader
     */
    val photo: String
)