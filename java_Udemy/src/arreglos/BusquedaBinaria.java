package arreglos;

import java.util.Scanner;

public class    BusquedaBinaria {
    public  static  int busqueda(int array[],int valor ){
        int cabeza = 0;
        int cola = array.length-1;

        while (cabeza<=cola){
            int medio = (cabeza+cola)/2;
            if (array[medio]==valor){
                return medio;
            } else if (array[medio]<valor) {
                cabeza = medio+1;
            }else{
                cola= medio-1;
            }
        }

        return-1;
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arreglo = {10,2,3,4,5,6,7,8,9,10,12};

     int num = busqueda(arreglo,6);
        if (num==-1){
            System.out.printf("El numero %s no se encontró", 6);

        }else
        {
            System.out.printf("El numero 6 se encontro la posicion %s ", num);
        }

    }

    //esta es una manera de para encontrar un numero de manaera mas eficaz lo que se hace es coger las dos coloas del
    /*array y luego sumarlas y dividirlo de esa manera hayamos la mitad entonces luego miramos si la mitad es igual, mayor o menor
    * alnumero que buscamos en caso de que sea mayor pues retrocedemos el valor que tenia la cola y luego sumamos
    * por la cabeza y luego dividmos entre dos entonces tendremos un numero un numero menor que el anterior y asi nos vamos
    * acercadno hasta que se igual y si el numero de la mitad es menor entonces le sumamos 1 a la varialbe que tenia la cabeza y
    * repetimos el proceso entonces  y todo esto lo hacemos en un while donde se repita mientras el la varialbe que tiene la cabeza se
    *se menor o igual a la variable de la cola - */

}
