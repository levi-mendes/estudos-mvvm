package br.com.caelum.runfreeapp.view.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.caelum.runfreeapp.data.repository.LivroRepository
import br.com.caelum.runfreeapp.view.entity.LivroViewEntity
import br.com.caelum.runfreeapp.view.mapper.LivroViewEntityMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LivroViewModel(
    private val repository: LivroRepository,
    private val mapper: LivroViewEntityMapper = LivroViewEntityMapper()
) : ViewModel() {


    private val livrosLiveData = MutableLiveData<List<LivroViewEntity>>()

    fun getLivros() = livrosLiveData as LiveData<List<LivroViewEntity>>

    fun busca(indice: Int, qtdeLivros: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            val livros = repository.busca(indice = indice, qtdeLivros = qtdeLivros)

            val entities = livros.map { mapper.transform(it) }

            launch(Dispatchers.Main) {
                livrosLiveData.postValue(entities)
            }

        }

    }
}