package com.example.recyclerviewexample.Presenter.Class

import android.content.Context
import com.example.recyclerviewexample.Model.Interface.Data
import com.example.recyclerviewexample.Model.Class.SpecialistDataClass
import com.example.recyclerviewexample.Presenter.Interface.HorizontalViewPresenter

class HorizontalViewPresenterClass(var dataObj: Data) :
    HorizontalViewPresenter {
    lateinit var specialistList: MutableList<SpecialistDataClass>
    lateinit var specialistImageArray: Array<Int>
    lateinit var specialistNameArray: Array<String>
    lateinit var designationArray: Array<String>

    override fun getlist(context: Context) {
        getImageArray()
        getNameArray()
        getPositionArray()

        specialistList = mutableListOf()
        for (i in 0 until specialistImageArray.size) {
            val obj =
                SpecialistDataClass(
                    specialistImageArray[i],
                    specialistNameArray[i],
                    designationArray[i]
                )
            specialistList.add(obj)
        }
        MainActivityPresenterClass()
            .setAdapter(context).notifyDataSetChanged()
    }

    override fun setCount(): Int {
        return specialistList.size
    }

    override fun setImage(position: Int): Int {
        return specialistList[position].image
    }

    override fun setName(position: Int): String {
        return specialistList[position].name
    }

    override fun setDesignation(position: Int): String {
        return specialistList[position].position
    }

    override fun getImageArray() {
        specialistImageArray = dataObj.setImageArray()
    }

    override fun getNameArray() {
        specialistNameArray = dataObj.setNameArray()
    }

    override fun getPositionArray() {
        designationArray = dataObj.setPositionArray()
    }
}