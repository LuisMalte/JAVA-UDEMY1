


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import static org.luism.poosobrecarga.Calculador.sum;

public class Main {

    public static void main(String[] args) {
        System.out.printf(" Suma int = %s \n", sum(2,1)); /*invoco los metodos de manera estatica*/
        System.out.printf(" Suma float = %s \n", sum(1.2f,1f));
        System.out.printf(" Suma int y float = %s \n", sum(1,1.98f));
        System.out.printf(" Suma double = %s \n", sum(1.23,1.98));
        System.out.printf(" Suma Strings = %s \n", sum("13","3"));
        System.out.printf(" Suma ints = %s \n", sum(13,3,3));

        System.out.printf(" Suma variables de argumentos = %s \n", sum(13,3,3,4,3,5,63,2,52,1,3,1));
        System.out.printf(" Suma variables de argumentos int y float = %s \n", sum(1.321f,13,3,3,4,3,5,63,2,52,1,3,1));






    }
}