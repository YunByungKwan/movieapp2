package com.kwancorp.movieapp2.utils

import android.app.Application
import com.kwancorp.movieapp2.di.appModules
import com.kwancorp.movieapp2.di.networkModule
import com.kwancorp.movieapp2.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MovieApplication)
            modules(
                appModules,
                networkModule,
                viewModelModule
            )
        }
    }
}