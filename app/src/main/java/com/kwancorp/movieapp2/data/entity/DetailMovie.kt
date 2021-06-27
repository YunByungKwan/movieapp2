package com.kwancorp.movieapp2.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "detail_movie")
data class DetailMovie(
    
    @PrimaryKey
    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("date")
    val date: String,

    @SerializedName("user_rating")
    val userRating: Double,

    @SerializedName("audience_rating")
    val audienceRating: Double,

    @SerializedName("reviewer_rating")
    val reviewerRating: Float,

    @SerializedName("reservation_rate")
    val reservationRate: Double,

    @SerializedName("reservation_grade")
    val reservationGrade: Int,

    @SerializedName("grade")
    val grade: Int,

    @SerializedName("thumb")
    val thumb: String,

    @SerializedName("image")
    val image: String,

    @SerializedName("photos")
    val photos: String,

    @SerializedName("videos")
    val videos: String,

    @SerializedName("outlinks")
    val outlinks: String,

    @SerializedName("genre")
    val genre: String,

    @SerializedName("duration")
    val duration: Int,

    @SerializedName("audience")
    val audience: Int,

    @SerializedName("synopsis")
    val synopsis: String,

    @SerializedName("director")
    val director: String,

    @SerializedName("actor")
    val actor: String,

    @SerializedName("like")
    val like: Int,

    @SerializedName("dislike")
    val dislike: Int
)