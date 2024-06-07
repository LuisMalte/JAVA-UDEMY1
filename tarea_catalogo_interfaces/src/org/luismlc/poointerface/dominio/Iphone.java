package org.luismlc.poointerface.dominio;

public class Iphone extends Electronico implements IProducto {
    private  String color;
    private  String modelo;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*0.9;

    }
    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }
}
