package com.kwancorp.movieapp2.data.repository

import com.kwancorp.movieapp2.data.entity.*

interface MovieRepository {
    suspend fun getMovieList(): MovieResponse

    suspend fun getDetailMovie(id: Int): DetailMovieResponse

    suspend fun getCommentList(id: Int): CommentResponse

    suspend fun insertMovieListToRoom(movieList: List<Movie>)

    suspend fun insertDetailMovieToRoom(detailMovieList: List<DetailMovie>)

    suspend fun insertCommentListToRoom(commentList: List<Comment>)

    suspend fun addComment(comment: HashMap<String, Any>)

    suspend fun addLikeDisLike(count: HashMap<String, Any>)

    suspend fun recommendComment(recommend: HashMap<String, Any>)
}