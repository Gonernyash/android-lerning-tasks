package com.example.myapplication.images

import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.squareup.picasso.Picasso
import java.lang.Exception

class ImagesAdapter(private val images: List<String>) :
    RecyclerView.Adapter<ImagesAdapter.ImagesHolder>() {

    class ImagesHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageTextView: TextView = itemView.findViewById(R.id.image_src)
        val imageImageView: ImageView = itemView.findViewById(R.id.image_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_images, parent, false)
        return ImagesHolder(itemView)
    }

    override fun onBindViewHolder(holder: ImagesHolder, position: Int) {
        holder.imageTextView.text = images[position]

        val picasso = Picasso.get()
        //picasso.setIndicatorsEnabled(true)

        picasso.load(images[position])
            .fit()
            .into(holder.imageImageView, object: com.squareup.picasso.Callback {
                override fun onSuccess() {
                    Log.i("Picasso", "The image was loaded successfully")
                }

                override fun onError(e: Exception?) {
                    Log.e("Picasso ERROR", e.toString())
                }
            })

    }

    override fun getItemCount(): Int {
        return images.size
    }
}