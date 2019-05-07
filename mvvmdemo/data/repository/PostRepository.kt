package com.framgia.mvvmdemo.data.repository

import com.framgia.mvvmdemo.data.model.Post
import com.framgia.mvvmdemo.data.source.PostDataSource.Remote
import com.framgia.mvvmdemo.data.source.remote.PostRemoteDataSource
import io.reactivex.Single

/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
class PostRepository(private val postRemoteDataSource: PostRemoteDataSource) : Remote {
    override fun getPosts(): Single<List<Post>> {
        return postRemoteDataSource.getPosts()
    }
}
