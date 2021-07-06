package com.kwancorp.movieapp2.ui.movielist

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.kwancorp.movieapp2.data.entity.Movie

object MovieListBindingAdapter {
    @JvmStatic
    @BindingAdapter("fragment", "listItem")
    fun setViewPager(viewPager: ViewPager2, fragment: Fragment, movieList: List<Movie>?) {
        if(viewPager.adapter == null) {
            viewPager.adapter = MoviePagerAdapter(fragment)
        }
        val adapter = viewPager.adapter as MoviePagerAdapter
        movieList?.forEach { movie ->
            adapter.addFragment(
                MovieFragment.newInstance(
                    movie.id,
                    movie.image,
                    movie.title,
                    movie.reservationRate,
                    movie.grade,
                    adapter.itemCount
                )
            )
        }
        adapter.notifyDataSetChanged()
    }

    @SuppressLint("SetTextI18n")
    @JvmStatic
    @BindingAdapter("position", "title")
    fun setThumbnailTitle(textView: TextView, position: Int, title: String) {
        textView.text = "${position + 1}. $title"
    }
}