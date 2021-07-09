package com.kwancorp.movieapp2.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kwancorp.movieapp2.data.entity.Comment
import com.kwancorp.movieapp2.databinding.CommentItemBinding

interface OnItemClickListener {
    fun OnItemClick(holder: RecyclerView.ViewHolder, view: View, position: Int)
}

class CommentAdapter: RecyclerView.Adapter<CommentAdapter.CommentViewHolder>() {

    private lateinit var binding: CommentItemBinding
    private lateinit var listener: OnItemClickListener
    private val commentList = ArrayList<Comment>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        binding = CommentItemBinding.inflate(layoutInflater)
        return CommentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        holder.bind(commentList[position])

    }

    override fun getItemCount(): Int = commentList.size

    fun addComment(comment: Comment) {
        commentList.add(comment)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    class CommentViewHolder(
        private val binding: CommentItemBinding
    ): RecyclerView.ViewHolder(binding.root) {

        private lateinit var listener: OnItemClickListener

        fun bind(comment: Comment) {
            binding.commentItem = comment
            itemView.setOnClickListener { v ->
                listener.let {
                    val position = adapterPosition
                    listener.OnItemClick(this, v, position)
                }
            }
        }

        fun setItem(comment: Comment) {
            binding.commentItem = comment
            binding.executePendingBindings()
        }

        fun setOnItemClickListener(listener: OnItemClickListener) {
            this.listener = listener
        }
    }
}