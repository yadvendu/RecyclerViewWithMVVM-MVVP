package com.example.recyclerviewexample.View

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.ModelMVVM.ParlourDataClass
import com.example.recyclerviewexample.databinding.VerticalRecyclerItemBinding

class VerticalRecyclerViewAdapter(private val list:List<ParlourDataClass>, private val context: Context):RecyclerView.Adapter<VerticalRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBinding = VerticalRecyclerItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(viewBinding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bindItems(list[position])
    }

    inner class ViewHolder(itemBinding:VerticalRecyclerItemBinding):RecyclerView.ViewHolder(itemBinding.root){
        val itemBinding:VerticalRecyclerItemBinding

        init {
            this.itemBinding = itemBinding
        }

        fun bindItems(obj: ParlourDataClass){
            itemBinding.parlourImage.setImageResource(obj.image)
            itemBinding.parlourName.text = obj.name
            itemBinding.parlourType.text = obj.type
            itemBinding.parlourDistance.text = "${obj.distance} Km Away"
            itemBinding.parlourRating.text = obj.rating
        }
    }
}