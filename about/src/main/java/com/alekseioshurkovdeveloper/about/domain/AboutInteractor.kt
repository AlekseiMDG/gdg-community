package com.alekseioshurkovdeveloper.about.domain

import com.alekseioshurkovdeveloper.about.data.AboutGroupRepository
import com.alekseioshurkovdeveloper.about.domain.model.AboutDomainModel
import com.alekseioshurkovdeveloper.about.domain.model.AboutLeaderModel
import com.alekseioshurkovdeveloper.network.model.about.Community
import com.alekseioshurkovdeveloper.network.model.leaders.Leader
import io.reactivex.Observable
import io.reactivex.functions.BiFunction

const val GROUP = "GDG-Moscow"

class AboutInteractor(private val repository: AboutGroupRepository) {

    /**
     * Load information for page - About Community
     * from remote server
     *
     * @return Observable<AboutDomainModel> - information model wrapped to rx.Observable
     */
    fun loadAboutInformation(): Observable<AboutDomainModel> {
        return Observable.zip(
            getInfoAboutGroup(),
            getLeadersInformation(),
            BiFunction<Community, List<Leader>, AboutDomainModel> { group, leaders ->
                buildCommonModel( group, leaders)
            })
    }

    private fun buildCommonModel(group: Community, leaders: List<Leader>): AboutDomainModel {
        return AboutDomainModel(
            group.id,
            group.name,
            group.description,
            group.status,
            group.localizedLocation,
            group.members,
            group.groupPhoto.photoLink,
            converLeaders(leaders)
        )
    }

    private fun getInfoAboutGroup() = repository.loadAboutInformation()

    private fun getLeadersInformation(): Observable<List<Leader>> {
        val fields = mapOf("role" to "leads")
        return repository.loadInformationAboutLeaders(GROUP, fields)
    }

    private fun converLeaders(list: List<Leader>) =
        list.map { l -> AboutLeaderModel(l.id, l.name, l.photo.photoLink) }

}