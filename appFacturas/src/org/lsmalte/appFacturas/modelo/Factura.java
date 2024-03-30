package org.lsmalte.appFacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;

    private ItemFactura[] items;

    public static int indiceFacturas;
    private int ultimoFolio;
    public static final int MAX_ITEMS = 12;


    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        /*pre incremento para que comience en 1 el folio o id */
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addFactura(ItemFactura item) {
        if (indiceFacturas < MAX_ITEMS) {
            this.items[indiceFacturas++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura i : items) {
            if (i == null) {
                continue;
            }
            total = i.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        final StringBuilder sb = new StringBuilder("Factura N°: ")
                .append(folio)
                .append("\ncliente: ")
                .append(cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\n Descripción ")
                .append(this.descripcion)
                .append("\n");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd 'de' MMM, yyy");
        sb.append("Fecha emisión: ")
                .append(simpleDateFormat.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (ItemFactura itemFactura : items) {
            if (itemFactura == null) {
                continue;
            }
            sb.append(itemFactura)
                    .append("\n");

        }
        sb.append("\nGran Total: ")
                .append(calcularTotal())
                .append("\n");

        return sb.toString();

    }

    @Override
    public String toString() {
        return generarDetalle();
    }
    /*Para acomadar el codigo ctrl alt l*/

}
