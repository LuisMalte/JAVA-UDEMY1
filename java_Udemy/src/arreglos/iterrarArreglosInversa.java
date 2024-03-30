package arreglos;

import java.util.Arrays;

public class iterrarArreglosInversa {
    public static void main(String[] args) {
         int [] arreglo1 = new int[5];
         arreglo1[0] = 32;
         arreglo1[1] = 18;
         arreglo1[2] = 15;
         arreglo1[3] = 1;
         arreglo1[4] = 0;

         Arrays.sort(arreglo1);//esto es lo que hace es que la posicion de los arreglos cambien por el orden de menor a mayor
        // el objeto cero ahora sera 0 y el objeto 4 sera 32

        System.out.println("arreglo1[0] = " + arreglo1[0]);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +
                "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FORMA 1-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
        int length = arreglo1.length;
        for (int  i=0; i<=length-1;i++) {
            System.out.println( (length-1-i) +" = "+ arreglo1[length-1-i]);
            //esta es una manera de imprimir de manera inversa lo que se hace es que con el tamañano de
            /*arreglo se le resta uno queda 4 y luego se le va restando i qeu es lo del for por ejemplo
            * al incio del for se resta por 0 luego entonces queda 4 entonces se imprime el objeto con
            * con la ubicacion 4  */
        }
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n"
                + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FORMA 2-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");

        for(int i =length-1;i>=0; i--){
            /*esta otra forma es necesario que sea asi es decir no hay una opcion dos
            * ya que  length es 5 entonces pero en el arreglo el valor 5 no existe entonces hay que restarle 1
            * y tiene que ser >= ya que en caso contrario nunca llegaria al arreglo 0*/
            System.out.println( (i) +" = "+ arreglo1[i]);
        }


    }
}
