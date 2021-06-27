package com.kwancorp.movieapp2.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "comment")
data class Comment(

    @PrimaryKey
    @SerializedName("id")
    val id: Int,

    @SerializedName("writer")
    val writer: String,

    @SerializedName("movieId")
    val movieId: Int,

    @SerializedName("writer_image")
    val writerImage: String,

    @SerializedName("time")
    val time: String,

    @SerializedName("timestamp")
    val timestamp: Int,

    @SerializedName("rating")
    val rating: Float,

    @SerializedName("contents")
    val contents: String,

    @SerializedName("recommend")
    val recommend: Int
)