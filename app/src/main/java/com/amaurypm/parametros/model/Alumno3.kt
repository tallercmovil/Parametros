package com.amaurypm.parametros.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Creado por Amaury Perea Matsumura el 11/11/22
 */
@Parcelize
data class Alumno3 (
    var id: Int,
    var nombre: String,
    var tipo: String
): Parcelable