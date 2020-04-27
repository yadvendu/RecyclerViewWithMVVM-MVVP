package com.example.recyclerviewexample.Presenter.Interface

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.View.HorizontalRecyclerAdapter

interface MainActivityPresenter {
    fun setLayoutManager(context: Context): RecyclerView.LayoutManager
    fun setAdapter(context: Context): HorizontalRecyclerAdapter
}