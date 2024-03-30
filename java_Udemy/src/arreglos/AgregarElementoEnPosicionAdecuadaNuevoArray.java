package arreglos;

import java.util.Scanner;

    public class AgregarElementoEnPosicionAdecuadaNuevoArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int[] arregloCopy = new int[11];
        int length = arreglo.length;

        for (int i = 0; i < length; i++) {
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


        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-ANTES-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");


        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }

////////////////////////////////////////////////////////////////////////////////

        int ultimo = arreglo[length-1];
        for ( int i = length-2; i>=posicion;i--){
            arreglo[i+1]= arreglo[i];

        }
        System.arraycopy(arreglo,0,arregloCopy,0,length);
        arregloCopy[length]=ultimo;
        arregloCopy[posicion]= num;


        arreglo=arregloCopy;
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_DESPUÉS_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");
        for (int  i=0; i<length+1;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }
        /*esta funcion igual que los otras que corren posiciones
          */
    }

}
