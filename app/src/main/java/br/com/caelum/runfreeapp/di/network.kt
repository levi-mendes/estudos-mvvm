package br.com.caelum.runfreeapp.di

import br.com.caelum.runfreeapp.data.network.InicializadorDeRetrofit
import br.com.caelum.runfreeapp.data.network.LivroApi
import org.koin.dsl.module

val network = module {

    single { InicializadorDeRetrofit.getInstance() }
    single { LivroApi(retrofit = get()) }

}