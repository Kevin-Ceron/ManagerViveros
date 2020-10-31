/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.model;

import javax.persistence.*;


/**
 *
 * @author alfar
 */
@Entity
@Table(name = "viveros")
public class Vivero {
    
    @Id
    @Column
    private int     idviveros;
    @Column
    private String  nombre;
    @Column
    private String  ubicacion;

    public Vivero(int idviveros, String nombre, String ubicacion) {
        this.idviveros = idviveros;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Vivero() {
    }

    public int getIdviveros() {
        return idviveros;
    }

    public void setIdviveros(int idviveros) {
        this.idviveros = idviveros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
}
