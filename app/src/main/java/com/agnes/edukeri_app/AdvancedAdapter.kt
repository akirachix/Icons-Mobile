package com.agnes.edukeri_app


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdvancedAdapter(var advancedLevelList:List<Advancedlevel>):
    RecyclerView.Adapter<AdvancedlevelViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdvancedlevelViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.advancedlevel_list_item, parent, false)
        return AdvancedlevelViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AdvancedlevelViewHolder, position: Int) {
        val advanced = advancedLevelList[position]
        holder.ivCourseImage.setImageResource(advanced.courseImage)
        holder.tvCourseSubtitles.text = advanced.courseSubtitle
    }

    override fun getItemCount(): Int{
        return advancedLevelList.size
    }
}

class AdvancedlevelViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val ivCourseImage = itemView.findViewById<ImageView>(R.id.ivCourseImage)
    val tvCourseSubtitles = itemView.findViewById<TextView>(R.id.tvCourseSubtitles)
    val ivProgress= itemView.findViewById<ImageView>(R.id.ivProgress)
}