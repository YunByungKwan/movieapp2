package com.kwancorp.movieapp2.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kwancorp.movieapp2.data.entity.Comment

@Dao
interface CommentDao {

    @Query("SELECT * FROM comment WHERE movieId = (:id) ORDER BY timestamp DESC")
    suspend fun getCommentList(id: Int): List<Comment>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(comment: Comment)

}