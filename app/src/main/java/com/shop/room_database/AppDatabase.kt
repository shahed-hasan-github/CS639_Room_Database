package com.shop.room_database

import androidx.room.RoomDatabase

abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}