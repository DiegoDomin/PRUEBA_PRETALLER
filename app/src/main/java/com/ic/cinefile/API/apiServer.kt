package com.ic.cinefile.API

import com.google.gson.GsonBuilder
import com.ic.cinefile.API.methods.Methods
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object apiServer {
    val BASE_URL= "http://localhost:3500/"

    val methods:Methods by lazy {

        Retrofit.Builder()
            .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(Methods::class.java)
    }


    }

