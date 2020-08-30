package com.example.horseadministration.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.horseadministration.R
import com.example.horseadministration.model.Caballo
import kotlinx.android.synthetic.main.caballo_row.view.*

class CaballoAdapter (
    val context: Context,
    val caballoList: List<Caballo>,
    val itemClickListener: OnCaballoClickListener
) : RecyclerView.Adapter<BaseViewHolder<*>>(){

    interface OnCaballoClickListener{
        fun onItemclick(item: Caballo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return CaballoViewHolder(LayoutInflater.from(context).inflate(R.layout.caballo_row, parent, false))
    }

    override fun getItemCount(): Int {
        return caballoList.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is CaballoViewHolder -> holder.bind(caballoList[position], position)
            else -> throw IllegalArgumentException("No se reconoce el holder")
        }
    }

    inner class CaballoViewHolder(itemView: View): BaseViewHolder<Caballo>(itemView){
        override fun bind(item: Caballo, position: Int) {

            itemView.setOnClickListener{ itemClickListener.onItemclick(item) }
            itemView.caballo_img.setImageResource(item.img)
            itemView.caballo_name.text = item.name
        }

    }

}