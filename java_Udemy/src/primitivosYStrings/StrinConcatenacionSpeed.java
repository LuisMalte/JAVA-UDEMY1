package primitivosYStrings;

public class StrinConcatenacionSpeed {
    public static void main(String[] args) {

        String palabra1 = "a";
        String palabra2 = "b";
        String total = palabra1;

        long inicio = System.currentTimeMillis();

        StringBuilder concatenacion = new StringBuilder(); // con esto se hace la concatenacin mas rapidda

        System.gc(); // esto es un recolenctor de basura lo que hace es optimizar el programa no es necesario agregarlo
        //siempre porque java automaticamente lo usa internamente

        for (int i = 0; i<1000; i++){
           total= total.concat(palabra1).concat(palabra2).concat("\n");  // este es mas rapido que la concatenacion normal pero solo para concatenaciones pequeñas
           total+= palabra1+ palabra2+  "\n";// es rapido  que concat despues de 100000
           concatenacion.append(palabra1).append(palabra2).append("\n"); // este es el mas rapido de todos es como un tipo de clase
        }
        long fin = System.currentTimeMillis();
        System.out.println("concatenacion = " + concatenacion);
        System.out.println("total = " + total);


        System.out.println( fin-inicio);





    }
}
