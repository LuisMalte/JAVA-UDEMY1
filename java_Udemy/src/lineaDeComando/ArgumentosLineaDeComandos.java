package lineaDeComando;



public class ArgumentosLineaDeComandos {
    public static void main(String[] args) {

        if (args.length==0){
            System.err.println("No hay ningún valor para imprimir ");
            System.exit(-1); // -1 es para errores
        }

        for (int i = 0; i< args.length; i++){
            System.out.printf("argumento nro %s = %s \n", i, args[i]); // esto lo que hace es
            // que recibe valores desde la consola y se imprimen
        }

        /*esta es la manera para ejecutar un archivo desde el terminal
        * cd src
        * javac lineaDeComando/ArgumentosLineaDeComandos.java
        * //en este caso porque esta en un pakage si no lo estuviera solo serai la clase
        * java lineaDeComando.ArgumentosLineaDeComandos  // se pone argumentos o no
        *

         */

    }
}
