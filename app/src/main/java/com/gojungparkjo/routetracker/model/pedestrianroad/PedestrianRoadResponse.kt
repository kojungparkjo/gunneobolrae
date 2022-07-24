package com.gojungparkjo.routetracker.model.pedestrianroad


import com.google.gson.annotations.SerializedName

data class PedestrianRoadResponse(
    @SerializedName("crs")
    val crs: Crs?,
    @SerializedName("features")
    val features: List<Feature>?,
    @SerializedName("totalFeatures")
    val totalFeatures: Int?,
    @SerializedName("type")
    val type: String?
)