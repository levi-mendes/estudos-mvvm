package br.com.caelum.runfreeapp.di

import br.com.caelum.runfreeapp.view.vm.LivroViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModels = module {

    viewModel { LivroViewModel(repository = get()) }
}