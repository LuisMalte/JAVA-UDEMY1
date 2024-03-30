package org.lsmalte.almacen;

public class NoPerecible extends Producto {
   private int contenido;
   private int calorias;

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public NoPerecible(String nombre, double precio,int contenido, int calorias) {
        super(nombre,precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }



}
