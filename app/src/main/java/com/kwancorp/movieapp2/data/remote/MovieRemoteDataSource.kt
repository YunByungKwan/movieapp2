package com.kwancorp.movieapp2.data.remote

import com.kwancorp.movieapp2.data.entity.CommentResponse
import com.kwancorp.movieapp2.data.entity.DetailMovieResponse
import com.kwancorp.movieapp2.data.entity.MovieResponse

interface MovieRemoteDataSource {
    suspend fun getMovieList(): MovieResponse

    suspend fun getDetailMovie(id: Int): DetailMovieResponse

    suspend fun getCommentList(id: Int): CommentResponse

    suspend fun addComment(comment: HashMap<String, Any>)

    suspend fun addLikeDisLike(count: HashMap<String, Any>)

    suspend fun recommendComment(recommend: HashMap<String, Any>)
}