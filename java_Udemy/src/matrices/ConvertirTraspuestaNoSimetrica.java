package matrices;

public class ConvertirTraspuestaNoSimetrica {

    public static void main(String[] args) {
        int [][] matriz, matrizTras;
        matriz= new int[8][4];
        matrizTras= new int[4][8];

        for (int i = 0; i < matriz.length; i++ ){
            for (int j = 0; j < matriz[i].length; j++ ){
                matriz[i][j] =i+ j*2;
            }
        }


        for ( int[] i: matriz) {
            for (int j:i) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-Matriz Traspuesta-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
                \s""");



        for (int i = 0; i < matriz.length; i++ ){
            for (int j = 0; j < matriz[i].length; j++ ){
                matrizTras[j][i] = matriz[i][j];
            }
        }

        /*esta es una manera de copiar tener la transpuesta de una matriz y es con una matriz copia
        * la cual e hace es que se le invierte los valores de de las filas con las columnas a la
        * matriz copia y asi obotener una matriz donde puede ir la transpuesta porque en la anterior solo era para
        * una simetrica y el funcionamiento es simple se recorre la matriz principal
        * y se va agregando los valores a la matriz copia pero en el diferente orden en vez de i j es j i */

        for ( int[] i: matrizTras) {
            for (int j:i) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }

    }
}
