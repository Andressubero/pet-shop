package com.example.tp3_petshop.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "https://dummyjson.com/"

    private val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    } // opcional: para ver los logs de las peticiones HTTP (fran)

    private val client = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    val api: ProductService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductService::class.java)
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    val cartApi: CartService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CartService::class.java)
    }


=======
=======
>>>>>>> 915d50640f973fbbdf2c2820c8f20d54a547c1ef
=======
>>>>>>> 915d50640f973fbbdf2c2820c8f20d54a547c1ef
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val authService: AuthService = retrofit.create(AuthService::class.java)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 915d50640f973fbbdf2c2820c8f20d54a547c1ef
=======
>>>>>>> 915d50640f973fbbdf2c2820c8f20d54a547c1ef
=======
>>>>>>> 915d50640f973fbbdf2c2820c8f20d54a547c1ef
}
