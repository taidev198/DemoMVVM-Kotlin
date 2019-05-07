package com.framgia.mvvmdemo.ui

import android.app.Application
import com.framgia.mvvmdemo.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by superme198 on 06,May,2019
 * in MVVM Demo.
 *
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()

            androidContext(this@MainApplication)

            modules(appModule)
        }
    }
}
