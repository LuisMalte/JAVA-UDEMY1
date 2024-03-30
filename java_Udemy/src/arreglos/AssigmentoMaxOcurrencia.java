package arreglos;

import java.util.Scanner;

public class AssigmentoMaxOcurrencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int[] arregloCantidad    = new int[10];
        int length = arreglo.length;

        for (int i = 0; i < 10; i++) {
            System.out.print("\n ingrese un numero del 1-9: ");
            arreglo[i] = scanner.nextInt();

        }



        for (int i = 0; i < 10; i++) {
            int cantidad = 0;
            for (int j = 0; j < 10; j++){
                if (arreglo[i]==arreglo[j]){
                    cantidad++;
                }
            }
            arregloCantidad[i]= cantidad;
        }
        int posicion =0;
        int cantidadMax =arregloCantidad[0];
        for (int i = 1; i < 10; i++) {
            if (arregloCantidad[i]<arregloCantidad[i]){
                cantidadMax=arregloCantidad[i];
                posicion=i;
            }
        }
        System.out.printf("la numero con mas ocurrencias es %s con %s ocurrencia",arreglo[posicion],cantidadMax );

        }

}
