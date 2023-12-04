package com.shop.room_database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val userAdapter = UserAdapter()
    lateinit var recyclerView:RecyclerView


    override suspend fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = userAdapter
        
        updateRecyclerView()
    }

    suspend fun onAddButtonClick(view: View) {
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val name = nameEditText.text.toString().trim()

        if (name.isNotEmpty()) {
            val user = User(name = name)
            MyApp.appDatabase.userDao().insert(user)

            updateRecyclerView()

            nameEditText.setText("")
        }
    }

    private suspend fun updateRecyclerView() {
        val users = MyApp.appDatabase.userDao().getAllUsers()
        userAdapter.setUsers(users)
    }
}