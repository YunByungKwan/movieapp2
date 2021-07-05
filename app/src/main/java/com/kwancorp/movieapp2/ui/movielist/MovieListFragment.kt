package com.kwancorp.movieapp2.ui.movielist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwancorp.movieapp2.data.MovieRepository
import com.kwancorp.movieapp2.databinding.FragMovieListBinding
import com.kwancorp.movieapp2.ui.moviedetail.MovieDetailViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MovieListFragment: Fragment() {

    private lateinit var binding: FragMovieListBinding

    private val repository: MovieRepository by inject()

    private val viewModel: MovieListViewModel by viewModel {
        parametersOf(repository)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragMovieListBinding.inflate(layoutInflater)
        return binding.root
    }
}