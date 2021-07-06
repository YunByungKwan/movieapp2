package com.kwancorp.movieapp2.ui.moviedetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kwancorp.movieapp2.data.repository.MovieRepository
import com.kwancorp.movieapp2.data.entity.Comment
import com.kwancorp.movieapp2.data.entity.DetailMovie
import kotlinx.coroutines.launch

class MovieDetailViewModel(private val repository: MovieRepository): ViewModel() {
    private val _detailMovie = MutableLiveData<List<DetailMovie>>()
    val detailMovie: LiveData<List<DetailMovie>> get() = _detailMovie

    private val _commentList = MutableLiveData<List<Comment>>()
    val commentList: LiveData<List<Comment>> get() = _commentList

    fun getDetailMovie(id: Int) = viewModelScope.launch {
        _detailMovie.value = repository.getDetailMovie(id).result
    }

    fun getCommentList(id: Int) = viewModelScope.launch {
        _commentList.value = repository.getCommentList(id).result
    }
}