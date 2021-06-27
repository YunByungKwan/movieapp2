package com.kwancorp.movieapp2.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movie")
data class Movie(
    @PrimaryKey
    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("title_eng")
    val titleEng: String,

    @SerializedName("date")
    val date: String,

    @SerializedName("user_rating")
    val userRating: Double,

    @SerializedName("audience_rating")
    val audienceRating: Double,

    @SerializedName("reviewer_rating")
    val reviewerRating: Double,

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
)