package com.framgia.mvvmdemo.data.model

import com.google.gson.annotations.SerializedName


/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
data class Post(
        @SerializedName("title")
        var title: String,
        @SerializedName("body")
        var body: String,
        @SerializedName("userId")
        var userId: Int,
        @SerializedName("id")
        var id: Int
)
