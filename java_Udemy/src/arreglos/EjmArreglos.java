package arreglos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjmArreglos {
    public static void main(String[] args) {
         String arreglo[] = new String[5];/*Esta es una manera de crear un arreglo poner [] después del nombre */
         arreglo[0] = "vaso";
         arreglo[1] = "taza";
         arreglo[2] = "casa";
         arreglo[3] = "banano";
         arreglo[4] = "arroz";

        for (String i :arreglo) {
            System.out.println("i = " + i);
        }
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");

        Arrays.sort(arreglo);
        /*estas es una manera de usar métodos para los arreglos y lo que hace este arreglo es que lo organiza
        * por orden alfabético*/
        for (String i :arreglo) {
            System.out.println("i = " + i);
        }

    }
}
