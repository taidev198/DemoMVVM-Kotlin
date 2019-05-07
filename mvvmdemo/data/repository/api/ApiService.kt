package com.framgia.mvvmdemo.data.repository.api

import com.framgia.mvvmdemo.data.model.Post
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
interface ApiService {

    @GET("posts")
    fun getPosts(): Single<List<Post>>

    @POST("/create")
    @FormUrlEncoded
    fun createPost(
            @Field("id") id: String,
            @Field("userId") userId: Int,
            @Field("title") title: String,
            @Field("body") body: String
    ): Observable<Boolean>
}
