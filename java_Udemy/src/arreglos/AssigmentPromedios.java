package arreglos;

import javax.swing.*;
/*Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
 por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo*/


public class AssigmentPromedios {

    public static void main(String[] args) {

        int[] arreglo = new int[7];

        for (int i = 0; i < 7; i++) {
            arreglo[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));

        }


        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for(int i = 1; i<7; i++){
            if(arreglo[i]==0) {
                ceros++;

          }else  if(arreglo[i]>0) {
                sumaPositivos+=arreglo[i];
                positivos++;
          } else{
              sumaNegativos+=arreglo[i];
                negativos++;
            }
        }

        if (negativos!=0){
            JOptionPane.showMessageDialog(null, "El promedio de números negativos es: "+(double)(sumaNegativos/negativos));
        } else{
            JOptionPane.showMessageDialog(null, "no hay números negativos");
        }
        if (positivos!=0){
            JOptionPane.showMessageDialog(null, "El promedio de números positivos es: "+(double)(sumaPositivos/positivos));
        } else{
            JOptionPane.showMessageDialog(null, "no hay números positivos");
        }
        if (ceros!=0){
            JOptionPane.showMessageDialog(null, "El número de ceros que hay en el arreglo es: "+(positivos));
        } else{
            JOptionPane.showMessageDialog(null, "no hay ceros");
        }

    }

}
