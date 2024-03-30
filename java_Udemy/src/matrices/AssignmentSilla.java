package matrices;

import javax.swing.*;

public class AssignmentSilla {

    public static void main(String[] args) {
        int [][]matriz;

       int num = Integer.parseInt( JOptionPane.showInputDialog(null,"ingrese el tamaño de la X: "));
        matriz= new int[num][num];

        if (num ==0){
            JOptionPane.showMessageDialog(null,"No puede ser 0");
            System.exit(-1);
        }

        int division = num/2;

        for (int i =0 ; i<matriz.length;i++){
            for (int j =0; j< matriz[i].length;j++) {
                if (j==0 || i == division || (i>=division && j == num-1)){
                    matriz[i][j] = 1;
                }
                else {
                    matriz[i][j] = 0;

                }
            }
        }


        for ( int[] i: matriz) {
            for (int j:i) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
