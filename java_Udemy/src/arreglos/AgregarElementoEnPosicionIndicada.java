package arreglos;

import java.util.Scanner;

public class AgregarElementoEnPosicionIndicada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int length =  arreglo.length;



        for (int i =0; i<length-1;i++){
            arreglo[i]= i+1;
        }


        System.out.print("\n ingrese un numero: " );
        int num = scanner.nextInt();

        System.out.print("\n ingrese la posicion de ese numero: " );
        int posicion = scanner.nextInt();

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-ANTES-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

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
        /*Esta es la una manera de agregar un objeto con  una posicion deseada y pasa igual con desplazar la posicion lo que
        * cambia es que en vez de que llegue a 0 es que llegue hasta la posicion que se agrego el nuevo objeto y asi se corren
        * en una posicion pero no corre los objetos antes de la posicion que se dio
        * y luego se agrega el nuevo objeto al arreglo en la posicion deseada     */
    }

    

}
