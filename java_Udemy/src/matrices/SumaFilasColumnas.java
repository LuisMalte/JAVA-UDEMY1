package matrices;

public class SumaFilasColumnas {
    public static void main(String[] args) {

      int [][] a = {
              {10,20,30},
              {40,50,60},
              {70,80,90},
      };


      for(int i= 0; i< a.length; i++){
          int sumaColumnas=0;
          int sumaFilas=0;
          for(int j= 0; j< a[i].length; j++){
           sumaFilas+= a[i][j];
           sumaColumnas += a[j][i];
          }
          System.out.printf("la suma de la fila %s es %s \n ",i, sumaFilas);
          System.out.printf("la suma de la columna %s es %s \n ",i, sumaColumnas);
          System.out.println();
      }


    }
}
