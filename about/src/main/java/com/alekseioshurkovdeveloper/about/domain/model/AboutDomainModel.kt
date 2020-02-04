package com.alekseioshurkovdeveloper.about.domain.model

/**
 * Model of About Page for domain layer
 */
data class AboutDomainModel(
    /**
     * Identifier Community
     */
    val id: Int,
    /**
     * Name Community
     */
    val name: String,
    /**
     * Description Community
     */
    val description: String,
    /**
     * Status Community (better way use enum for this field)
     */
    val status: String,
    /**
     * Location by text
     */
    val location: String,
    /**
     * Count members this Community
     */
    val member: Int,
    /**
     * Represent photo Community
     */
    val photoCommunity: String,
    /**
     * List leaders of Community
     */
    val leaders: List<AboutLeaderModel>
)