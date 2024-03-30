package primitivosYStrings;

import javax.swing.*;
import java.util.Scanner;

public class Facturas {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingrese el nombre de la factura: ");
       String name = scanner.nextLine();

       System.out.print("ingrese el precio del producto 1: "); //  alt+mayus+enter para tener multiples cursores
       double producto1 = Double.parseDouble( scanner.nextLine());

        System.out.print("ingrese el precio del producto 2: "); //  alt+mayus+enter para tener multiples cursores
        double producto2 = Double.parseDouble( scanner.nextLine());

        double totalBruto = producto2+producto1;
        double totalImpuesto = totalBruto*0.19; //puede ser también (total bruto * 19 )/100
        double masImpuesto = totalImpuesto+totalBruto;

        String mensaje = "La factura " +name+ " tiene un total bruto de " + totalBruto+", con un impuesto de "+totalImpuesto+" y el monto después de impuesto es de "+masImpuesto ;

        System.out.println(mensaje);








    }
}
