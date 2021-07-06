package com.kwancorp.movieapp2.ui.movielist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kwancorp.movieapp2.data.MovieRepository
import com.kwancorp.movieapp2.data.entity.Movie
import kotlinx.coroutines.launch

class MovieListViewModel(
    private val repository: MovieRepository
    ): ViewModel() {
    private val _movieList = MutableLiveData<List<Movie>>()
    val movieList: LiveData<List<Movie>> get() = _movieList

    init {
        getMovieList()
    }

    fun getMovieList() = viewModelScope.launch {
        _movieList.value = repository.getMovieList().result
    }
}