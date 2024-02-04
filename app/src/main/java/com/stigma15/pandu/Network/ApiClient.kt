package com.stigma15.pandu.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    fun getApiService(): ApiService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://my-json-server.typicode.com/ZackyF/Pandu/Posts")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(ApiService::class.java)
    }
}