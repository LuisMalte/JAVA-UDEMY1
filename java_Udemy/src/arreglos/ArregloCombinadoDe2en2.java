package arreglos;

public class ArregloCombinadoDe2en2 {


    public static void DosEnDos(int[] arreglo, int[] arreglo2,int[]arregloCombi) {
        int length2 =  arreglo.length;
        int a=0;
        for (int i= 0; i<length2; i+=2) {
            for (int j=0; j<2; j++){
                arregloCombi[a++] = arreglo[i+j];
            }
            for (int j=0; j<2; j++){
                arregloCombi[a++] = arreglo2[i+j];
            }

        }
    }

    /*Esta es una forma tener un arreglo copia donde en base de dos arreglso el cual se toma los dos primeros de cada
    * uno para esto se usa dos bulces for para que tomen los dos valores de cada arreglo por eso se le suma i+j
    * ya que se toma dos entonces si i es 0 entonces si le sumo j  que al princio es o entonces es 0
    * y si le sumo i=0 con j =1 da 1 y lo mismo hace para el otro arreglo
    *y se usa el a++ con pos incremento para que vaya por todo el arreglocopia entonces entonces en el primoer
    *bucle for se esta a[0],a[1] y en el segundo a[2],a[3] y asi sucesivamente
    * una cosa importante es que en el primer bulce for hay  i+=2 lo que hace ess que vaya en 2 en 2 ya que pues en el
    * primer giro se optiene los dos primeros objetos del arreglo1 y arreglo2 entonces tiene que ser 2 en 2
    * EN CASO DE QUE SE QUIERA CON OTRA CANTIDAD DE OBJETOS EL NUMERO DE OBJETOS DE SEADOS DEBE SER MULTIPLO DEL LARGO
    * DEL ARREGLO */


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
        DosEnDos(arreglo1,arreglo2,arreglo);
        int Lenght2 =arreglo.length;
        for (int  i=0; i<Lenght2;i++) {
            System.out.println((i) +" = "+ arreglo[i]);
        }
    }
    

}
