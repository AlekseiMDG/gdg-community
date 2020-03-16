package com.alekseioshurkovdeveloper.about.presentation.converter

import com.alekseioshurkovdeveloper.about.domain.model.AboutDomainModel
import com.alekseioshurkovdeveloper.about.domain.model.AboutLeaderModel
import com.alekseioshurkovdeveloper.about.presentation.model.AboutPresentationModel
import com.alekseioshurkovdeveloper.about.presentation.model.LeaderPresentationModel
import com.alekseioshurkovdeveloper.core.OneWayConverter

/**
 * Converter "Community About Information" from DomainModel to PresentationModel
 */
class AboutPresentationConverter : OneWayConverter<AboutDomainModel, AboutPresentationModel> {

    override fun convert(input: AboutDomainModel): AboutPresentationModel {
        return AboutPresentationModel(
            input.name,
            input.description,
            input.photoCommunity,
            input.status,
            input.location,
            input.member,
            convertLeader(input.leaders)
        )
    }

    private fun convertLeader(leaders: List<AboutLeaderModel>) =
        leaders.map { l -> LeaderPresentationModel(l.id, l.fullName, l.photo) }
}