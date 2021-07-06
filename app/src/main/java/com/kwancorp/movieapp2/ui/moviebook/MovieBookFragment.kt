package com.kwancorp.movieapp2.ui.moviebook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwancorp.movieapp2.databinding.FragMovieBookBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MovieBookFragment: Fragment() {

    private lateinit var binding: FragMovieBookBinding

    private val movieBookViewModel: MovieBookViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragMovieBookBinding.inflate(layoutInflater)
        binding.viewModel = movieBookViewModel
        return binding.root
    }
}