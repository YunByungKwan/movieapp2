package com.kwancorp.movieapp2.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kwancorp.movieapp2.data.entity.DetailMovie

@Dao
interface DetailMovieDao {

    @Query("SELECT * FROM detail_movie WHERE id = (:id)")
    suspend fun getMovieInfo(id: Int): List<DetailMovie>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(detailMovie: List<DetailMovie>)
}