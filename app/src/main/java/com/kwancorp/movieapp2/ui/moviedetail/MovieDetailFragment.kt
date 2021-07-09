package com.kwancorp.movieapp2.ui.moviedetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwancorp.movieapp2.databinding.FragMovieDetailBinding
import com.kwancorp.movieapp2.utils.Constants
import org.koin.androidx.viewmodel.ext.android.viewModel

class MovieDetailFragment: Fragment() {

    private lateinit var binding: FragMovieDetailBinding

    private val viewModel: MovieDetailViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragMovieDetailBinding.inflate(layoutInflater).apply {
            fragment = this@MovieDetailFragment
            viewmodel = viewModel
            lifecycleOwner = viewLifecycleOwner
        }
        setMovieInfo()

        return binding.root
    }

    private fun setMovieInfo() {
        arguments?.let {
            viewModel.getDetailMovie(it.getInt(Constants.MOVIE_ID))
            viewModel.getCommentList(it.getInt(Constants.MOVIE_ID))
        }
    }

    fun onClickWriteCommentButton() {

    }

    fun onClickLoadAllButton() {

    }

    fun onClickLikeButton() {}

    fun onClickDisLikeButton() {

    }
}