package br.com.caelum.runfreeapp.data.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object InicializadorDeRetrofit {

    fun getInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://cdcmob.herokuapp.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}