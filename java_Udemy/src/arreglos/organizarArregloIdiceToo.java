package arreglos;
public class organizarArregloIdiceToo {
    public static void sort(String[]arregloStr){

        //SI SE QUIERE HACER LO MISMO PERO INVERSO LO UNICO QUE HAY QUE HACER ES PONER arregloStr[j])>0
        int length =  arregloStr.length;
        int contador = 0;
        for (int i= 0; i<length; i++){
        for (int j= 0; j<length; j++){
                if (arregloStr[i].compareTo(arregloStr[j])<0){
                    String temp = arregloStr[i];
                    arregloStr[i]= arregloStr[j];
                    arregloStr[j]= temp;

                    
                }
                        contador++;
            }
        }
        System.out.println("contador normal = " + contador);
    }
/*este metodo hace lo mismo que el metodo Arrays.sort per en esta casa lo hice yo
* la sintaxis es simple se usa dos for una para que sea el quede una palabra para que sea con la qeu se compare
* y la otro es para que pase por todo el arreglo
* y hay que tener en cuenta que el metodo compareTo da un numero positivo 0 o negetivo
* si es positivo es por que el que se esta comparando es superior si comparo b con a
* entonces da un nuemero positivo   y si es negetivoes porque es porque es inferior si comparo a con b es da un numero negativo, si es 0
* es igual
* asi que si el numero que da comparTO es negativo es porque la palabra deberia ir despues entonces lo que sea hace es cambian de posicion
* la palbra qe deberia ir despues pasa hacer el inidcie i y otra palabra pasa hacer el inidce j entoces se repite el proceso hasta que ya no de negativo
*  es decir si */

    public static void sortOpti(String[]arregloStr) {
        int length = arregloStr.length;
        int contador = 0;
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length - 1-i; j++) {
                if (arregloStr[j + 1].compareTo(arregloStr[j]) < 0) {
                    String temp = arregloStr[j];
                    arregloStr[j] = arregloStr[j + 1];
                    arregloStr[j + 1] = temp;

                }
                contador++;
            }

        }
        System.out.println("contador  Optimizado= " + contador);


    }


    /*esta es el mismo metodo pero mas optimizado hace funciona casi igual lo unico es que solo se usa j para compar
    * ya qeu se va hacia adelante del que esta o sea si j es 0 va a j 1 para comparar con j 0 y la condicion para cambiar es la
    * misma si da negativo entonces cambian de posicion por ejemplo si j1 es a y j0 es b entonces cambian de posicion
    * el otro for o sea el que usa i sirva para que se repita el proceso varias veces o se el tamaño de leght -1 ya que asi se ahora
    * una vulta ya que el ultimo para el penultomo giro ya estara arreglado
    * el for j se hace  -1-i ya que en la primiera vuelta de j se haya cual sera el ultimo objteto con en el respectivo orden y se pone i
    * para que el bulce no vaya hasta el ultimo porque nunca va a cambiar y ese mismo proceso para en el segundo giro se a como al penulto
    * objeto de manera fija entnoces de esa manera se ahora varias giros y se resta -1 ya que como se suma una oyede haber un desvordamiento
    *
    * */

    public static void sortOptiGenerico(Object[]arregloStr) {
        int length = arregloStr.length;
        int contador = 0;
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length - 1-i; j++) {
                if (((Comparable)arregloStr[j + 1]).compareTo(arregloStr[j])< 0) {
                    Object temp = arregloStr[j];
                    arregloStr[j] = arregloStr[j + 1];
                    arregloStr[j + 1] = temp;

                }
                contador++;
            }

        }  System.out.println("contador  Optimizado= " + contador);

    }


        public static void main(String[] args) {
         String [] arreglo = new String[3];
         arreglo[0] = "b";
         arreglo[1] = "c";
         arreglo[2] = "a";




         int length= arreglo.length;
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Normal-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }



        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Arreglo organizado-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
                \s""");
        sort(arreglo);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }
        System.out.println("==================================================================================  ");
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Normal otra vez -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

        arreglo[0] = "b";
        arreglo[1] = "c";
        arreglo[2] = "a";


        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }

        System.out.println("==================================================================================  ");


        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Arreglo organizado optimizado-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
                \s""");
        sortOpti(arreglo);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }


            System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Arreglo organizado optimizado Generico-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
                \s""");


            Integer [] arreglo2 = new Integer[3]; // debe ser integer otra vez ya que
            // object entran solo los wrappers no los primitivos asi que toca hacerlo asi
            arreglo2[0] = 2;
            arreglo2[1] = 1;
            arreglo2[2] = 3;

            sortOptiGenerico(arreglo2);

            int lenght2 = arreglo2.length;

            for (int  i=0; i<lenght2;i++) {
                System.out.println( (i) +" = "+ arreglo2[i]);
            }



       /* int num = "t".compareTo("b");
        System.out.println("num = " + num);

        int numa = "b".compareTo("t");
        System.out.println("num = " + numa);*/

    }
    
}
