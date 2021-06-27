package com.kwancorp.movieapp2.data.local

import com.kwancorp.movieapp2.data.entity.*

interface MovieLocalDataSource {
    suspend fun getMovieList(): MovieResponse

    suspend fun getDetailMovie(id: Int): DetailMovieResponse

    suspend fun getCommentList(id: Int): CommentResponse

    suspend fun addComment(comment: HashMap<String, Object>)

    suspend fun addLikeDisLike(count: HashMap<String, Object>)

    suspend fun recommendComment(recommend: HashMap<String, Object>)

    suspend fun insertMovieList(movieList: List<Movie>)

    suspend fun insertDetailMovie(detailMovie: List<DetailMovie>)

    suspend fun insertCommentList(commentList: List<Comment>)
}