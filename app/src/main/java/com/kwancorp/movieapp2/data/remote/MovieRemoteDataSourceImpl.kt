package com.kwancorp.movieapp2.data.remote

import com.kwancorp.movieapp2.data.entity.CommentResponse
import com.kwancorp.movieapp2.data.entity.DetailMovieResponse
import com.kwancorp.movieapp2.data.entity.MovieResponse

class MovieRemoteDataSourceImpl(
    private val apiService: MovieApiService
    ): MovieRemoteDataSource {
    override suspend fun getMovieList(): MovieResponse {
        return apiService.getMovieList()
    }

    override suspend fun getDetailMovie(id: Int): DetailMovieResponse {
        return apiService.getDetailMovie(id)
    }

    override suspend fun getCommentList(id: Int): CommentResponse {
        return apiService.getCommentList(id)
    }

    override suspend fun addComment(comment: HashMap<String, Any>) {
        return apiService.addComment(comment)
    }

    override suspend fun addLikeDisLike(count: HashMap<String, Any>) {
        return apiService.addLikeDisLike(count)
    }

    override suspend fun recommendComment(recommend: HashMap<String, Any>) {
        return apiService.recommendComment(recommend)
    }
}