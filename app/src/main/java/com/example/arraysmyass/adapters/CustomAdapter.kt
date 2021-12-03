package com.example.arraysmyass.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.arraysmyass.R
import com.example.arraysmyass.models.Pictures

class CustomAdapter(private var array: ArrayList<Pictures>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.textView)
        val imageView: ImageView = view.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_view_cell, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        holder.textView.text = item.name
        holder.imageView.setImageResource(item.image)
        }

    override fun getItemCount(): Int {
        return array.size
    }
}