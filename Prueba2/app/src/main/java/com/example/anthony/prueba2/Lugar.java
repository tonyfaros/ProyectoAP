package com.example.anthony.prueba2;

import android.graphics.Bitmap;

/**
 * Created by Anthony on 30/08/2017.
 */

public class Lugar {
    private int id;
    private String nombre;
    private String descripcion;
    private int tarifa;
    private String horario;
    private String direccion;
    private String telefono;
    private Bitmap foto;
    private String comentarios;

    public Lugar(int id,String nombre, String descripcion, int tarifa, String horario, String direccion, String telefono, /*Bitmap foto,*/ String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
        this.horario = horario;
        this.direccion = direccion;
        this.telefono = telefono;
        //this.foto = foto;
        this.comentarios = comentarios;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Bitmap getFoto() {
        return foto;
    }

    public void setFoto(Bitmap foto) {
        this.foto = foto;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
