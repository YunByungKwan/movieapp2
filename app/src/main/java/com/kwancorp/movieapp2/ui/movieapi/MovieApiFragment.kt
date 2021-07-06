package com.kwancorp.movieapp2.ui.movieapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwancorp.movieapp2.databinding.FragMovieApiBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MovieApiFragment: Fragment() {

    private lateinit var binding: FragMovieApiBinding

    private val viewModel: MovieApiViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragMovieApiBinding.inflate(layoutInflater)
        return binding.root
    }
}