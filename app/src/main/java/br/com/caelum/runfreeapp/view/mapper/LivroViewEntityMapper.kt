package br.com.caelum.runfreeapp.view.mapper

import br.com.caelum.runfreeapp.data.model.Livro
import br.com.caelum.runfreeapp.view.entity.LivroViewEntity

class LivroViewEntityMapper {

    fun transform(livro: Livro): LivroViewEntity {
        val autores = "${livro.autores.map { autor -> autor.nome }}"
        val foto = livro.foto.replace("http://", "https://")
        return LivroViewEntity(livro.nome, foto, autores)

    }
}