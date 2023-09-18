package com.example.project_one_mobile.data.retrofit

import com.example.project_one_mobile.data.api.AuthInterceptor
import okhttp3.OkHttpClient

private const val authToken = "colocar aqui o autenticador"

object OkHttpClientFactory : OkHttpClient() {

    private val authInterceptor = AuthInterceptor(authToken)

    private val client = Builder().addInterceptor(authInterceptor).build()
    fun getAuthInterceptor(): OkHttpClient {
        return client
    }

}