package com.kwancorp.movieapp2.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kwancorp.movieapp2.data.entity.Comment
import com.kwancorp.movieapp2.data.entity.DetailMovie
import com.kwancorp.movieapp2.data.entity.Movie
import com.kwancorp.movieapp2.data.local.dao.CommentDao
import com.kwancorp.movieapp2.data.local.dao.DetailMovieDao
import com.kwancorp.movieapp2.data.local.dao.MovieDao

@Database(entities = [Movie::class, DetailMovie::class, Comment::class], version = 1, exportSchema = false)
abstract class MovieDatabase: RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun detailMovieDao(): DetailMovieDao
    abstract fun commentDao(): CommentDao

    companion object {
        private var INSTANCE: MovieDatabase? = null

        fun getInstance(context: Context): MovieDatabase? {
            if(INSTANCE == null) {
                synchronized(MovieDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        MovieDatabase::class.java, "movie.db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}