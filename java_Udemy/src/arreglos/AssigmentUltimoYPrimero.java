package arreglos;

import java.util.Scanner;


public class AssigmentUltimoYPrimero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int length = arreglo.length;

        for (int i = 0; i < length; i++) {
            System.out.print("\n ingrese un numero: ");
            arreglo[i] = scanner.nextInt();

        }

        System.out.println("==================================================================================  ");
        int ultimo;
        int primero;

        for(int i = 0; i<length-i; i++){
            ultimo=arreglo[length-1-i];
            primero= arreglo[i];
            System.out.printf("%s = %s -> %s = %s \n", length-1-i, ultimo,i,primero);
            System.out.println("==================================================================================  ");
        }

    }

}
