package com.kwancorp.movieapp2.data.entity

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    
    @SerializedName("message")
    val message: String,

    @SerializedName("code")
    val code: Int,

    @SerializedName("resultType")
    val resultType: String,

    @SerializedName("result")
    val result: List<Movie>
)