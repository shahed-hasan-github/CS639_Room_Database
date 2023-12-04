package com.shop.room_database

import android.app.Application
import androidx.room.Room

class MyApp:Application() {

    companion object {
        lateinit var appDatabase: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()

        appDatabase = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "user-database")
            .allowMainThreadQueries()
            .build()
    }

}