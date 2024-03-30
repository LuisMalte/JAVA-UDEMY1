package arreglos;

import java.util.Scanner;

public class aregarElementoEnNuevoArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
int length = arreglo.length;

        for (int i = 0; i < length; i++) {
            arreglo[i] = i+1;

        }

        System.out.println("==================================================================================  ");

        System.out.print("\n ingrese un numero: ");
        int num = scanner.nextInt();
        System.out.print("\n ingrese un la posicion para ese elemento: ");
        int posicion =scanner.nextInt();;



        System.out.println("posicion = " + posicion);

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-ANTES-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");



        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }

        //////////////////////////////////////////////////////////
        int ultimo = arreglo[length-1];

        for ( int i = length-2; i>=posicion;i--){
            arreglo[i+1]= arreglo[i];

        }


        int[] arreglo2 = new int[11];

        System.arraycopy(arreglo,0,arreglo2,0 ,length);
        arreglo2[posicion] =num;
        arreglo2[length] = ultimo;


        arreglo= arreglo2;
        /*este es un es la manera de agregar un nuevo elemento a un arreglo pero agrandandolo lo que se hace es que */
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_DESPUÉS_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");
        for (int  i=0; i<length+1;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }
        /*esta funcion igual que los otras que corren posiciones hacia abajo despues de la posicion del que se dio por consola
        para dejar un espacion libre pero como siempre se pierde el ultimo elmento se guarda
        y la despues de habar corrido todo se copia el arreglo corrido a otro mas grande por un elemento
        de ahi se da el valor del ultimo elemento del nuevo arreglo como  la variable guardada del elmento que se perdio
        y se ubica como el elemento nuevo en la posicion que se dio
        lo ultimo es que se iguala un arregloCopy al arreglo original y esto es lo que se hace que practicamente se modifique el
        arreglooriginal y tome todo lo del copia incluso el tamaño
          */
    }

}
