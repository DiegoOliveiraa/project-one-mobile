package com.example.project_one_mobile.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://exemplo.com/"

object RetrofitFactory {

    private val client: OkHttpClient = OkHttpClientFactory.getAuthInterceptor()

    fun create(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create()
            )
            .client(client)
            .build()
    }

}