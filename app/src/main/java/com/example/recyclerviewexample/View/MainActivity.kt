package com.example.recyclerviewexample.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.Model.Class.RecyclerViewData
import com.example.recyclerviewexample.ModelMVVM.ParlourDataClass
import com.example.recyclerviewexample.Presenter.Interface.MainActivityPresenter
import com.example.recyclerviewexample.Presenter.Class.MainActivityPresenterClass
import com.example.recyclerviewexample.ViewModelMVVM.ParlourDataClassViewModel
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataObj: RecyclerViewData
    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var mActivityViewModel: ParlourDataClassViewModel
    private lateinit var adapter: VerticalRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)

        mActivityViewModel = ViewModelProviders.of(this).get(ParlourDataClassViewModel::class.java)
        mActivityViewModel.init()
        mActivityViewModel.getParlour().observe(this, Observer {
            adapter.notifyDataSetChanged()
        })

        val activityPresenter = MainActivityPresenterClass()
        setHorizontalRecyler(activityPresenter)
        setVerticalRecycler()
    }

    fun setHorizontalRecyler(presenter: MainActivityPresenter) {
        viewBinding.horizontailRecyclerView.layoutManager = presenter.setLayoutManager(this)
        viewBinding.horizontailRecyclerView.adapter = presenter.setAdapter(this)
    }

    fun setVerticalRecycler() {
        val layoutManager: RecyclerView.LayoutManager
        layoutManager = LinearLayoutManager(this)
        if (mActivityViewModel.getParlour().value != null){
            adapter = VerticalRecyclerViewAdapter(mActivityViewModel.getParlour().value!!, this)
        }
        viewBinding.vertcalRecyclerView.layoutManager = layoutManager
        viewBinding.vertcalRecyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}
