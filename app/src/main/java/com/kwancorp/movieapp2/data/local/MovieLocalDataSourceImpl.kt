package com.kwancorp.movieapp2.data.local

import com.kwancorp.movieapp2.data.entity.*
import com.kwancorp.movieapp2.data.local.dao.CommentDao
import com.kwancorp.movieapp2.data.local.dao.DetailMovieDao
import com.kwancorp.movieapp2.data.local.dao.MovieDao

class MovieLocalDataSourceImpl(
    private val movieDao: MovieDao,
    private val detailMovieDao: DetailMovieDao,
    private val commentDao: CommentDao
): MovieLocalDataSource {
    override suspend fun getMovieList(): MovieResponse {
        return MovieResponse("", 0, "", movieDao.getMovieList())
    }

    override suspend fun getDetailMovie(id: Int): DetailMovieResponse {
        return DetailMovieResponse("", 0, "", detailMovieDao.getMovieInfo(id))
    }

    override suspend fun getCommentList(id: Int): CommentResponse {
        return CommentResponse("", 0, "", 0, commentDao.getCommentList(id))
    }

    override suspend fun addComment(comment: HashMap<String, Any>) {

    }

    override suspend fun addLikeDisLike(count: HashMap<String, Any>) {
        TODO("Not yet implemented")
    }

    override suspend fun recommendComment(recommend: HashMap<String, Any>) {
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