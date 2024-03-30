package bPooAssaigment;

import java.util.Date;

public class OrdenCompra {
    private Integer id;
    private static int ultimoid;
    private String descripcion;
    private Date  fecha;

    private Cliente cliente;

    private  Producto[] productos;




    public OrdenCompra(String descripcion) {
        this.id = ++ultimoid;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    private  int indiceProductos=0;
    public OrdenCompra addProducto (Producto producto){
        if(indiceProductos<productos.length){
            this.productos[indiceProductos++] = producto;
        }
        return this;
    }

    public int sumarProducto(){
        int sum = 0;
        for (Producto producto : this.productos) {
            sum += producto.getPrecio();
        }
        return sum;
    }
}
