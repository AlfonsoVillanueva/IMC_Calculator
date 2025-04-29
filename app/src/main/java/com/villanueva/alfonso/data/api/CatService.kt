package com.villanueva.alfonso.data.api

import com.villanueva.alfonso.data.Gato
import retrofit2.http.GET

interface CatService {
    @GET("api/cats")
    fun getCats(): List<Gato>
}