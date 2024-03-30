package arreglos;

import java.util.Scanner;

public class AgregarElementoEnPosicionAdecuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
int length = arreglo.length;

        for (int i = 0; i < 9; i++) {
            System.out.print("\n ingrese un numero: ");
            arreglo[i] = scanner.nextInt();

        }

        System.out.println("==================================================================================  ");

        System.out.print("\n ingrese un numero: ");
        int num = scanner.nextInt();
        int posicion =0;

        while ( posicion <length  && arreglo[posicion] < num ) {
            posicion++;
        }

        System.out.println("posicion = " + posicion);

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-ANTES-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

/* lo siguiente es la explicacion de porque debe ir primero  posicion <length

el porqué es por el pos incremento ya que en caso de que   el numero a
 evaluar sea mayor a todos los elementos del array si la condicion
 arreglo[posicion] < num  esta de primeras  entonces por el pos incremento ira a una posicion
 extra que no existe entonces habra un desbordamiento caso contrario si la primera condiccion es posicion
  < arreglo.length ya que  si esta es falsa no tendra que evaluar la condicion  arreglo[posicion] < num*/


        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }


        for ( int i = length-2; i>=posicion;i--){
            arreglo[i+1]= arreglo[i];

        }
        arreglo[posicion]=num;

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_DESPUÉS_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }
        /*esta funcion igual que los otras que corren posiciones
          */
    }

}
