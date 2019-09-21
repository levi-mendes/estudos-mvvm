package br.com.caelum.runfreeapp.data.network

import br.com.caelum.runfreeapp.data.model.LivrosDTO
import retrofit2.Retrofit
import retrofit2.http.GET

class LivroApi(retrofit: Retrofit) {

    private val service by lazy { retrofit.create(LivroService::class.java) }

    suspend fun buscaLivros() = service.getLivros()


    internal interface LivroService {

        @GET("listarLivros?indicePrimeiroLivro=0&qtdLivros=20")
        suspend fun getLivros(): LivrosDTO
    }
}