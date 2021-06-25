package com.kwancorp.movieapp2.ui.movielist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwancorp.movieapp2.databinding.FragMovieListBinding

class MovieListFragment: Fragment() {

    private lateinit var binding: FragMovieListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragMovieListBinding.inflate(layoutInflater)
        return binding.root
    }
}