package arreglos;

import javax.swing.*;

public class BuscarSrt {

    public static void main(String[] args) {

        String[] arreglo1 = new String[4];
        int length =  arreglo1.length;
         for (int i =0; i<length;i++){
             arreglo1[i]= JOptionPane.showInputDialog(null, "Ingrese una palabra : ");

         }

       String palabra = JOptionPane.showInputDialog(null, "ingrese una palabra  que desea saber su posición: ");

        int i =0;
        while (i<length &&!arreglo1[i].equalsIgnoreCase(palabra)){
            i++;
        }



    /*    for (i=0; i<length &&!arreglo1[i].equalsIgnoreCase(palabra);i++){}*/


        if (i==4){
          JOptionPane.showMessageDialog(null,"la palabra no esta en el arreglo");
        }else{
          JOptionPane.showMessageDialog(null,"la palabra " + palabra + "se encontró en la posición "+  i);
        }
    }
    

}
