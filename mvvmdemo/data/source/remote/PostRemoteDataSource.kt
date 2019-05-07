package com.framgia.mvvmdemo.data.source.remote

import com.framgia.mvvmdemo.data.model.Post
import com.framgia.mvvmdemo.data.repository.api.ApiService
import com.framgia.mvvmdemo.data.source.PostDataSource.Remote
import io.reactivex.Single

/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
class PostRemoteDataSource(private val apiService: ApiService) : Remote {

    override fun getPosts(): Single<List<Post>> {
        return apiService.getPosts()
    }
}
