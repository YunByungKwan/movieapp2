package com.kwancorp.movieapp2.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kwancorp.movieapp2.data.entity.Movie

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie")
    suspend fun getMovieList(): List<Movie>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(movie: Movie)

}