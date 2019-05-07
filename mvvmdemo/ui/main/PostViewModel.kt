package com.framgia.mvvmdemo.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.framgia.mvvmdemo.data.model.Post
import com.framgia.mvvmdemo.data.repository.PostRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
class PostViewModel(private val repository: PostRepository) : ViewModel() {

    private val _postViewModel: MutableLiveData<List<Post>> by lazy {
        MutableLiveData<List<Post>>()
    }

    private val compositeDisposable = CompositeDisposable()

    val postViewModel: LiveData<List<Post>>
        get() = _postViewModel

    fun getPosts() {
        val disposable = repository.getPosts().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    _postViewModel.postValue(it)
                }, {
                    // Handing error
                    _postViewModel.postValue(null)
                })

        compositeDisposable.add(disposable)
    }

    fun onDestroy(){
        compositeDisposable.clear()
    }
}
