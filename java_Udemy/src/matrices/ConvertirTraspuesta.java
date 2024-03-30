package matrices;

import java.util.Scanner;

public class ConvertirTraspuesta {

    public static void main(String[] args) {
        int [][]matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };


        for ( int[] i: matriz) {
            for (int j:i) {
                System.out.print(j+"\t"); //\t es poara que haya un tabulador entre cada iteracion
            }
            System.out.println();
        }
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-Matriz Traspuesta-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
                \s""");

        for (int i =1; i<matriz.length;i++){ //i = 1 ya que en caso de ser i = 0 la primera vez que se entra
            // seria i=0 y j =0 o sea no entraria al segundo for por ende es una menera mas optimizada

            for (int j =0; j<i;j++) {
                int temp;
                temp =matriz[i][j];
                matriz[i][j] =  matriz[j][i];
                matriz[j][i] = temp;
            }

        }

        //esta es similar que el codigo para ver si la matriz es simetrica con
        /*la diferencia que cambian valores es decir el elmento de la fila i y en la columna j
        * pasara a ser de fila j en la columna i pera para que termine es obligatorio que solo que se
        * cambine los valores antes que la fila i se encuntre con la trasversal para eso
        * se hace j<i ya que cuando la condicion no se de es porque se llego a la lina trasversal */
        for ( int[] i: matriz) {
            for (int j:i) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
