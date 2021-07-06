package com.kwancorp.movieapp2.ui.movielist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwancorp.movieapp2.databinding.FragMovieListBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MovieListFragment: Fragment() {

    private lateinit var binding: FragMovieListBinding

    private val movieListViewModel: MovieListViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragMovieListBinding.inflate(layoutInflater).apply {
            fragment = this@MovieListFragment
            viewModel = movieListViewModel
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }
}