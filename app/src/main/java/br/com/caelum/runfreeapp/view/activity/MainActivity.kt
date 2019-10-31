package br.com.caelum.runfreeapp.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.caelum.runfreeapp.R
import br.com.caelum.runfreeapp.view.adapter.LivroAdapter
import br.com.caelum.runfreeapp.view.vm.LivroViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: LivroViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val indice = 0
        val qtde = 20

        viewModel.busca(indice = indice, qtdeLivros = qtde)

        viewModel.getLivros().observe(this, Observer {

            lista.adapter = LivroAdapter(it)
            lista.layoutManager = LinearLayoutManager(this)

        })
    }
}
