package com.example.marcelopr.greenhouse

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.marcelopr.greenhouse.domain.Product
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.app_bar.*

class ProductDetailsActivity : AppCompatActivity() {

    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Obtendo o objeto Product enviado via Intent.
        product = intent.getParcelableExtra(Product.KEY)

        //Preenchendo campos
        Picasso.get().load(product.img).into(iv_product_img)
        tv_name.text = product.name
        tv_price.text = product.getPriceBRFormat(getString(R.string.label_money_sign))
        tv_description.text = product.description
        tv_height.text = product.getCentimetersFormat(getString(R.string.label_centimeters_sign), product.height)
        tv_width.text = product.getCentimetersFormat(getString(R.string.label_centimeters_sign), product.width)
        tv_depth.text = product.getCentimetersFormat(getString(R.string.label_centimeters_sign), product.depth)

        btn_add_to_cart.setOnClickListener { toast(getString(R.string.message_its_a_demo)) }
        btn_add_favorite.setOnClickListener { toast(getString(R.string.message_its_a_demo)) }

    }

    fun addFavorite(view: View) {
        if (btn_add_favorite.drawable.equals(resources.getDrawable(R.drawable.ic_favorite))) {
            btn_add_favorite.setImageResource(R.drawable.ic_favorite_selected)
            return
        }
        btn_add_favorite.setImageResource(R.drawable.ic_favorite)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_produto, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item?.let {
            when (it.itemId) {
                android.R.id.home -> finish()
                R.id.item_share -> toast(getString(R.string.message_its_a_demo))
                R.id.item_shopping_cart -> toast(getString(R.string.message_its_a_demo))
                else -> null
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}
