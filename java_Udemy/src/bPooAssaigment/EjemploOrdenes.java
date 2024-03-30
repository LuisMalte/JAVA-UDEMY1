package bPooAssaigment;

import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("hogar");
        orden1.addProducto(new Producto(500000, "mesa","muebles" ))
                .addProducto(new Producto(60000, "vajilla","corona" ))
                .addProducto(new Producto(1000000, "lavadora","lg" ))
                .addProducto(new Producto(200000, "cama","mabe" ));
        orden1.setCliente(new Cliente("luis","malte"));
        orden1.setFecha(new Date());

        OrdenCompra orden2 = new OrdenCompra("celulares");
        orden2.addProducto(new Producto(600000, "redmi note ","xiaomi" ))
                .addProducto(new Producto(500000, "iphone 7","apple" ))
                .addProducto(new Producto(400000, "A30","samsung" ))
                .addProducto(new Producto(1000000, "p40","huawei" ));
        orden2.setCliente(new Cliente("tony","soprano"));
        orden2.setFecha(new Date());

        OrdenCompra orden3 = new OrdenCompra("ropa");
        orden3.addProducto(new Producto(60000, "camiseta ","koaj" ))
                .addProducto(new Producto( 90000,"pantalon","Arturo C" ))
                .addProducto(new Producto(70000, "sudadera ","nike" ))
                .addProducto(new Producto(200000, "zapatos","adidas" ));
        orden3.setCliente(new Cliente("christopher  ","moltisanti"));
        orden3.setFecha(new Date());


        OrdenCompra[] ordenes ={orden1,orden2, orden3};

        for (OrdenCompra orden: ordenes) {
            System.out.println("Id: " + orden.getId());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());

            System.out.println("---------------PRODUCTOS----------------");
            int i = 1;
            for (Producto producto : orden.getProductos()) {
                System.out.println("Producto  #" + i + ": " + producto.getNombre() + " " + producto.getFabricante() + " precio $" + producto.getPrecio());
                i++;
            }
            System.out.println("---------------FIN---------------");

            System.out.println("Total suma de productos: " + orden.sumarProducto());
            System.out.println("==========================================siguiente==========================================\n");

        }

    }
}
