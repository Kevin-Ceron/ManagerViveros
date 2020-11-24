/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.model;

import javax.persistence.*;
/**
 *
 * @author ferna
 */
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @Column
    private int idproductos;
    @Column
    private String nombre;
    @Column
    private String registroIca;
    @Column 
    private String frecuenciaAplicacion;
    @Column
    private String descripcion;
    @Column
    private float precio;

    public Producto(int idproductos, String nombre, String registroIca, String frecuenciaAplicacion, String descripcion, float precio) {
        this.idproductos = idproductos;
        this.nombre = nombre;
        this.registroIca = registroIca;
        this.frecuenciaAplicacion = frecuenciaAplicacion;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto() {
    }

    public int getIdproducto() {
        return idproductos;
    }

    public void setIdproducto(int idproducto) {
        this.idproductos = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistroIca() {
        return registroIca;
    }

    public void setRegistroIca(String registroIca) {
        this.registroIca = registroIca;
    }

    public String getFrecuenciaAplicacion() {
        return frecuenciaAplicacion;
    }

    public void setFrecuenciaAplicacion(String frecuenciaAplicacion) {
        this.frecuenciaAplicacion = frecuenciaAplicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    
    
    
    
    
}
