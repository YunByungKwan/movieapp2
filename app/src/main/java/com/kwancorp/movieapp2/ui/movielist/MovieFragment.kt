package com.kwancorp.movieapp2.ui.movielist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.kwancorp.movieapp2.R
import com.kwancorp.movieapp2.databinding.FragMovieBinding
import com.kwancorp.movieapp2.utils.Constants

class MovieFragment: Fragment() {

    private lateinit var binding: FragMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragMovieBinding.inflate(layoutInflater).apply {
            fragment = this@MovieFragment
        }
        return binding.root
    }

    companion object {
        fun newInstance(id: Int, image: String,
                        title: String, reservationRate: Double,
                        grade: Int, pos: Int): MovieFragment {
            val movieFragment = MovieFragment()
            val bundle = Bundle()
            bundle.putInt(Constants.MOVIE_ID, id)
            bundle.putString(Constants.MOVIE_IMG, image)
            bundle.putString(Constants.MOVIE_TITLE, title)
            bundle.putDouble(Constants.MOVIE_RESERV_RATE, reservationRate)
            bundle.putInt(Constants.MOVIE_GRADE, grade)
            bundle.putInt(Constants.MOVIE_POS, pos)
            movieFragment.arguments = bundle
            return movieFragment
        }
    }

    fun onClickDetailSeeButton(view: View) {
        Navigation.findNavController(view).navigate(R.id.act_nav_movie_list_to_detail, arguments)
    }
}