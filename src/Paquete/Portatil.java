/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author Junnior Sauceda
 */
public class Portatil extends Consola{
    private String tam_pant;
    private int bateria;
    private boolean estuche;

    public Portatil() {
        super();
    }

    public Portatil(String tam_pant, int bateria, boolean estuche, String Id, String fabricante, String modelo, int anios_uso, double precio) {
        super(Id, fabricante, modelo, anios_uso, precio);
        this.tam_pant = tam_pant;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    public String getTam_pant() {
        return tam_pant;
    }

    public void setTam_pant(String tam_pant) {
        this.tam_pant = tam_pant;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

    @Override
    public String toString() {
        String si;
        if(estuche){
            si="Si";
        }
        else{
            si="No";
        }
        return "Pantalla" + tam_pant + ", bateria=" + bateria + "Holas" +si+ " tiene estuche";
    }
    
    
}
