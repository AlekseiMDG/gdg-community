package com.alekseioshurkovdeveloper.network

import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

class NetworkGatewayFactoryTest {


    private lateinit var factory: NetworkGatewayFactory

    @MockK
    lateinit var creator: MeetupServiceCreator

    @Before
    fun setUp() {
        MockKAnnotations.init(this)

        factory = NetworkGatewayFactory(creator)
    }


    @Test
    fun getApiGateway_Test(){
        factory.getAboutGateway()
        verify { creator.getApi(Any::class.java) }
    }
}