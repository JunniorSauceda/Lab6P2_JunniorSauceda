/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Junnior Sauceda
 */
public class Estacionaria extends Consola{
    private int controles,almacenamiento;
    private String tipo_con;

    public Estacionaria() {
        super();
    }

    public Estacionaria(int controles, int almacenamiento, String tipo_con, String Id, String fabricante, String modelo, int anios_uso, double precio) {
        super(Id, fabricante, modelo, anios_uso, precio);
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.tipo_con = tipo_con;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipo_con() {
        return tipo_con;
    }

    public void setTipo_con(String tipo_con) {
        this.tipo_con = tipo_con;
    }

    @Override
    public String toString() {
        return "Espacio de almacenamiento: " + almacenamiento + ", Tipo de conexion=" + tipo_con + '}';
    }
    
    
    
    
}
