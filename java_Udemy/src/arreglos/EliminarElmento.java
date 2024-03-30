package arreglos;

import java.util.Scanner;

public class EliminarElmento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int length = arreglo.length;

        for (int i = 0; i < length; i++) {
           arreglo[i] = i+1;
        }



        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-ANTES-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");



        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" => "+ arreglo[i]);
        }

        System.out.println("==================================================================================  ");

        System.out.print("\n ingrese un numero: ");
        int num = scanner.nextInt();

        ///////////////////////////////////////////////////////


        int posicion =0;
        while ( posicion <length  && arreglo[posicion] != num ) {
            posicion++;
        }



        for (int  i=posicion; i<length-1;i++) {
            arreglo[i]= arreglo[i+1];
        }


        int[] arreglo2 = new int[9];

        System.arraycopy(arreglo, 0, arreglo2, 0, arreglo2.length);
        /*esta es una forma mas facil de copiar un arreglo el primer argumento es
        * el objeto de que se va a copiar el otro argumento es desde donde se empiza a copiar
        * del arreglo original el siguente argumenot es el argumento copia y el otro argumento es de
        * donde donde va acopiar el arreglo copia y el ultimo argumento es que tanto
        * elementos va  se van a copiar */


        /*Esta es la manera de borrar un elmento y que los objeots cambien de posicion hacia arriba lo que se hace
        * es que con un bucle for que parte desde la posicion del elmento que se desea borrar ya que solo se cambiaran de
        * posicion los elemntos que estan despues del numero a borrar para que se pase a otro valor
        * lo que se hace es que el objeto en cierta posicion tome el valor del siguinte posicion y despues el elmento
        * del que se le quito el objeto toma su siguiente y se hace hasta el penultimo es decir que el ultimo y penultimo
        * tienen el mismo valor pero debe ser asi ya que en caso de ir hasta la ultima posicion habra un desboramiento
        * por que no hay un valor siguiente para el ultimo */

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_DESPUÉS DE BORRAR _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");
        for (int  i=0; i< arreglo2.length;i++) {
            System.out.println( (i) +" => "+ arreglo2[i]);
        }

    }

}
