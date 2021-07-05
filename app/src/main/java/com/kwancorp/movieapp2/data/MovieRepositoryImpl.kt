package com.kwancorp.movieapp2.data

import com.kwancorp.movieapp2.data.local.MovieLocalDataSource
import com.kwancorp.movieapp2.data.remote.MovieRemoteDataSource

class MovieRepositoryImpl(
    private val localDataSource: MovieLocalDataSource,
    private val remoteDataSource: MovieRemoteDataSource
): MovieRepository {
}