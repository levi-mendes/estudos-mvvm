package br.com.caelum.runfreeapp

import android.app.Application
import br.com.caelum.runfreeapp.di.network
import br.com.caelum.runfreeapp.di.repositories
import br.com.caelum.runfreeapp.di.viewModels
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CDCApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(arrayListOf(network, repositories, viewModels))
            androidContext(this@CDCApp)
        }
    }
}