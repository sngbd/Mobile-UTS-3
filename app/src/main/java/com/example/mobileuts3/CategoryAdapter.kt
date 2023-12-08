package com.example.mobileuts3

import android.media.Image
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class CategoryAdapter (private val contentList: ArrayList<Category>): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val categoryImage: ImageView = itemView.findViewById(R.id.category_image)
        val categoryTitle: TextView = itemView.findViewById(R.id.category_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = View.inflate(parent.context, R.layout.category_list, null)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contentList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.categoryTitle.text = contentList[position].title
        holder.categoryImage.setImageResource(contentList[position].image)
    }
}
