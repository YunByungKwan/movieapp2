package com.kwancorp.movieapp2.ui.movielist

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class MoviePagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {

    private val fragments = ArrayList<MovieFragment>()

    override fun createFragment(position: Int): Fragment = fragments[position]

    override fun getItemCount(): Int = fragments.size

    fun addFragment(movieFragment: MovieFragment) {
        fragments.add(movieFragment)
    }
}