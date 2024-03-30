package referencias;

public class Referencias {
    static void incrementar(int num) {
        //Pasar argumentos por valor: esto es cuando se pasa un primitivo o un wrapper donde lo que se pasa no es algo
        // definido si no como algo por difinir podira es decirl lo que se pide en estos tipos de metods es
        // que se de una variable tipo pero solo sera modificada adnetro
        System.out.println(" -_-_-_--_-_-_--_-_-_- Incio metodo incrementar -_-_-_--_-_-_--_-_-_-   ");
        num = num + 1;
        System.out.println("Valor dentro de la función: " + num);
        System.out.println(" -_-_-_--_-_-_--_-_-_- Fin -_-_-_--_-_-_--_-_-_-   ");
    }
      static void incrementarObjt(Numero num) {
        // lo mismo que Pasar argumentos por referencia si no esta vez se pasa un objeto de una clase que nosotros creammos
        System.out.println(" -_-_-_--_-_-_--_-_-_- Incio metodo incrementarObj -_-_-_--_-_-_--_-_-_-  ");
        num.valor = num.valor + 10;
        System.out.println("Valor dentro de la función: " + num.valor);
        System.out.println(" -_-_-_--_-_-_--_-_-_- Fin -_-_-_--_-_-_--_-_-_-  ");
    }

    static void incrementarReferencia( int[] array) {
        // Pasar argumentos por referencia en este caso si se pide un objeto en especifico en este caso un array y
        // lo uqe se modificara sera el array
        System.out.println(" -_-_-_--_-_-_--_-_-_- Incio metodo incrementarObj -_-_-_--_-_-_--_-_-_-  ");

        int j =0;
        for (int i :array) {
            array[j]+=100;
            j++;


        }
        for (int i :array) {
            System.out.println("Valor dentro de la función: " +i);

        }


            System.out.println(" -_-_-_--_-_-_--_-_-_- Fin -_-_-_--_-_-_--_-_-_-  ");
    }

    public static void main(String[] args) {
        int numero = 5;
        incrementar(numero); // Llamar al método a través de la instancia
        System.out.println("Valor fuera de la función: " + numero + "\n \n" );
        Numero num = new Numero(4);
        incrementarObjt(num);
        System.out.println("Valor fuera de la función: " + num.valor + "\n \n");
        int[] numeros = {1, 2, 3};

        incrementarReferencia(numeros);
        for (int i :numeros) {

            System.out.println("Valor fuera de la función: " +i );

        }






    }

    static class Numero { // Hacer la clase interna 'Numero' estática
        int valor;

        Numero(int valor){
            this.valor=valor;
        }
    }
}
