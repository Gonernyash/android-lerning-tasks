package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.images.ImagesAdapter
import com.example.myapplication.images.RecyclerImageMetrics

class ImagesActivity : AppCompatActivity() {

    private lateinit var imagesRecyclerView: RecyclerView
    private lateinit var imageAddButton: ImageButton
    private lateinit var imageEditText: EditText

    private var imagesList: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        imageAddButton.setOnClickListener{ addImage() }
    }

    private fun initViews() {
        imageAddButton = findViewById(R.id.image_add_button)
        imageEditText = findViewById(R.id.image_edit_text)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        imagesRecyclerView = findViewById(R.id.images_recycle_view)
        imagesRecyclerView.layoutManager = LinearLayoutManager(this)
        imagesRecyclerView.adapter = ImagesAdapter(getImagesList())
    }

    private fun getImagesList() : MutableList<String> {
        return imagesList
    }

    private fun addImage() {
        val image = imageEditText.text.toString()

        imagesList.add(0, image)
        imagesRecyclerView.apply {
            adapter?.notifyItemInserted(0)
            layoutManager?.scrollToPosition(0)
        }
        imageEditText.setText("")
    }

}