package com.example.schedulefefu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.schedulefefu.adapter.EventAdapter
import com.example.schedulefefu.event.EventGenerator
import kotlinx.coroutines.launch

class Schedule : AppCompatActivity() {

    private lateinit var eventsAdapter: EventAdapter
    private lateinit var eventsRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        eventsRecyclerView = findViewById(R.id.eventsRecycler)
        eventsAdapter = EventAdapter()
        initOperationsRecycler()
        eventsAdapter.data = EventGenerator.generateEvents(10)
    }

    private fun initOperationsRecycler() {
        eventsRecyclerView.layoutManager = LinearLayoutManager(baseContext)
        eventsRecyclerView.adapter = eventsAdapter
    }
}