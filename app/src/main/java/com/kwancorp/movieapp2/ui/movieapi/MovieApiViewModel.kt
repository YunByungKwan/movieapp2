package com.kwancorp.movieapp2.ui.movieapi

import androidx.lifecycle.ViewModel
import com.kwancorp.movieapp2.data.repository.MovieRepository

class MovieApiViewModel(
    private val repository: MovieRepository
    ): ViewModel() {
}