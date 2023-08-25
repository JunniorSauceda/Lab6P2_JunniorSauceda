/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import java.util.ArrayList;

/**
 *
 * @author Junnior Sauceda
 */
public class Consola {
    private String Id,fabricante,modelo;
    private int anios_uso;
    private double precio;
    private ArrayList<Juego> juegos=new ArrayList<>();

    public Consola() {
    }

    
    
    public Consola(String Id, String fabricante, String modelo, int anios_uso, double precio) {
        this.Id = Id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anios_uso = anios_uso;
        this.precio = precio;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnios_uso() {
        return anios_uso;
    }

    public void setAnios_uso(int anios_uso) {
        this.anios_uso = anios_uso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    @Override
    public String toString() {
        return "Consola: " + modelo +"";
    }
    
    
    
}
