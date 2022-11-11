package com.amaurypm.parametros.model;

import java.io.Serializable;

/**
 * Creado por Amaury Perea Matsumura el 11/11/22
 */
public class Alumno4 implements Serializable {
    int id;
    String nombre;
    String tipo;

    public Alumno4(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
