package com.example.marcelopr.greenhouse.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.marcelopr.greenhouse.R
import com.example.marcelopr.greenhouse.domain.Category
import com.example.marcelopr.greenhouse.interfaces.CategoryInterface

class CategoriesAdapter(
    private val context: Context,
    private val categories: List<Category>,
    private val categoryInterface: CategoryInterface
) : RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {

    var selectedPosition = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val v = LayoutInflater
            .from(context)
            .inflate(R.layout.item_categories_list2, parent, false)

        return CategoriesViewHolder(v)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        /*if (selectedPosition == position) {
            holder.itemView.setBackgroundResource(R.drawable.shape_background_rounded_primary)
        } else {
            holder.itemView.setBackgroundResource(R.drawable.shape_background_rounded_grey)
        }*/

        holder.setData(categories[position], position)
    }

    inner class CategoriesViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        val tvCategory: TextView
        val ivCategory: ImageView
        val ivMarker: ImageView

        init {
            itemView.setOnClickListener(this)
            tvCategory = itemView.findViewById(R.id.tv_category)
            ivCategory = itemView.findViewById(R.id.iv_category)
            ivMarker = itemView.findViewById(R.id.iv_marker)
        }

        fun setData(category: Category, position: Int) {
            if (selectedPosition == position) {
                ivMarker.visibility = View.VISIBLE
            } else {
                ivMarker.visibility = View.INVISIBLE
            }

            tvCategory.text = category.name
            ivCategory.setImageResource(category.icon)
        }

        override fun onClick(view: View?) {
            selectedPosition = adapterPosition
            notifyDataSetChanged()

            categoryInterface.changeCategory(categories[selectedPosition])
        }

    }

}