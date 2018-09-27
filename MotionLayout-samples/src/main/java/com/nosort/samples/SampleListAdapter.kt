package com.nosort.samples

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SampleListAdapter(val onListItemClickedListener: OnListItemClickedListener, private val sampleDataList: List<SampleData>) : RecyclerView.Adapter<SampleListAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.sample_list_item, parent, false))

    override fun getItemCount(): Int = sampleDataList.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.titleTV.text = sampleDataList[position].title
        holder.descriptionTV.text = sampleDataList[position].description
    }

    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTV: TextView = itemView.findViewById(R.id.titleTV)
        val descriptionTV: TextView = itemView.findViewById(R.id.descriptionTV)

        init {
            itemView.setOnClickListener {
                onListItemClickedListener.onItemClicked(adapterPosition)
            }
        }
    }
}