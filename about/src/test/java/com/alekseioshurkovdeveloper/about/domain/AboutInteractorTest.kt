package com.alekseioshurkovdeveloper.about.domain

import com.alekseioshurkovdeveloper.about.data.AboutGroupRepository
import com.alekseioshurkovdeveloper.about.domain.model.AboutDomainModel
import com.alekseioshurkovdeveloper.about.domain.model.FabricatedModel
import com.alekseioshurkovdeveloper.core.OneWayConverter
import com.alekseioshurkovdeveloper.network.model.about.Community
import com.alekseioshurkovdeveloper.network.model.leaders.Leader
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import io.reactivex.Observable
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class AboutInteractorTest {

    @MockK
    lateinit var repository: AboutGroupRepository
    @MockK
    lateinit var converter: OneWayConverter<FabricatedModel, AboutDomainModel>

    lateinit var iteractor: AboutInteractor

    @Before
    fun setUp(){
        MockKAnnotations.init(this)
        iteractor = AboutInteractor(repository, converter)
    }

    @Test
    fun loadInformation_Test(){
        val observable  = Observable.just(Community())
        val leadersList =  Observable.just(listOf( Leader()))
        every { repository.loadAboutInformation() } returns observable
        every { repository.loadInformationAboutLeaders(any(), any()) } returns leadersList
        iteractor.loadAboutInformation()
        verify { repository.loadAboutInformation() }
        verify { repository.loadInformationAboutLeaders(any(), any()) }
    }
}