package com.alekseioshurkovdeveloper.about.data

import com.alekseioshurkovdeveloper.network.NetworkGatewayFactory

/**
 * Repository for load about information
 */
class AboutGroupRepository(networkGateway: NetworkGatewayFactory) {

    private val aboutApi = networkGateway.getAboutGateway()

    fun loadAboutInformation() =
        aboutApi.getCommunityInfo("GDG-Moscow")

    fun loadInformationAboutLeaders(id: String, map: Map<String, String>) = aboutApi.getOrganizers(id, map)
}