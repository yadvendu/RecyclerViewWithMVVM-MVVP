package com.example.recyclerviewexample.Presenter.Class

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.Model.Class.RecyclerViewData
import com.example.recyclerviewexample.Presenter.Interface.MainActivityPresenter
import com.example.recyclerviewexample.View.HorizontalRecyclerAdapter

class MainActivityPresenterClass() :
    MainActivityPresenter {
    override fun setLayoutManager(context: Context): RecyclerView.LayoutManager {
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        return layoutManager
    }

    override fun setAdapter(context: Context): HorizontalRecyclerAdapter {
        val dataPresenter =
            RecyclerViewData()
        val presenter =
            HorizontalViewPresenterClass(
                dataPresenter
            )
        val adapter = HorizontalRecyclerAdapter(
            context,
            presenter
        )
        return adapter
    }
}