package com.example.myapplication.images

interface ImageMetrics {

    // Размеры картинки в пикселях
    private val widthPX: Int
        get() = setWidth()

    private val heightPX: Int
        get() = setHeight()

    fun setWidth() : Int

    fun setHeight() : Int

    fun getWidthInPX() : Int {
        return widthPX
    }

    fun getHeightInPX() : Int {
        return heightPX
    }

//    fun getWidthInDP() : Int {
//
//    }
//
//    fun getHeightInDP() : Int {
//
//    }

}