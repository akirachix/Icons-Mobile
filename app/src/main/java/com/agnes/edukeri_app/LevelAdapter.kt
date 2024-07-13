package com.agnes.edukeri_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class LevelAdapter(private val levelList: List<LevelItem>) :
    RecyclerView.Adapter<LevelViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.level_list_view, parent, false)
        return LevelViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LevelViewHolder, position: Int) {
        val level = levelList[position]
        holder.tvTitle.text = level.title
    }

    override fun getItemCount(): Int {
        return levelList.size
    }
}

class LevelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
}