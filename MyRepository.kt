package com.shoppingapp.hilt

import javax.inject.Inject

class MyRepository @Inject constructor() {
    fun getData(): MyData {
        return MyData("Hello, Hilt!")
    }
}