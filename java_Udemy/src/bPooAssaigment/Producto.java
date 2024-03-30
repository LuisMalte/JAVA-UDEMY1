package bPooAssaigment;

import java.util.Date;

public class Producto {
    private int precio;
    private String nombre;
     private String fabricante;


    public Producto(int precio, String nombre, String fabricante) {
        this.precio = precio;
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
