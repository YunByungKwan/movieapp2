package com.kwancorp.movieapp2.data.local

import com.kwancorp.movieapp2.data.entity.*

class MovieLocalDataSourceImpl: MovieLocalDataSource {
    override suspend fun getMovieList(): MovieResponse {
        TODO("Not yet implemented")
    }

    override suspend fun getDetailMovie(id: Int): DetailMovieResponse {
        TODO("Not yet implemented")
    }

    override suspend fun getCommentList(id: Int): CommentResponse {
        TODO("Not yet implemented")
    }

    override suspend fun addComment(comment: HashMap<String, Object>) {
        TODO("Not yet implemented")
    }

    override suspend fun addLikeDisLike(count: HashMap<String, Object>) {
        TODO("Not yet implemented")
    }

    override suspend fun recommendComment(recommend: HashMap<String, Object>) {
        TODO("Not yet implemented")
    }

    override suspend fun insertMovieList(movieList: List<Movie>) {
        TODO("Not yet implemented")
    }

    override suspend fun insertDetailMovie(detailMovie: List<DetailMovie>) {
        TODO("Not yet implemented")
    }

    override suspend fun insertCommentList(commentList: List<Comment>) {
        TODO("Not yet implemented")
    }
}