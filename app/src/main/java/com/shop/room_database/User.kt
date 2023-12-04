package com.shop.room_database

import androidx.room.PrimaryKey

data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String
)