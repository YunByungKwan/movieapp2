package com.kwancorp.movieapp2.data.remote

import com.kwancorp.movieapp2.data.entity.CommentResponse
import com.kwancorp.movieapp2.data.entity.DetailMovieResponse
import com.kwancorp.movieapp2.data.entity.MovieResponse
import retrofit2.http.*

interface MovieApiService {

    @GET("/movie/readMovieList")
    fun getMovieList(): MovieResponse

    @GET("/movie/readMovie")
    fun getDetailMovie(@Query("id") id: Int): DetailMovieResponse

    @GET("/movie/readCommentList")
    fun getCommentList(@Query("id") id: Int): CommentResponse

    @FormUrlEncoded
    @POST("/movie/createComment")
    fun addComment(@FieldMap param: HashMap<String, Object>)

    @FormUrlEncoded
    @POST("/movie/increaseLikeDisLike")
    fun addLikeDisLike(@FieldMap param: HashMap<String, Object>)

    @FormUrlEncoded
    @POST("/movie/increaseRecommend")
    fun recommendComment(@FieldMap param: HashMap<String, Object>)

}