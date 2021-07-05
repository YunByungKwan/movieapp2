package com.kwancorp.movieapp2.ui.moviedetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwancorp.movieapp2.data.MovieRepository
import com.kwancorp.movieapp2.databinding.FragMovieDetailBinding
import com.kwancorp.movieapp2.ui.moviebook.MovieBookViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MovieDetailFragment: Fragment() {

    private lateinit var binding: FragMovieDetailBinding

    private val repository: MovieRepository by inject()

    private val viewModel: MovieDetailViewModel by viewModel {
        parametersOf(repository)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragMovieDetailBinding.inflate(layoutInflater)
        return binding.root
    }
}