package com.example.schedulefefu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.schedulefefu.adapter.EventAdapter
import com.example.schedulefefu.event.EventGenerator

class Schedule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eventsRecycler: RecyclerView = findViewById(R.id.eventsRecycler)
        val eventsAdapter = EventAdapter()

        eventsRecycler.layoutManager = LinearLayoutManager(this)
        eventsRecycler.adapter = eventsAdapter

        eventsAdapter.data = EventGenerator.generateEvents(10)
    }
}