package com.example.myapk2

import retrofit2.Response
import retrofit2.http.GET

interface myInterface {
    @GET("/event/get/")
    suspend fun getQuotes(): Response<QuoteList>
}