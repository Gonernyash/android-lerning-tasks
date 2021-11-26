package com.example.myapplication.click_counters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.myapplication.R

class ClickCounterPlusActivity : AppCompatActivity() {

    private lateinit var countView: TextView
    private lateinit var countPlusButton: ImageButton
    private lateinit var countMinusButton: ImageButton
    private var clicksCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_counter_plus)

        countView = findViewById(R.id.count_view)
        countPlusButton = findViewById(R.id.count_plus_button)
        countMinusButton = findViewById(R.id.count_minus_button)

        countPlusButton.setOnClickListener{ incClickCount() }
        countMinusButton.setOnClickListener{ descClickCount() }
    }

    private fun incClickCount() {
        clicksCount += 1
        countView.text = clicksCount.toString()
    }

    private fun descClickCount() {
        clicksCount -= 1
        countView.text = clicksCount.toString()
    }
}