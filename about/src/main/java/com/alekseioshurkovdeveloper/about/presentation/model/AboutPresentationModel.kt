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
     * Group`s status
     */
    val status: String,

    /**
     * Group`s location
     */
    val location: String,

    /**
     * Amoutn group`s member
     */
    val count: Int,

    /**
     * List of leaders
     */
    val leaders: List<LeaderPresentationModel>
)
