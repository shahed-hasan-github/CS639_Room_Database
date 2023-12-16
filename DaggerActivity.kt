package com.shoppingapp.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class DaggerActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)

        // Dagger injection
        (application as MyApplication).appComponent.inject(this)

        // Use the consumer class
        myConsumer.displayData()
        val data = myConsumer.getData()

        // Update the TextView with the data
        textView.text = data
    }
}