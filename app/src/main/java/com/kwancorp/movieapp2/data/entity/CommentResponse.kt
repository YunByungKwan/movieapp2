package com.kwancorp.movieapp2.data.entity

import com.google.gson.annotations.SerializedName

data class CommentResponse(
    
    @SerializedName("message")
    val message: String,

    @SerializedName("code")
    val code: Int,

    @SerializedName("resultType")
    val resultType: String,

    @SerializedName("totalCount")
    val totalCount: Int,

    @SerializedName("result")
    val result: List<Comment>

    )