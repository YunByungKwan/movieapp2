package com.kwancorp.movieapp2.di

import com.kwancorp.movieapp2.data.MovieRepository
import com.kwancorp.movieapp2.data.MovieRepositoryImpl
import com.kwancorp.movieapp2.data.local.MovieLocalDataSource
import com.kwancorp.movieapp2.data.local.MovieLocalDataSourceImpl
import com.kwancorp.movieapp2.data.local.dao.MovieDao
import com.kwancorp.movieapp2.data.local.db.MovieDatabase
import com.kwancorp.movieapp2.data.remote.MovieApiService
import com.kwancorp.movieapp2.data.remote.MovieRemoteDataSource
import com.kwancorp.movieapp2.data.remote.MovieRemoteDataSourceImpl
import com.kwancorp.movieapp2.ui.movieapi.MovieApiViewModel
import com.kwancorp.movieapp2.ui.moviebook.MovieBookViewModel
import com.kwancorp.movieapp2.ui.moviedetail.MovieDetailViewModel
import com.kwancorp.movieapp2.ui.movielist.MovieListViewModel
import com.kwancorp.movieapp2.utils.Constants
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModules = module {
    single { MovieDatabase.getInstance(get())!! }
    single<MovieLocalDataSource> { MovieLocalDataSourceImpl(get()) }
    single<MovieRemoteDataSource> { MovieRemoteDataSourceImpl(get()) }
    single<MovieRepository> { MovieRepositoryImpl(get(), get()) }
}

val networkModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieApiService::class.java)
    }
}

val viewModelModule = module {
    viewModel { MovieListViewModel(get()) }
    viewModel { MovieApiViewModel(get()) }
    viewModel { MovieBookViewModel(get()) }
    viewModel { MovieDetailViewModel(get()) }
}





