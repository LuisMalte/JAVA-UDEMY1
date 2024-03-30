package arreglos;

import java.util.Scanner;

public class NumeroMayor {


    public static void Mayor(int[] arreglo) {
        int length2 =  arreglo.length;
        int max= 0;
        for (int i= 1; i<length2; i++) {
            max = (arreglo[max]>arreglo[i])? max:i ;
        }


        System.out.println("el numero mayor fue = " + arreglo[max]);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] arreglo1 = new int[5];
        int length = arreglo1.length;
        for (int i = 0; i < length; i++) {
            System.out.print(" Ingrese un Numero: " );
            arreglo1[i] = scanner.nextInt();
        }

       Mayor(arreglo1);
    }
    

}
