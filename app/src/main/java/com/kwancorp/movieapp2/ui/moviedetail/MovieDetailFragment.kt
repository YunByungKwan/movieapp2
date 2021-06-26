package com.kwancorp.movieapp2.ui.moviedetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwancorp.movieapp2.databinding.FragMovieDetailBinding

class MovieDetailFragment: Fragment() {

    private lateinit var binding: FragMovieDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragMovieDetailBinding.inflate(layoutInflater)
        return binding.root
    }
}