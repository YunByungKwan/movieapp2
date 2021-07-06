package com.kwancorp.movieapp2.utils

import android.app.Application
import com.kwancorp.movieapp2.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieApplication: Application() {
    companion object {
        lateinit var instance: MovieApplication
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        startKoin {
            androidContext(this@MovieApplication)
            modules(listOf(appModules, networkModule, viewModelModule))
        }
    }
}