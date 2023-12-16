package com.shoppingapp.hilt

import android.app.Application

class MyApplication : Application() {

    // Lazy initialize the Dagger component
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}