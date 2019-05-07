package com.framgia.mvvmdemo.ui.main

import android.support.v7.widget.LinearLayoutManager
import androidx.lifecycle.Observer
import com.framgia.mvvmdemo.R
import com.framgia.mvvmdemo.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
class PostActivity : BaseActivity() {

    override fun initComponents() {

    }

    override fun initData() {
        val viewModel: PostViewModel by viewModel()
        viewModel.getPosts()
        viewModel.postViewModel.observe(this, Observer {
            recyclerViewPosts.adapter = PostAdapter(it)
            recyclerViewPosts.layoutManager = LinearLayoutManager(this)
        })
    }

    override fun getLayoutResource(): Int {
        return R.layout.activity_main
    }
}
