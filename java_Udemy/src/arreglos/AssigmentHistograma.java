package arreglos;

import java.util.Scanner;

public class AssigmentHistograma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[12];
        String[] arregloCantidad = new String[6];
        int length = arreglo.length;

        for (int i = 0; i < 12; i++) {
            System.out.print("\n ingrese un numero del rango 1-6: ");
            arreglo[i] = scanner.nextInt();

        }
        for (int i = 0; i < 6; i++) {
            int aux = i + 1;
            String histograma = aux + " => ";
            for (int j = 0; j < 6; j++) {
                if (aux == arreglo[j]) {
                    histograma += "*";
                }
            }
            arregloCantidad[i] = histograma;
        }
        //este es una manera de hacer un histogra un hitograma es una fomra grafica de represnetar la cantidad de elementos qeu hay
        /*puede darse por  * o por / en ese caso es muy similar a revisar la cantidad de los elementos peor con la difrencia
        * de que la cantidad la damamos  por un * y en caso de que no haya pues queda vació  */
        for (int i = 0; i<6; i++){
            System.out.printf(arregloCantidad[i]+"\n");
        }


        }

}
