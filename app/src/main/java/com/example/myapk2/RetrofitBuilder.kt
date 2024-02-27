package com.example.myapk2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    val api = "http://panel.mait.ac.in:8002/"

    fun getInstance(): Retrofit{
        val retrofit= retrofit2.Retrofit.Builder()
            .baseUrl(api)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
//        return retrofit.create(myInterface::class.java)
    }
}