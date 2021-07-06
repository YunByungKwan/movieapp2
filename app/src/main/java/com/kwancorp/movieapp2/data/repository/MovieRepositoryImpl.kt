package com.kwancorp.movieapp2.data.repository

import com.kwancorp.movieapp2.data.entity.*
import com.kwancorp.movieapp2.data.local.MovieLocalDataSource
import com.kwancorp.movieapp2.data.remote.MovieRemoteDataSource
import com.kwancorp.movieapp2.data.repository.MovieRepository
import com.kwancorp.movieapp2.utils.NetworkCompat

class MovieRepositoryImpl(
    private val localDataSource: MovieLocalDataSource,
    private val remoteDataSource: MovieRemoteDataSource
): MovieRepository {
    override suspend fun getMovieList(): MovieResponse {
        return if(NetworkCompat.isConnected()) {
            remoteDataSource.getMovieList()
        } else {
            localDataSource.getMovieList()
        }
    }

    override suspend fun getDetailMovie(id: Int): DetailMovieResponse {
        return if(NetworkCompat.isConnected()) {
            remoteDataSource.getDetailMovie(id)
        } else {
            localDataSource.getDetailMovie(id)
        }
    }

    override suspend fun getCommentList(id: Int): CommentResponse {
        return if(NetworkCompat.isConnected()) {
            remoteDataSource.getCommentList(id)
        } else {
            localDataSource.getCommentList(id)
        }
    }

    override suspend fun insertMovieListToRoom(movieList: List<Movie>) {
        TODO("Not yet implemented")
    }

    override suspend fun insertDetailMovieToRoom(detailMovieList: List<DetailMovie>) {
        TODO("Not yet implemented")
    }

    override suspend fun insertCommentListToRoom(commentList: List<Comment>) {
        TODO("Not yet implemented")
    }

    override suspend fun addComment(comment: HashMap<String, Any>) {
        TODO("Not yet implemented")
    }

    override suspend fun addLikeDisLike(count: HashMap<String, Any>) {
        TODO("Not yet implemented")
    }

    override suspend fun recommendComment(recommend: HashMap<String, Any>) {
        TODO("Not yet implemented")
    }
}