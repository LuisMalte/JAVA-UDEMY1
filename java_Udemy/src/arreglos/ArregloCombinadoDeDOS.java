package arreglos;

public class ArregloCombinadoDeDOS {


    public static void firstLastCopy(int[] arreglo, int[] arreglo2,int[]arregloCombi) {
        int length2 =  arreglo.length;
        int a=0;
        for (int i= 0; i<length2; i++) {
             arregloCombi[a++] = arreglo[i];
            arregloCombi[a++] = arreglo2[i];
        }
    }


    public static void main(String[] args) {


         int[] arreglo1 = new int[10];
         int length =  arreglo1.length;
         for (int i =0; i<length;i++){
             arreglo1[i]= i+1;
         }

        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo1[i]);
        }


        System.out.println("""
               ========================================================================
                \s""");



        int[] arreglo2 = new int[10];
        int length2 =  arreglo2.length;
        int a=0;
        for (int i =length2-1; i>0;i--){
            arreglo2[a]= i;
            a++;
        }
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo2[i]);
        }


        System.out.println("""
               ========================================================================
                \s""");

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- Arreglo Combinado-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

        int[] arreglo = new int[20];
        firstLastCopy(arreglo1,arreglo2,arreglo);
        int Lenght2 =arreglo.length;
        for (int  i=0; i<Lenght2;i++) {
            System.out.println((i) +" = "+ arreglo[i]);
        }
    }
    

}
