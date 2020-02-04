package com.alekseioshurkovdeveloper.network

class NetworkGatewayFactory(private val creator: MeetupServiceCreator) {

    fun getAboutGateway() = creator.getApi(MeetupService::class.java)

}