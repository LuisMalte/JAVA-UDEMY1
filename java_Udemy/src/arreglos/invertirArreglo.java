package arreglos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class invertirArreglo {
    public static void inverse(int[]arreglo){
        int length =  arreglo.length;
        int length2 =  arreglo.length;
        for (int i= 0; i<length2; i++){
            int primero = arreglo[i];
            int ultimo = arreglo[length-1-i];
            arreglo[i] = ultimo;
            arreglo[length-1-i] = primero;
            length2--;

        }
    }
    /*esta es una manera de invertir todo un arreglo incluyendo los indices
    *para ello primero hacemos creamos un variales donde al principo el uno tendra el valor del primer indicie
    * y el otro sera del ultimo indice  para luego truacarlos o se el que tenia el ultimo valor ahora su indice sera 0
    * y el elpremero sera el ultimo
    * pero  el bulce for tiene que parar en la mitad ya que si no para en la mitad seguira haciendo lo mismo y dejara el arreglo igual
    * ya que en el for cuando va por la mitad del arreglo  ya se tiene el arreglo inverso entonces a tener otra mitad volvera hacer lo mismo
    * volvienodlo en al estado actual para eso hay dor formas
    * una es dividiendo el length del arreglo por la mitad asi llegaria casi la mitad  ya que 5 /2 en int es 2 entonces  hace dos vueltas
    * a comoda el ultimo con el primero y el penultimo con el seundo y ya con el medio lo deja como esta en caso de que sea un numero par
    * si va hasta la mitad y pues hace lo mismo pero con la diferencia de que con los dos de la mitad si los revuelve
    * o la otra es que irle restando a cada vuelta para que llegue casi mas a li mitad es decir si a un arreglo de 5
    * entonces el bulce hace un giro treces veces pero el de la mitad como no hay nadie queda en el mismo sitio
    * porque ambas variables primera y ultima serian la mitad y si es un arreglo par entonces hace lo mismo da tres vuleta pero
    * esta vez si tiene con quien internal */
    public static void main(String[] args) {
         int [] arreglo = new int[5];
         arreglo[0] = 32;
         arreglo[1] = 18;
         arreglo[2] = 14;
         arreglo[3] = 1;
         arreglo[4] = 0;

        int length =  arreglo.length;
        Arrays.sort(arreglo);
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Normal-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");//esta es una manera de crear un bloque de texto donde se puede hacer saltos de línea y cualquier
        //cosa como si estuviera escribiendo en un word
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Inversa-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");
        inverse(arreglo);
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- Inversa Collections-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
     
                \s""");
        Collections.reverse(Arrays.asList(arreglo));
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }
        /*esta es una forma pero  no funciona ya que no funciona para arreglos primitivos solo funciona para arreglos tipo objeto
        * es decier string, clases creadas por mi etc*/

    }
    
}
