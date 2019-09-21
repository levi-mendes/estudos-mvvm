package br.com.caelum.runfreeapp.data.model

import com.squareup.moshi.Json

class Livro(
    val id: Long,
    @field:Json(name = "dataPublicacao") val publicacao: String,
    @field:Json(name = "numeroPaginas") val qtdPaginas: Int,
    @field:Json(name = "valorFisico") val fisico: Double,
    @field:Json(name = "valorVirtual") val virtual: Double,
    @field:Json(name = "valorVirtualComFisico") val ambos: Double,
    val isbn: String,
    @field:Json(name = "imagemUrl") val foto: String,
    @field:Json(name = "nomeLivro") val nome: String,
    @field:Json(name = "descricaoLivro") val descricao: String,
    val autores: List<Autor>

)

class Autor(
    @field:Json(name = "idAutor") val id: Long,
    @field:Json(name = "nomeAutor") val nome: String,
    @field:Json(name = "detalhesAutor") val detalhes: String,
    @field:Json(name = "imagemAutor") val foto: String
)


