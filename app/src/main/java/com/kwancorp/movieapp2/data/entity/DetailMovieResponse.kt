package com.kwancorp.movieapp2.data.entity

import com.google.gson.annotations.SerializedName

data class DetailMovieResponse(

    @SerializedName("message")
    var message: String,

    @SerializedName("code")
    var code: Int,

    @SerializedName("resultType")
    var resultType: String,

    @SerializedName("result")
    var result: List<DetailMovie>
)