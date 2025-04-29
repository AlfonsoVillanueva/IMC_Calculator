package com.villanueva.alfonso.data

import com.google.gson.annotations.SerializedName

data class Gato(@SerializedName("id") val imagen:String,
                @SerializedName("createdAt") val mensage:String)
