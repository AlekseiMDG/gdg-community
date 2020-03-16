package com.alekseioshurkovdeveloper.about.data

import com.alekseioshurkovdeveloper.network.MeetupService
import com.alekseioshurkovdeveloper.network.NetworkGatewayFactory
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.*
import org.junit.Before

/**
 * Test for [AboutGroupRepository]
 */
class AboutGroupRepositoryTest {

    lateinit var repository: AboutGroupRepository

    @MockK
    lateinit var networkGateway: NetworkGatewayFactory
    @MockK
    lateinit var service: MeetupService

    @Before
    fun setUp(){
        MockKAnnotations.init(this)
        every { networkGateway.getAboutGateway() } .returns(service)
        repository = AboutGroupRepository(networkGateway)
    }
}