package com.shoppingapp.hilt

import javax.inject.Inject

class MyServiceImpl @Inject constructor() : MyService {
    override fun getData(): String {
        return "Hello, Dagger!"
    }
}