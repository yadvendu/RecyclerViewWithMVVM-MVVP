package com.example.recyclerviewexample.ViewModelMVVM

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.ModelMVVM.ParlourDataClass
import com.example.recyclerviewexample.Repository.ParlourDataRepository
import com.example.recyclerviewexample.View.VerticalRecyclerViewAdapter

class ParlourDataClassViewModel : ViewModel() {
    private lateinit var parlourList:MutableLiveData<List<ParlourDataClass>>
    private lateinit var dataRepoObj:ParlourDataRepository

    fun getParlour():LiveData<List<ParlourDataClass>>{
        return parlourList
    }

    fun init(){
        dataRepoObj = ParlourDataRepository.getInstance()
        parlourList = dataRepoObj.getParlour()
    }


}