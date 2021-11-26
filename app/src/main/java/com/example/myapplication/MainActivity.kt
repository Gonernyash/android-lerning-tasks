package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.cards.CardsAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var cardsRecyclerView: RecyclerView

    private var numbersList: MutableList<Int> = mutableListOf(1, 0)
    private var count: Int = 1

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        initRecyclerView()
    }

    private fun initRecyclerView() {
        cardsRecyclerView = findViewById(R.id.cards_recycle_view)
        cardsRecyclerView.layoutManager = LinearLayoutManager(this)
        cardsRecyclerView.adapter = CardsAdapter(getNumbersList())
    }

    private fun getNumbersList() : MutableList<Int> {
        return numbersList
    }

    private fun addCard() {

        val lastIndex = numbersList.lastIndex

        numbersList.add(lastIndex - 1, count + 1)
    }
}