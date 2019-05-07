package com.framgia.mvvmdemo.utils

import com.framgia.mvvmdemo.data.repository.api.ApiService
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
object ApiUtils {
    private const val BASE_URL = "https://my-json-server.typicode.com/typicode/demo/"
    fun getRetrofitInstance(): ApiService =
            Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build().create(ApiService::class.java)
}
