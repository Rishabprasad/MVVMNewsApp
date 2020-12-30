package com.androiddevs.mvvmnewsapp.api

import retrofit2.http.GET

interface NewsAPI {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(

    )
}