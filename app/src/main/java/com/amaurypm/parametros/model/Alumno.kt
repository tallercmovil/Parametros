package com.amaurypm.parametros.model

import java.io.Serializable

/**
 * Creado por Amaury Perea Matsumura el 04/11/22
 */
data class Alumno(
    var id: Int,
    var nombre: String,
    var tipo: String
): Serializable

