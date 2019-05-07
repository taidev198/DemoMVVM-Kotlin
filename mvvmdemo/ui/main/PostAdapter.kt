package com.framgia.mvvmdemo.ui.main

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.framgia.mvvmdemo.R
import com.framgia.mvvmdemo.data.model.Post
import com.framgia.mvvmdemo.databinding.PostItemBinding

/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
class PostAdapter(private val posts: List<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, type: Int): PostViewHolder {

        val binding: PostItemBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.context),
                R.layout.post_item, viewGroup, false)
        return PostViewHolder(binding)
    }

    override fun getItemCount(): Int = posts.size


    override fun onBindViewHolder(postViewHolder: PostViewHolder, pos: Int) {
        postViewHolder.onBind(posts[pos])
    }

    class PostViewHolder(private val itemBinding: PostItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        fun onBind(post: Post) {
            itemBinding.post = post
        }
    }
}
