package com.example.newsapp.retrofit

import androidx.room.Delete
import retrofit2.Call
import retrofit2.http.*

interface NewsApi {

    //https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=your_api_key


    @GET("/v2/top-headlines")
    fun getNews(@Query("country") country : String, @Query("category") category : String?, @Query("apiKey") key : String) : Call<NewsDataFromJson>
    @POST("/headlines")
    fun postNews(@Query("country") country : String, @Query("category") category : String?, @Query("apiKey") key : String) : Call<NewsDataFromJson>
    @PUT("/v2/top")
    fun putNews(@Query("country") country : String, @Query("category") category : String?, @Query("apiKey") key : String) : Call<NewsDataFromJson>
    @DELETE("/v2/")
    fun deleteNews(@Query("country") country : String, @Query("category") category : String?, @Query("apiKey") key : String) : Call<NewsDataFromJson>


}