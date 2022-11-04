package com.amaurypm.parametros.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Creado por Amaury Perea Matsumura el 04/11/22
 */
data class Alumno2 (
    var id: Int?,
    var nombre: String?,
    var tipo: String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(nombre)
        parcel.writeString(tipo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Alumno2> {
        override fun createFromParcel(parcel: Parcel): Alumno2 {
            return Alumno2(parcel)
        }

        override fun newArray(size: Int): Array<Alumno2?> {
            return arrayOfNulls(size)
        }
    }
}