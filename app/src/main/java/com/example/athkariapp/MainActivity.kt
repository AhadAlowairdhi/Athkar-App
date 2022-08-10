package com.example.athkariapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.athkariapp.adapter.AthkarAdapter
import com.example.athkariapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data Source
        val athkatList = DataSource().loadAthkat()
        // adapter
        val adapter = AthkarAdapter(athkatList, this)
        // RecyclerView
        val recyclerView : RecyclerView = findViewById(R.id.rv_athkar)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true) // to fixed size for recyclerView
    }
}