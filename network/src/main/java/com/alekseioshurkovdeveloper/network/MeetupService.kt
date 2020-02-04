package com.alekseioshurkovdeveloper.network

import com.alekseioshurkovdeveloper.network.model.about.Community
import com.alekseioshurkovdeveloper.network.model.leaders.Leader
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface MeetupService {

    /**
     * Request return common information about group
     */
    @GET("/{id}")
    fun getCommunityInfo(@Path("id") id: String): Observable<Community>

    /**
     * Request return information about group's member, in  particular about leader this group
     */
    @GET("{id}/members")
    fun getOrganizers(@Path("id") id: String, @QueryMap map: Map<String, String>): Observable<List<Leader>>
}