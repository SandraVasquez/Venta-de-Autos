/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;

/**
 *
 * @author UTBIS
 */
public class wagen {
    
    private String modelo;
    private String color;
    private String placas;
    private double precio;
    
    public wagen (String modelo,String color,String placas, double precio){
        this.modelo = modelo;
        this.color = color;
        this.placas = placas;
        this.precio = precio;
    }

    public String getModelo() {
        System.out.println("Modelo: ");
        return modelo;
    }

    public void setModelo(String nombre) {
        this.modelo = nombre;
    }

    public String getColor() {
        System.out.println("Color: ");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlacas() {
        System.out.println("Placas: ");
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public double getPrecio() {
        System.out.println("Precio: $");
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
