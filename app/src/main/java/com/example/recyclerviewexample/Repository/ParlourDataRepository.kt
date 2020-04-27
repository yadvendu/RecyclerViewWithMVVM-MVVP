package com.example.recyclerviewexample.Repository

import androidx.lifecycle.MutableLiveData
import com.example.recyclerviewexample.Model.Class.RecyclerViewData
import com.example.recyclerviewexample.ModelMVVM.ParlourDataClass

class ParlourDataRepository {
    private lateinit var dataSet: ArrayList<ParlourDataClass>
    private lateinit var dataObj:RecyclerViewData

    /*
    *Singleton Pattern
     */
    companion object {
        var obj:ParlourDataRepository? = null
        fun getInstance(): ParlourDataRepository {
            if (obj == null){
                obj = ParlourDataRepository()
                return obj!!
            }
            return obj!!
        }
    }

    fun getParlour():MutableLiveData<List<ParlourDataClass>>{
        setParlourList()
        val data:MutableLiveData<List<ParlourDataClass>> = MutableLiveData()
        data.value = dataSet
        return data
    }

    fun setParlourList(){
        dataObj = RecyclerViewData()
        dataSet = ArrayList()
        for (i in 0 until dataObj.parlourImageArray.size) {
            val obj = ParlourDataClass(
                dataObj.parlourImageArray[i],
                dataObj.parlourNameArray[i],
                dataObj.parlourTypeArray[i],
                dataObj.parlourDistanceArray[i],
                dataObj.parlourRatingArray[i]
            )
            dataSet.add(obj)
        }
    }
}