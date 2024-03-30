package arreglos;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class DesplazarElementos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int length =  arreglo.length;



        for (int i =0; i<length;i++){
            arreglo[i]= i+1;
        }
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-ANTES-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }


        int ultimo = arreglo[length-1];
        for ( int i = length-2; i>=0;i--){
            arreglo[i+1]= arreglo[i];

        }
        arreglo[0]=ultimo;
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_DESPUÉS_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }
        /*Esta es la manera de desplazar un puesto a un objeto en un arreglo lo que se hace es que se empiza desde atras hacia
        * delante y debe ser asi ya que si hace de adelante hacia atras solo se copiara el valor de la posicion 1 ya que como
        * arreglo[i+1]= arreglo[i] entonces por ejemplo si i es 1 entonces se le sumara +1 entonces sera 2 y el valor que tomara es el
        * de i luego se pasa otra vez entonces sera arreglo {3} = arreglo {2} pero 2 ya tiene un valor enotnces solo se repetira solo un nuermo
        * entonces lo que hay que hacer es ir de atras de adelante empece con legth-2 ya pues puede haber desboradamiento
        * ya que como se llega a  la posicion 9 entonces si le sumo 1 entonces llegara a 10 y esa posicion no existe
        * entonces  se usa la misma linea que en el antrior ejmplo erroneo pero esta vez si funciona por si arreglo[i+1]= arreglo[i]
        * quiere decir que i inicia en 8 entonces arreglo{9} se igualara  arreglo{8} entonces luego se retrocede
        * en el otro giro entonces i es 7 entonces arreglo{8} se igualara  arreglo{7}  lo cual no hay errores ya que se duplica la
        * informacion la unica informacion que se pierde es del ultimo elemento y para eso se una esa una variable auxiliar
        * y ya sabemos cual sera la posicion que deberia tener el ultmio entonces lo hacemos nosotros    */
    }

    

}
