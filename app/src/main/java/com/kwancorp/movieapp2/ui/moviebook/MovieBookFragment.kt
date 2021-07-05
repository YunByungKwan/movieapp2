package com.kwancorp.movieapp2.ui.moviebook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwancorp.movieapp2.data.MovieRepository
import com.kwancorp.movieapp2.databinding.FragMovieBookBinding
import com.kwancorp.movieapp2.ui.movieapi.MovieApiViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MovieBookFragment: Fragment() {

    private lateinit var binding: FragMovieBookBinding

    private val repository: MovieRepository by inject()

    private val viewModel: MovieBookViewModel by viewModel {
        parametersOf(repository)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragMovieBookBinding.inflate(layoutInflater)
        return binding.root
    }
}