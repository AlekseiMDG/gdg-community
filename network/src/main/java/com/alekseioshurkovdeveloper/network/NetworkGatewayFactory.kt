package com.alekseioshurkovdeveloper.network

/**
 * Factory for creating gateway for remote service
 *
 * @param creator creator getaway by parameter
 */
class NetworkGatewayFactory(private val creator: MeetupServiceCreator) {

    fun getAboutGateway() = creator.getApi(MeetupService::class.java)
}