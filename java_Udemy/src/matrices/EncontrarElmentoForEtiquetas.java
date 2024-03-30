package matrices;

public class EncontrarElmentoForEtiquetas {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3,4},
                {4,5,6,7,8},
                {9,10,11,12,13}
        };
        int i=0;
        int j=0;
        int num = 12;
        boolean encontro= false;

        bucle1: for (i=0; i<matriz.length;i++){
            for (j=0; j<matriz[i].length;j++){
                if (matriz[i][j]==num){
                    encontro=true;
                    break bucle1;
                }
            }
        }
        String texto = encontro ? ("El numero"+ num + "se encontró en la coordenada "+ i+ "-" +j) : "No se encontró nada ";
        System.out.println( texto);
    }
}
