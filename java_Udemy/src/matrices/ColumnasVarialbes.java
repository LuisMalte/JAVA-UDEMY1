package matrices;

public class ColumnasVarialbes {
    public static void main(String[] args) {
      int [][] matriz = new int[4][];

      matriz[0]= new int[1];
      matriz[1]= new int [0];
      matriz[2]= new int[2];
      matriz[3]= new int [3];

      for(int i= 0; i< matriz.length; i++){
          for(int j= 0; j< matriz[i].length; j++){
              System.out.print(matriz[i][j]+"\t");
          }
          System.out.println();
      }

    }
}
