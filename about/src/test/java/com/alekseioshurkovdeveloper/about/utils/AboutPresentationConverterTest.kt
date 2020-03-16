package com.alekseioshurkovdeveloper.about.utils

import com.alekseioshurkovdeveloper.about.domain.model.AboutDomainModel
import com.alekseioshurkovdeveloper.about.domain.model.AboutLeaderModel
import com.alekseioshurkovdeveloper.about.presentation.model.AboutPresentationModel
import com.alekseioshurkovdeveloper.about.presentation.model.LeaderPresentationModel
import com.alekseioshurkovdeveloper.about.presentation.converter.AboutPresentationConverter
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

private const val NAME = "name"
private const val DESCRIPTION = "description"
private const val PHOTO = "url_photo"
private const val STATUS = "active"
private const val LOCATION = "location"
private const val MEMBER = 456

/**
 * Test on class [AboutPresentationConverter]
 */
internal class AboutPresentationConverterTest {

    private lateinit var converter: AboutPresentationConverter

    @Before
    fun setUp() {
        converter =
            AboutPresentationConverter()
    }

    @Test
    fun fullConvert_Test(){
        val expectedModel = createAboutPresentationModel(generateListLeaderModel())
        val actualModel = converter.convert(createAboutDomainModel(generateListAboutLeaderModel()))
        assertEquals(expectedModel, actualModel)
    }

    @Test
    fun emptyLeader_Test(){
        val expectedModel = createAboutPresentationModel(emptyList())
        val actualModel = converter.convert(createAboutDomainModel(emptyList()))
        assertEquals(expectedModel, actualModel)
    }

    private fun createAboutDomainModel(leaderList: List<AboutLeaderModel>): AboutDomainModel {
        return AboutDomainModel(632, NAME, DESCRIPTION,  STATUS, LOCATION, MEMBER, PHOTO, leaderList)
    }

    private fun generateListAboutLeaderModel(): List<AboutLeaderModel> {
        return mutableListOf(
            createAboutLeaderModel(1, "One", "PhotoLinkForOne"),
            createAboutLeaderModel(2, "Two", "PhotoLinkForTwo"),
            createAboutLeaderModel(3, "Three", "PhotoLinkForThree")
        )
    }

    private fun createAboutLeaderModel(id: Int, name: String, photo: String) = AboutLeaderModel(id, name, photo)

    private fun createAboutPresentationModel(leaderList: List<LeaderPresentationModel>)
            = AboutPresentationModel(NAME, DESCRIPTION, PHOTO, STATUS, LOCATION, MEMBER, leaderList)


    private fun generateListLeaderModel(): List<LeaderPresentationModel> {
        return mutableListOf(
            createLeaderPresentationModel(1, "One", "PhotoLinkForOne"),
            createLeaderPresentationModel(2, "Two", "PhotoLinkForTwo"),
            createLeaderPresentationModel(3, "Three", "PhotoLinkForThree")
        )
    }

    private fun createLeaderPresentationModel(id: Int, name: String, photo: String) = LeaderPresentationModel(id, name, photo)
}