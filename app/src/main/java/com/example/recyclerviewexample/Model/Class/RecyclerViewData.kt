package com.example.recyclerviewexample.Model.Class

import com.example.recyclerviewexample.Model.Interface.Data
import com.example.recyclerviewexample.R

class RecyclerViewData :
    Data {
    val parlourImageArray = arrayOf(
        R.drawable.parlourone,
        R.drawable.parlour_two,
        R.drawable.parlourthree,
        R.drawable.parlourfour,
        R.drawable.parlourone,
        R.drawable.parlour_two,
        R.drawable.parlourthree,
        R.drawable.parlourfour
    )
    val parlourRatingArray = arrayOf("4.3", "4.1", "3.8", "4.5", "4.2", "3.1", "4.9", "3.8")
    val parlourDistanceArray = arrayOf("1.3", "1.8", "2.1", "4.6", "1.1", "0.9", "2.6", "1.1")
    val parlourTypeArray =
        arrayOf("Unisex", "Female", "Unisex", "Unisex", "Unisex", "Female", "Unisex", "Female")
    val parlourNameArray = arrayOf(
        "Knight Salon & Spa",
        "Joyce Beauty Parlour",
        "Pearl Beauty Salon & Spa",
        "Tenzin Stylist",
        "YLG Salon",
        "Lakme Salon",
        "Jawed Habib Beauty Parlour",
        "Fresh Look Beauty Parlour "
    )

    override fun setImageArray(): Array<Int> {
        val specialistImageArray = arrayOf(
            R.drawable.specialistone,
            R.drawable.specialisttwo,
            R.drawable.specialistthree,
            R.drawable.last,
            R.drawable.newspecialisttwo,
            R.drawable.specialistnewone,
            R.drawable.lastspecialist
        )
        return specialistImageArray
    }

    override fun setNameArray(): Array<String> {
        val specialistNameArray = arrayOf(
            "Victoria Lee",
            "John Stones",
            "Tokyo Chii",
            "Katty Perry",
            "Domino Jack",
            "Michel Harry",
            "Domino Park"
        )
        return specialistNameArray
    }

    override fun setPositionArray(): Array<String> {
        val designationArray = arrayOf(
            "Manager",
            "Makeup Artist",
            "Hair Designer",
            "Expert",
            "Makeup Artist",
            "Designer",
            "Expert"
        )
        return designationArray
    }
}