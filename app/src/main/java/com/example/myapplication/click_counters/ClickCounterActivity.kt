package com.example.myapplication.click_counters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class ClickCounterActivity : AppCompatActivity() {

    private var countView: TextView?= null
    private var countButton: Button?= null
    private var clicksCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_counter)

        countView = findViewById(R.id.count_view)
        countButton = findViewById(R.id.count_button)

        countButton?.setOnClickListener{ incClickCount() }
    }

    fun incClickCount() {
        clicksCount += 1
        countView?.text = clicksCount.toString()
    }
}