package com.example.myapplication.cards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class CardsAdapter(private val numbers: List<Int>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberTextView: TextView = itemView.findViewById(R.id.number_text_view)
    }

    class AddViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val addCardView: CardView = itemView.findViewById(R.id.add_card_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val itemView : View

        return when (viewType) {
            0 -> {
                itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_cards_add, parent, false)
                AddViewHolder(itemView)
            }
            1 -> {
                itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_cards_number, parent, false)
                NumberViewHolder(itemView)
            }
            else -> {
                throw Exception()
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is NumberViewHolder -> {
                holder.numberTextView.text = numbers[position].toString()
            }
        }

    }

    override fun getItemViewType(position: Int): Int {
        return if (position == itemCount) 0 else 1
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}