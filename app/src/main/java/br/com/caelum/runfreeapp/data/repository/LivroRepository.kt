package br.com.caelum.runfreeapp.data.repository

import br.com.caelum.runfreeapp.data.network.LivroApi

class LivroRepository(private val api: LivroApi) {

    suspend fun busca(indice: Int, qtdeLivros: Int) = api.buscaLivros(indice = indice, qtdeLivros = qtdeLivros).livros
}