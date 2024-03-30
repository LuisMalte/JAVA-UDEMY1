package org.lsmalte.appFacturas;

import org.lsmalte.appFacturas.modelo.*;

import java.util.Scanner;

public class ejmFacturas {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNif("1223-1");
        cliente1.setNombre("Juan");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la descripción de la factura ");
        String descripcion = scanner.nextLine();
        Factura factura1 = new Factura(descripcion,cliente1);

        Producto producto1;
      /*  String nombre;
        float precio;
        int cantidad;*/

        System.out.println();

        for(int i =0; i<5; i++){
            producto1 = new Producto();
            System.out.print("Ingrese el nombre del productor n° "+ producto1.getCodigo()+ ": ");
           //next solo toma una palabra mientras que next line toma toda una linea
            producto1.setNombre( scanner.next());

            System.out.print("ingrese el precio: ");
          ;
            producto1.setPrecio(scanner.nextFloat());

            System.out.print("ingrese la cantidad: ");

            factura1.addFactura( new ItemFactura( scanner.nextInt(),producto1));

            System.out.println();
        }
        System.out.println(factura1);
        /*se modifico el codigo en el metodo tostring para que cada objeto al llamarlo se imprimiera su informacion
        y de esa manera se ahorraria el usar un for para recorer todos los objetos y poner un .getnombre o algo asi
*/

        /*al usar el debugger el stepover lo que hace es ir con la siguiente linea de codigo y el
        * stepinto sirve cuando estemos en una linea donde haya un metodo en otra clase al usar el stepinto nos llevara al metodo y podremos
        * ver el paso a paso*/
    }
}