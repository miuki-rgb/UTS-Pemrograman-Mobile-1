package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_list)

        val chatRecyclerView = findViewById<RecyclerView>(R.id.chatRecyclerView)
        chatRecyclerView.layoutManager = LinearLayoutManager(this)

        val chatList = listOf(
            ChatModel("John Doe", "Hello there!", "10:30 AM", R.drawable.profile_placeholder),
            ChatModel("Jane Smith", "How are you doing?", "Yesterday", R.drawable.profile_placeholder),
            ChatModel("Mike Johnson", "Meeting at 3 PM", "Yesterday", R.drawable.profile_placeholder),
            ChatModel("Sarah Williams", "Please review the documents", "Monday", R.drawable.profile_placeholder),
            ChatModel("David Brown", "The project is completed", "Sunday", R.drawable.profile_placeholder)
        )

        chatRecyclerView.adapter = ChatAdapter(chatList)
    }
}