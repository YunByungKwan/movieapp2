package com.kwancorp.movieapp2.data.remote

import com.kwancorp.movieapp2.data.entity.CommentResponse
import com.kwancorp.movieapp2.data.entity.DetailMovieResponse
import com.kwancorp.movieapp2.data.entity.MovieResponse
import retrofit2.http.*

interface MovieApiService {

    @GET("/movie/readMovieList")
    suspend fun getMovieList(): MovieResponse

    @GET("/movie/readMovie")
    suspend fun getDetailMovie(@Query("id") id: Int): DetailMovieResponse

    @GET("/movie/readCommentList")
    suspend fun getCommentList(@Query("id") id: Int): CommentResponse

    @FormUrlEncoded
    @POST("/movie/createComment")
    suspend fun addComment(@FieldMap param: HashMap<String, Any>)

    @FormUrlEncoded
    @POST("/movie/increaseLikeDisLike")
    suspend fun addLikeDisLike(@FieldMap param: HashMap<String, Any>)

    @FormUrlEncoded
    @POST("/movie/increaseRecommend")
    suspend fun recommendComment(@FieldMap param: HashMap<String, Any>)

}