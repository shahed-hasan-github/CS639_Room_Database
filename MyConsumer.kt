package com.shoppingapp.hilt

import javax.inject.Inject

class MyConsumer @Inject constructor(private val myService: MyService) {

    fun displayData() {
        val data = myService.getData()
        println(data)
    }
}