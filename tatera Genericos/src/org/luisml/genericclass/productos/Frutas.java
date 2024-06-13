package org.luisml.genericclass.productos;


public class Frutas extends Producto {

    private double peso;
    private String color;

    public Frutas(double peso, String color, String nombre, double precio) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}