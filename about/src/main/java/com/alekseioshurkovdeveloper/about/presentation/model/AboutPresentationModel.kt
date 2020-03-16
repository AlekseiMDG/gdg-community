package com.alekseioshurkovdeveloper.about.presentation.model

/**
 * Common information abut group
 */
data class AboutPresentationModel(

    /**
     * Title of group
     */
    val title: String,

    /**
     * Description of group
     */
    val description: String,

    /**
     * URL on photo group
     */
    val photo: String,

    /**
     *
     */
    val status: String,

    /**
     *
     */
    val location: String,

    /**
     *
     */
    val count: Int,

    /**
     *
     */
    val leaders: List<LeaderPresentationModel>
)
