package com.example.marcelopr.greenhouse.domain

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class Plant(
    val name: String,
    val description: String,
    val price: Double,
    val height: String,
    val light: String,
    val img: Int
) : Parcelable {

    fun getPriceBRFormat(moneySignLabel: String): String =

        String
            .format(
                Locale.GERMANY,
                "%s %.2f",
                moneySignLabel,
                price
            )

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeDouble(price)
        parcel.writeString(height)
        parcel.writeString(light)
        parcel.writeInt(img)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        /*
               * Constante criada para ser utilizada como chave de envio na
               * transferência de um objeto Plant da atividade MainActivity
               * para a atividade de detalhes da planta.
               * */
        const val KEY = "plant_key"

        @JvmField
        val CREATOR: Parcelable.Creator<Plant> = object : Parcelable.Creator<Plant> {
            override fun createFromParcel(source: Parcel): Plant = Plant(source)
            override fun newArray(size: Int): Array<Plant?> = arrayOfNulls(size)
        }

    }

}