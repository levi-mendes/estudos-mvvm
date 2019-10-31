package br.com.caelum.runfreeapp.data.network

import br.com.caelum.runfreeapp.data.model.LivrosDTO
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

class LivroApi(retrofit: Retrofit) {

    private val service by lazy { retrofit.create(LivroService::class.java) }

    suspend fun buscaLivros(indice: Int, qtdeLivros: Int) = service.getLivros(indicePrimeiroLivro = indice, qtdLivros = qtdeLivros)


    internal interface LivroService {

        @GET("listarLivros")
        suspend fun getLivros(@Query("indicePrimeiroLivro") indicePrimeiroLivro: Int,
                              @Query("qtdLivros") qtdLivros: Int): LivrosDTO
    }
}