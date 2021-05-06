package com.example.picpayclone_kotlin

import android.app.Application
import com.example.picpayclone_kotlin.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@AppApplication)
            modules(viewModelModule)
        }
    }
}