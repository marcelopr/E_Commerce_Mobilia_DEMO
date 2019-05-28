package com.example.marcelopr.greenhouse.domain

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class Product(
    val category: Int,
    val name: String,
    val description: String,
    val price: Double,
    val height: Int,
    val width: Int,
    val depth: Int,
    val img: Int
) : Parcelable{

    fun getCentimetersFormat(centimetersSign: String, centimeters: Int) : String =
        "$centimeters $centimetersSign"

    fun getPriceBRFormat(moneySignLabel: String): String =

        String
            .format(
                Locale.GERMANY,
                "%s %.2f",
                moneySignLabel,
                price
            )

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(category)
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeDouble(price)
        parcel.writeInt(height)
        parcel.writeInt(width)
        parcel.writeInt(depth)
        parcel.writeInt(img)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {

        const val KEY = "chair_key"

        @JvmField
        val CREATOR: Parcelable.Creator<Product> = object : Parcelable.Creator<Product>{
            override fun createFromParcel(source: Parcel): Product = Product(source)
            override fun newArray(size: Int): Array<Product?> = arrayOfNulls(size)
        }

    }

}