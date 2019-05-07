package com.framgia.mvvmdemo.data.source

import com.framgia.mvvmdemo.data.model.Post
import io.reactivex.Single
/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
interface PostDataSource {

    interface Remote {
        fun getPosts(): Single<List<Post>>
    }
}
