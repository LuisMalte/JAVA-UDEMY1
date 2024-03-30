package arreglos;

import javax.swing.*;
/*Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
 por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo*/


public class AssigmentImprimirMax {

    public static void main(String[] args) {

        int[] arreglo = new int[7];

        for (int i = 0; i < 7; i++) {
            arreglo[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entre 11 y 99"));

        }

        System.out.println("==================================================================================  ");
        int max = arreglo[0];

        for(int i = 1; i<7; i++){
          if(max < arreglo[i]) max= arreglo[i];
        }
        JOptionPane.showMessageDialog(null, "El numero con mayor valor es: "+ max);

    }

}
