package arreglos;

import java.util.Arrays;

public class iterrarArreglos {
    public static void main(String[] args) {
         int [] arreglo = new int[5];
         arreglo[0] = 32;
         arreglo[1] = 18;
         arreglo[2] = 14;
         arreglo[3] = 1;
         arreglo[4] = 0;

         Arrays.sort(arreglo);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_USANDO FOR-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
        int length = arreglo.length; // se hace esto, ya que de esta manera no pide la misma funcion cada vez que se itera
        for (int  i=0; i<=length-1;i++) { /*esta es lo mismo que hacer i<length al ponerle el = entonces va hasta el último valor, pero como length
        es solo el tamaño entonces hay que restarle 1 para que no haya un desborde */
            System.out.println("i = " + arreglo[i]);
        }
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_USANDO FOR EACH-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");

        for (int  i :arreglo) {
            System.out.println("i = " + i);
        }

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_WHILE-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");

        int i=0;
        while (i<length){
            System.out.println("i = " + arreglo[i]);
            i++;
        }
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_DO WHILE-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
        i=0;
        do{
            System.out.println("i = " + arreglo[i]);
            i++;
        }while (i<length);


    }
}
