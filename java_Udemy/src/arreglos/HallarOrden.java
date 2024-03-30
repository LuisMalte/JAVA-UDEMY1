package arreglos;

import javax.swing.*;

public class HallarOrden {


    public static void DosEnDos(int[] arreglo) {

        int length2 = arreglo.length;
        boolean ascendente = false;
        boolean descendenete = false;
        for (int i = 0; i < length2-1; i ++) {
            if (arreglo[i] < arreglo[i + 1]) {
                ascendente = true;
            }
            if (arreglo[i] > arreglo[i + 1]) {
                descendenete = true;
            }
        }
        if (!descendenete && !ascendente) {
            JOptionPane.showMessageDialog(null, "Todos los números del arreglo son iguales");
        } else if (descendenete && ascendente) {
            JOptionPane.showMessageDialog(null, " los números del arreglo están desordenados");
        } else if (!descendenete) {
            JOptionPane.showMessageDialog(null, " los números del arreglo están ordenados de manera ascendente");

        }
        else{
            JOptionPane.showMessageDialog(null, " los números del arreglo están ordenados de manera descendente");

        }

    }

    /* */


    public static void main(String[] args) {


         int[] arreglo1 = new int[5];
         int length =  arreglo1.length;
         for (int i =0; i<length;i++){
             arreglo1[i]= i+1;
         }

        JOptionPane.showMessageDialog(null, "ingrese 5 números ");
        for (int  i=0; i<length;i++) {
            arreglo1[i]= Integer.parseInt( JOptionPane.showInputDialog(null,"ingrese un numero"));

        }

        DosEnDos(arreglo1);


    }
    

}
