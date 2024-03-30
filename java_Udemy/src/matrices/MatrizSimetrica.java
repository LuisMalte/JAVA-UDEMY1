package matrices;

public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };
        int i=0;
        int j=0;
        int num = 12;
        boolean simetrica= true;

       salir: while (i< matriz.length){
            j=0;
            while (j< i){
                if (matriz[i][j]!=matriz[j][i]){
                    simetrica=false;
                    break salir;
                }
                j++;
            }
            i++;
        }
        /*
         OTRO FORMA SIN USAR LA ETIQUETA
         while (i< matriz.length && simetrica){
            j=0;
        while (j<i && simetrica){
            if (matriz[i][j]!=matriz[j][i]){
                simetrica=false;
            }
            j++;
        }
        i++;
        }*/


        /*OTRO FORMA CON FOR 

        salir: for (i=0; i< matriz.length; i++){
            for (j=0; j<i;j++){
                if (matriz[i][j]!=matriz[j][i]){
                    simetrica=false;
                    break salir;
                }
            }
        }
*/

        String texto = simetrica ? "la matriz es simétrica ":"la matriz no es simétrica ";
        System.out.println( texto);

        /*esta es una forma de verificar si una matriz es simetrica o no una matriz es simetrica si al nvertir las
         * columnas por filas da igual por que su digagonal queda igual para esto se puede de hacer de muchas formas
         * el se necesti dos bulces una para las filas y el otro para las columnas en el que es para las columnas solo es
         se revisa hasta cirto tamaño no hasta todas las columnas esto pero se mas optimo ya que al decir que el bucle conune mientras que j
        * sea menor que i lo cual hace que solo se revise la mitad  de la matriz y sin qeu se revise la digonal ya que la digonal
        * siempre sera la misma y por que si se revisa todas las columanas se hace el trabajo dos veces asi que lo mejor es
        *que se pregunte hasta que j llegue a la digonal  despues de eso
        * se  pregunta que si la el elemento en la fila i y en la columna j no es igual que la fila j  en la columna i encaso
        * de no ser igual entonces no seria simetrica y se saldria del todo bulce */

    }
}
