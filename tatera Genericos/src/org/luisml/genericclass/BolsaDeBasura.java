package org.luisml.genericclass;

import java.util.ArrayList;
import java.util.List;

public class BolsaDeBasura<T> {
    private List<T> productos;
    private final int max = 5;

    public BolsaDeBasura() {
        this.productos = new ArrayList<>();
    }

    /*metodo generico para agregar */
    public void addProducto(T objeto) {
        if (this.productos.size() <= max) {
            this.productos.add(objeto);
        } else {
            throw new RuntimeException("no hay más espacio.");
        }

    }

    public List<T> getProductos() {
        return productos;
    }
}



