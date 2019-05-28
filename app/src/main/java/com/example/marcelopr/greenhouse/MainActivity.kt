package com.example.marcelopr.greenhouse

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.marcelopr.greenhouse.adapter.CategoriesAdapter
import com.example.marcelopr.greenhouse.adapter.ProductsAdapter
import com.example.marcelopr.greenhouse.data.Database
import com.example.marcelopr.greenhouse.domain.Category
import com.example.marcelopr.greenhouse.domain.Product
import com.example.marcelopr.greenhouse.interfaces.CategoryInterface
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :
    AppCompatActivity(),
    CategoryInterface {

    lateinit var productsAdapter: ProductsAdapter
    var productsList = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        initCategoriesRecyclerView()
        initProductsRecyclerView()
    }

    private fun initCategoriesRecyclerView() {

        rv_categories.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_categories.layoutManager = layoutManager
        rv_categories.adapter = CategoriesAdapter(this, Database.getCategories(this), this)

    }

    private fun initProductsRecyclerView() {
        rv_products.setHasFixedSize(true)
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        rv_products.layoutManager = layoutManager
        productsList.addAll(Database.products_list)
        productsAdapter = ProductsAdapter(this, productsList)
        rv_products.adapter = productsAdapter
    }

    override fun changeCategory(category: Category) {
        productsList.clear()
        productsAdapter.notifyDataSetChanged()

        if (category.type == 0){

            productsList.addAll(Database.products_list)

        }else {

            Database.products_list.forEach {
                if (it.category == category.type) {
                    productsList.add(it)
                    productsAdapter.notifyItemInserted(productsList.size)
                }
            }

        }

        hideRecyclerView(productsList.isEmpty(), category.name)

    }

    private fun hideRecyclerView(hide: Boolean, categoryName: String) {
        if (hide) {
            if (rv_products.visibility == View.VISIBLE) {
                rv_products.visibility = View.GONE
                rv_products.startAnimation(AnimationUtils.loadAnimation(this, R.anim.to_right))
            }

            tv_message.text = "${getString(R.string.message_empty_category)} '$categoryName'."
            tv_message.visibility = View.VISIBLE
            tv_message.startAnimation(AnimationUtils.loadAnimation(this, R.anim.from_left))
            return
        }
            if (tv_message.visibility == View.VISIBLE) {
                tv_message.visibility = View.GONE
                tv_message.startAnimation(AnimationUtils.loadAnimation(this, R.anim.to_left))
                rv_products.visibility = View.VISIBLE
                rv_products.startAnimation(AnimationUtils.loadAnimation(this, R.anim.from_right))
            }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_produtos, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item?.let {
            when (it.itemId) {
                android.R.id.home -> toast(getString(R.string.message_its_a_demo))
                R.id.item_search -> toast(getString(R.string.message_its_a_demo))
                R.id.item_favorites -> toast(getString(R.string.message_its_a_demo))
                R.id.item_shopping_cart -> toast(getString(R.string.message_its_a_demo))
                else -> null
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun toast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}
