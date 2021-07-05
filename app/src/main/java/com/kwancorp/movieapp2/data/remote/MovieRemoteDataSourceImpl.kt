package com.kwancorp.movieapp2.data.remote

import com.kwancorp.movieapp2.data.entity.CommentResponse
import com.kwancorp.movieapp2.data.entity.DetailMovieResponse
import com.kwancorp.movieapp2.data.entity.MovieResponse

class MovieRemoteDataSourceImpl: MovieRemoteDataSource {
    override fun getMovieList(): MovieResponse {
        TODO("Not yet implemented")
    }

    override fun getDetailMovie(id: Int): DetailMovieResponse {
        TODO("Not yet implemented")
    }

    override fun getCommentList(id: Int): CommentResponse {
        TODO("Not yet implemented")
    }

    override fun addComment(comment: HashMap<String, Object>) {
        TODO("Not yet implemented")
    }

    override fun addLikeDisLike(count: HashMap<String, Object>) {
        TODO("Not yet implemented")
    }

    override fun recommendComment(recommend: HashMap<String, Object>) {
        TODO("Not yet implemented")
    }
}