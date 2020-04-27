package com.example.recyclerviewexample.Presenter.Interface

import android.content.Context

interface HorizontalViewPresenter {
    fun getlist(context: Context)
    fun setCount():Int
    fun setImage(position:Int):Int
    fun setName(position:Int):String
    fun setDesignation(position:Int):String
    fun getImageArray()
    fun getNameArray()
    fun getPositionArray()
}