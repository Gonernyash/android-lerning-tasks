package com.example.myapplication.products

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ProductsAdapter(private val products: List<String>) :
    RecyclerView.Adapter<ProductsAdapter.ProductsHolder>() {

    class ProductsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productTextView: TextView = itemView.findViewById(R.id.product_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_products, parent, false)
        return ProductsHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductsHolder, position: Int) {
        holder.productTextView.text = products[position]
    }

    override fun getItemCount(): Int {
        return products.size
    }
}