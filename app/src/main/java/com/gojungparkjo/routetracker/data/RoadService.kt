package com.gojungparkjo.routetracker.data

import com.gojungparkjo.routetracker.model.crosswalk.CrossWalkResponse
import com.gojungparkjo.routetracker.model.intersection.InterSectionResponse
import com.gojungparkjo.routetracker.model.pedestrianroad.PedestrianRoadResponse
import com.gojungparkjo.routetracker.model.trafficlight.TrafficLightResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RoadService {
    @GET("geoserver/seoul/wfs?request=GetFeature&version=1.1.1&typename=seoul%3AA004_A&outputFormat=application%2Fjson")
    suspend fun getRoadsInBound(@Query("bbox") bound:String): Response<CrossWalkResponse>

    @GET("geoserver/seoul/wfs?request=GetFeature&version=1.1.1&typename=seoul%3AA057_L&outputFormat=application%2Fjson")
    suspend fun getTrafficLightInBound(@Query("bbox") bound:String): Response<TrafficLightResponse>

    @GET("geoserver/seoul/wfs?request=GetFeature&version=1.1.1&typename=seoul%3AA003_A&outputFormat=application%2Fjson")
    suspend fun getPedestrianRoadInBound(@Query("bbox") bound:String): Response<PedestrianRoadResponse>

    @GET("geoserver/seoul/wfs?request=GetFeature&version=1.1.1&typename=seoul%3AC080_A&outputFormat=application%2Fjson")
    suspend fun getTrafficIslandInBound(@Query("bbox") bound:String): Response<PedestrianRoadResponse>
    @GET("geoserver/seoul/wfs?request=GetFeature&version=1.1.1&typename=seoul%3AA008_P&outputFormat=application%2Fjson")
    suspend fun getIntersectionInBound(@Query("bbox") bound:String): Response<InterSectionResponse>
}