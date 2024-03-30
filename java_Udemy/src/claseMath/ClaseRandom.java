package claseMath;

import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {

        Random objRandom = new Random();

        int numRandom = objRandom.nextInt(7)+1;

        while (numRandom!=7){
            System.out.println("numRandom = " + numRandom);
            numRandom = objRandom.nextInt(7)+1; // aqui los numeros dados seran  del 1 al 7 incluido el siete
            // si se desea que no se llegue al siete entonces hay que quitar el +1
        }
        System.out.println("sali del bucle porque el numero es = " + numRandom);

        numRandom = 10 +objRandom.nextInt(20-10+1); /*esta es la manera de que los la clase ramdom tenga un rango
        ya que lo que se hace es que lo que esta adentro del paretecis de 11 o sea que dara cualquier numero del 1 al 10
         y luego se le suma 10 para que de los numero dentro de ese rango es decir si random.nextint da 1 se le suma 10 dara
          11 y asi con los demas nuermos */
        System.out.println("numRandom = " + numRandom);

        String[] colores ={"rojo","negro","amarillo","verde", "naranja"};

        numRandom =objRandom.nextInt(colores.length); // y de esta manera se puede selecionar de
        // manera aletoria un objeto de un array

        System.out.println("colores[numRandom] = " + colores[numRandom]);


    }
}
