package com.example.schedulefefu.event

import com.example.schedulefefu.R

object EventGenerator {
    private val imageIdList: List<Int> = listOf(
        R.drawable.calendar,
        R.drawable.downloads,
        R.drawable.walking,
        R.drawable.meeting
    )

    fun generateEvents(count: Int): List<Event> =
        (0 .. count).map { index ->
            Event(
                imageResId = imageIdList.random(),
                name = "События $index",
                time = "${(12 .. 23).random()}:${(10 .. 59).random()}"
            )
        }
}