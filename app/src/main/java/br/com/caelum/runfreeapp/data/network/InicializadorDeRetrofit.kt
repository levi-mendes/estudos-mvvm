package br.com.caelum.runfreeapp.data.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object InicializadorDeRetrofit {

    private const val BASE_URL = "https://cdcmob.herokuapp.com/"

    fun getInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}