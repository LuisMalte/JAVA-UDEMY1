package arreglos;

public class ImprimirPrimeroYUltimo {
    public static void firstLast(int[] arreglo) {

        int length2 =  arreglo.length;
        for (int i= 0; i<length2-i; i++) {
            int primero = arreglo[i];
            int ultimo = arreglo[length2 - 1 - i];
            System.out.print(primero);
            System.out.println(" " + ultimo);
            System.out.println(" ===================================" );
        }
    }
/*esta es una forma de imprimir el primer objeto del arreglo y el ultimo funciona igual que
* el de invertir con indice solo que en esta vez se imprime la unica diferencia es que se le resta -i
* a lenght 2 ya que es lo mismo que crear una auxiliar length para luego irle restando acada vuelta se
* puede hacerlo mismo solo restandole al length i lo que hace la misma funcion*/
    public static void firstLastCopy(int[] arreglo, int[] arreglo2) {
        int length2 =  arreglo2.length;
        int a=0;
        for (int i= 0; i<length2-i; i++) {
             arreglo2[a++] = arreglo[i];
            arreglo2[a++] = arreglo[length2 - 1 - i];
        }
    }
    /*esto es muy similar al otro lo que cambia es que en vez de tener variables se cambia con los indices de otro
    * arreglo el cual sera el que copie el arreglo pero demanera primero y ultimo para esto solo que usa una vairalbe
    * auxiliar para que vayan pasando uno al otro
    * lo que hace a++ como es pos enotnces a incrementa despues entonces para cuanod pasa por la otra linea ya sera a+1 pero
    * en esa otra liena habra otro incremento la pasara lo mismo de esa manera se asegura que en esas dos lienas se pase por
    * a=0 recive el primero a=1 reciva el ultimo y asi sucesivame nte */

    public static void main(String[] args) {
         int[] arreglo = new int[10];
         int length =  arreglo.length;
         for (int i =0; i<length;i++){
             arreglo[i]= i+1;
         }
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Normal-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");//esta es una manera de crear un bloque de texto donde se puede hacer saltos de línea y cualquier
        //cosa como si estuviera escribiendo en un word
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Imprmir primero y ultimo-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");
        firstLast(arreglo);



        for (int i =0; i<length;i++){
            arreglo[i]= i+1;
        }

        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo[i]);
        }

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Arreglo copia primero y ultimo-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

        int[] arreglo2 = new int[10];

        firstLastCopy(arreglo,arreglo2);
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ arreglo2[i]);
        }

    }
    
}
