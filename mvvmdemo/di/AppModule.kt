package com.framgia.mvvmdemo.di

import com.framgia.mvvmdemo.data.repository.PostRepository
import com.framgia.mvvmdemo.data.source.remote.PostRemoteDataSource
import com.framgia.mvvmdemo.ui.main.PostViewModel
import com.framgia.mvvmdemo.utils.ApiUtils
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */

val appModule = module {
    viewModel { PostViewModel(get()) }
    single { ApiUtils.getRetrofitInstance() }
    single { PostRemoteDataSource(get()) }
    single { PostRepository(get()) }
}
