package br.com.caelum.runfreeapp.di

import br.com.caelum.runfreeapp.data.repository.LivroRepository
import org.koin.dsl.module

val repositories = module {

    single { LivroRepository(api = get()) }
}