package com.villanueva.alfonso.data.api

import com.villanueva.alfonso.data.Gato
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiRepository {
    private val catApi: CatService
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://cataas.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        catApi = retrofit.create(CatService::class.java)
    }

    suspend fun getCats(): List<Gato> = catApi.getCats()
}