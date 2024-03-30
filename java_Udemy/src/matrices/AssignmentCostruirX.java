package matrices;

import javax.swing.*;

public class AssignmentCostruirX {

    public static void main(String[] args) {
        String [][]matriz;

       int num = Integer.parseInt( JOptionPane.showInputDialog(null,"ingrese el tamaño de la X: "));
        matriz= new String[num][num];

        if (num ==0){
            JOptionPane.showMessageDialog(null,"No puede ser 0");
            System.exit(-1);
        }

        for (int i =0 ; i<matriz.length;i++){
            for (int j =0; j< matriz[i].length;j++) {
                if (i==j || j == matriz[i].length-1-i){
                    matriz[i][j] = "X";
                }
                else {
                    matriz[i][j] = "_";

                }
            }
        }


        for ( String[] i: matriz) {
            for (String j:i) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
