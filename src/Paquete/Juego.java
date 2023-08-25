/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import java.util.Date;

/**
 *
 * @author Junnior Sauceda
 */
public class Juego {
    private String nombre,descripcion;
    private int cant_disp;
    private double precio;
    private boolean nuevo,rentable,agregado;
    private Date lanzamiento;

    public Juego() {
    }

    public Juego(String nombre, String descripcion, int cant_disp, double precio, boolean nuevo, boolean rentable, boolean agregado, Date lanzamiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cant_disp = cant_disp;
        this.precio = precio;
        this.nuevo = nuevo;
        this.rentable = rentable;
        this.agregado = agregado;
        this.lanzamiento = lanzamiento;
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

    public int getCant_disp() {
        return cant_disp;
    }

    public void setCant_disp(int cant_disp) {
        this.cant_disp = cant_disp;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public Date getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(Date lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    @Override
    public String toString() {
        return nombre + "___" + cant_disp + "     precio=" + precio + "   rentable=" + rentable ;
    }
    
}
