package matrices;

public class MatricesIntro {
    public static void main(String[] args) {
        int [][] matriz = new int[2][4];

     matriz[0][0]=1;
     matriz[0][1]=12;
     matriz[0][2]=14;
     matriz[0][3]=3;

     matriz[1][0]=2;
     matriz[1][1]=12;
     matriz[1][2]=14;
     matriz[1][3]=16;


        System.out.println("num de filas = " +matriz.length );
        System.out.println("num de columnas = " +matriz[0].length );
        System.out.println("Primer elemento de la matriz = " + matriz[0] [0] );
        System.out.println("ultimo elemento de la matriz  = " + matriz[matriz.length-1] [matriz[matriz.length-1].length-1] );
// se pide la ultima fila y luego se pide  el ultimo elemento de la columna de la ultima fila


        /* una matriz es una arreglo de arreglos es decir es un arreglo con varios o arreglos
        en las matrices lo primero que se pone para buscar o agregar un elemento son las filas y luego las
        columnas es como si las filas fueran mas importnates por eso legth solo es el numero de filas
        * y [0].leght es el numero de columnas
       las matrices funcionan igual que un arreglo donde se el indice empiza desde 0*/


        int num1 = matriz[0][0];
        System.out.println("num1 = " + num1);
        /*Esta es la manera de como se puede acceder a un elemente de un arreglo */

        System.out.println("mariz[0][0] = " + matriz[0][0]);// esta es otra manera

        int [][] matriz2 = {{1,3,3,4},{2,4,5,6}};
        //esta es una otra manera de creear una matriz con sus valores al momento
        //en este caso ambas {} son filas o sea hay fila 1 y fila 2 y hay 4 columnas

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Matriz -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){ /*aca se hace matriz[i] ya que lo que se haces preguntar
             cuntas columnas tiene cada fila por que hay casos donde no todas las filas tieen las mismas
             columnas se puede poner solo matriz[0] o el tamaño de las columnas pero solo en los casos donde
             todas las filas tienen los mismo numeros de columnas*/
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Matriz forEach -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

        for(int[] filas: matriz2 ){
            for (int columnas:filas) {
                System.out.print(columnas+"\t"); //\t es poara que haya un tabulador entre cada iteracion
            }
            System.out.println();
        }
        /*esta es una forma de imprimir una matriz con un bulce foreach lo cual hace que tome los
        * valores de todas las filas de la matriz y luego se usa otra bulce foreach para
        * recorrer  cada elemento de las filas para luego impirmirlas  */
    }
}
