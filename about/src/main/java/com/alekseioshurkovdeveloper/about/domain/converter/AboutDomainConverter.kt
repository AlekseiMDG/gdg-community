package com.alekseioshurkovdeveloper.about.domain.converter

import com.alekseioshurkovdeveloper.about.domain.model.AboutDomainModel
import com.alekseioshurkovdeveloper.about.domain.model.AboutLeaderModel
import com.alekseioshurkovdeveloper.about.domain.model.FabricatedModel
import com.alekseioshurkovdeveloper.core.OneWayConverter
import com.alekseioshurkovdeveloper.network.model.leaders.Leader

/**
 * Domain model's converter
 */
class AboutDomainConverter: OneWayConverter<FabricatedModel, AboutDomainModel> {

    override fun convert(input: FabricatedModel): AboutDomainModel {
        return AboutDomainModel(
            input.group.id,
            input.group.name,
            input.group.description,
            input.group.status.status,
            input.group.localizedLocation,
            input.group.members,
            input.group.groupPhoto.photoLink,
            convertLeaders(input.leaders)
        )
    }

    private fun convertLeaders(list: List<Leader>) =
        list.map { l -> AboutLeaderModel(l.id, l.name, l.photo.photoLink) }
}