package com.kwancorp.movieapp2.ui.adapter

import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kwancorp.movieapp2.data.entity.Comment
import com.kwancorp.movieapp2.ui.movielist.MovieFragment
import com.kwancorp.movieapp2.ui.movielist.MoviePagerAdapter
import com.kwancorp.movieapp2.utils.MovieApplication

object BindingAdapter {
    @JvmStatic
    @BindingAdapter("url")
    fun setImage(imageView: ImageView, imageUrl: String?) {
        Log.d("TAG", "imageUrl:$imageUrl")
        Glide.with(MovieApplication.instance)
            .load(imageUrl)
            .into(imageView)
    }

    @JvmStatic
    @BindingAdapter("intValue")
    fun setText(textView: TextView, intValue: Int) {
        textView.text = "$intValue"
    }

    @JvmStatic
    @BindingAdapter("comments")
    fun setCommentRecyclerView(recyclerView: RecyclerView, commentList: List<Comment>?) {
        if(recyclerView.adapter == null) {
            recyclerView.adapter = CommentAdapter()
        }
        val adapter = recyclerView.adapter as CommentAdapter
        commentList?.forEach { comment ->
            adapter.addComment(comment)
        }
        adapter.notifyDataSetChanged()
    }
}