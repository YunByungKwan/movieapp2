package com.kwancorp.movieapp2.data.remote

import com.kwancorp.movieapp2.data.entity.CommentResponse
import com.kwancorp.movieapp2.data.entity.DetailMovieResponse
import com.kwancorp.movieapp2.data.entity.MovieResponse

interface MovieRemoteDataSource {
    fun getMovieList(): MovieResponse

    fun getDetailMovie(id: Int): DetailMovieResponse

    fun getCommentList(id: Int): CommentResponse

    fun addComment(comment: HashMap<String, Object>)

    fun addLikeDisLike(count: HashMap<String, Object>)

    fun recommendComment(recommend: HashMap<String, Object>)
}