package com.example.marcelopr.greenhouse.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.marcelopr.greenhouse.ProductDetailsActivity
import com.example.marcelopr.greenhouse.R
import com.example.marcelopr.greenhouse.domain.Product
import com.squareup.picasso.Picasso

class ProductsAdapter(
    private val context: Context,
    private val products: MutableList<Product>
) : RecyclerView.Adapter<ProductsAdapter.ChairsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChairsViewHolder {
        val v = LayoutInflater
            .from(context)
            .inflate(R.layout.item_list, parent, false)

        return ChairsViewHolder(v)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ChairsViewHolder, position: Int) {
        holder.setData(products[position])
    }

    inner class ChairsViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        val ivImg: ImageView
        val tvName: TextView
        val tvPrice: TextView

        init {
            itemView.setOnClickListener(this)

            ivImg = itemView.findViewById(R.id.iv_item_list)
            tvName = itemView.findViewById(R.id.tv_title_item_list)
            tvPrice = itemView.findViewById(R.id.tv_price_item_list)
        }

        fun setData(product: Product) {
            Picasso.get().load(product.img).fit().into(ivImg)
            //ivPlant.setImageResource(plant.img)
            tvName.text = product.name
            tvPrice.text = product.getPriceBRFormat(context.getString(R.string.label_money_sign))
        }

        override fun onClick(view: View?) {
            val intent = Intent(context, ProductDetailsActivity::class.java)
            intent.putExtra( Product.KEY, products[ adapterPosition ] )
            context.startActivity( intent )
        }

    }

}