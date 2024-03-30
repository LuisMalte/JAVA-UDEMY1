package matrices;

public class DiagonalPrincipalUnos {

    public static void main(String[] args) {
        int [][]matriz = new int[4][4];

        for (int i =0 ; i<matriz.length;i++){

            for (int j =0; j< matriz[i].length;j++) {
               if (i==j){
                   matriz[i][j] = 1;
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
