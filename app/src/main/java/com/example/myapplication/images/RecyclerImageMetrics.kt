package com.example.myapplication.images

import android.content.Context
import android.util.DisplayMetrics
import com.example.myapplication.R

class RecyclerImageMetrics(private val context: Context) : ImageMetrics {

    override fun setWidth() : Int {
        val screenWidth = getScreenMetrics().widthPixels
        val containerHorizontalPadding = getContainerHorizontalPadding()

        return screenWidth - containerHorizontalPadding
    }

    override fun setHeight() : Int {
        return context.resources.getDimensionPixelSize(R.dimen.image_height)
    }

    private fun getScreenMetrics() : DisplayMetrics {
        return context.resources.displayMetrics
    }

    private fun getContainerHorizontalPadding() : Int {
        return context.resources.getDimensionPixelSize(R.dimen.images_container_horizontal_padding)
    }
}