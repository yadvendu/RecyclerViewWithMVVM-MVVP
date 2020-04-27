package com.example.recyclerviewexample.View

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.Presenter.Interface.HorizontalViewPresenter
import com.example.recyclerviewexample.databinding.HorizontalRecyclerViewItemBinding

class HorizontalRecyclerAdapter(
    private val context: Context,
    private var obj: HorizontalViewPresenter
) : RecyclerView.Adapter<HorizontalRecyclerAdapter.ViewHolder>() {
    private lateinit var viewBinding: HorizontalRecyclerViewItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        viewBinding =
            HorizontalRecyclerViewItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(viewBinding)
    }

    override fun getItemCount(): Int {
        obj.getlist(context)
        return obj.setCount()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var image = obj.setImage(position)
        var name = obj.setName(position)
        var designation = obj.setDesignation(position)
        holder.bindItem(image, name, designation)
    }

    inner class ViewHolder(itemBinding: HorizontalRecyclerViewItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        val itembinding: HorizontalRecyclerViewItemBinding

        init {
            this.itembinding = itemBinding
        }

        fun bindItem(image: Int, name: String, position: String) {
            itembinding.specialistImage.setImageResource(image)
            itembinding.specialistName.text = name
            itembinding.specialistDesignation.text = position
        }
    }
}