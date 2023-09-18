package com.example.project_one_mobile.data.api

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(private val authToken: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val modifiedOriginal =
            originalRequest
                .newBuilder()
                .addHeader(
                    "Authorization",
                    "Bearer $authToken"
                ).build()

        return chain.proceed(modifiedOriginal)
    }
}