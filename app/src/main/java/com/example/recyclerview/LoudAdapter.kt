package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LoudAdapter(private val context: Context, private val loud: List<loudhouse>, val listener: (LoudAdapter) -> Unit)
    : RecyclerView.Adapter<LoudAdapter.LoudHouseViewHolder>(){

    class LoudHouseViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgLoud = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameLoud = view.findViewById<TextView>(R.id.tv_item_name)
        val descLoud = view.findViewById<TextView>(R.id.tv_item_description)

        fun binView(loud: loudhouse, listener: (LoudAdapter) -> Unit){
            imgLoud.setImageResource(loud.imgLoud)
            nameLoud.text = loud.nameLoud
            descLoud.text = loud.descLoud
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoudHouseViewHolder {
        return LoudHouseViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_loudhouse, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LoudHouseViewHolder, position: Int) {
    holder.binView(loud[position], listener)
    }

    override fun getItemCount(): Int = loud.size

    }
