package org.luismlc.poointerface.dominio;

public abstract class Producto implements IProducto {

    private int precio;


    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
    /* no se usa el get normal si no se usa
    * el get de la interface **/
}
