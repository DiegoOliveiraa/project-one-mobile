package com.example.project_one_mobile.data.api

import com.example.project_one_mobile.model.user.UserClient
import com.example.project_one_mobile.model.product.Product
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface ApiService {

    @POST("auth/login")
    suspend fun userLogin(@Body userClient: UserClient): Flow<UserClient>

    @POST("auth/register")
    suspend fun userRegister(@Body userClient: UserClient): Flow<UserClient>

    @GET("jewelry/products")
    suspend fun getJewelryProducts(): Flow<List<Product>>

    @GET("jewelry/products/{itemId}")
    suspend fun getJewelryProductById(@Path("itemId") itemId: Int): Flow<Product>

    @POST("cart/add")
    suspend fun addToCart(@Body product: Product): Flow<Product>



}