package primitivosYStrings;

import java.util.Locale;

public class StringIntro {
    public static void main(String[] args) {

        //control + 7 numerico para multiples cursores
        String str1 = "hola";
        String str2 = new String("hola");

        // lo que hace == es comprobar que si los dos variables son las mismas es decir
        // se guardan en el mismo espacio de la memoria pero no revisa su contenido
        System.out.println("son iguales? " + (str1 == str2));

        //en este caso si se revisa si el contenido es el mismo
        System.out.println("son iguales? " + (str1.equals(str2)));

        String str3 = "hola";
        String str4 = "hola";

        //en este caso es true ya que hay un tipo de optimizacion en java que cuadno se crea un String con un mismo
        //valor se guardan  en el mismo espacio de memoria para ahorrar eso se llama pool en el caso anterior daba false
        // ya que al usar new String se fuerza a crear un nuevo espacio para esa variable esto no solo sucede en string si
        //con clases por eso es mejor usar un equal para comparar objetos de calse
        System.out.println("son iguales? "+ (str3 == str4));

        String palabra1 = "hola";
        String palabra2 = "lUIS";
        String valorOriginal = palabra2; // Guardar el valor original

        // dos formas de concatenar se optiene el mismo resultado
        System.out.println(palabra1.concat(palabra2));
        System.out.println(palabra1 + palabra2);

        System.out.println(palabra1.concat(palabra2) + 1+2);
        // esto sucede porque el codigo se lee de izq a dercha
        // por ende se toma todo como un string para cambiar esto hay que poner parentesis para que al compliarse se entienda que es una suma

        System.out.println(1+3 + palabra1.concat(palabra2));
        // En este caso cambia, ya que se inicia la suma entonces el copilador entiende que son ints


        //los variables string son inmutables es decir no pueden cambiar la unica manera que cambia es cuando se hace una concatenacion pero
        // pero no es que cambine si no que se crea una variable con el mismo nombre



        palabra2="hola"+ palabra2;
        System.out.println("palabra2 = " + palabra2);

        // este es una cma
        palabra2.transform(p ->{
            return p.concat("hola");
        });

        System.out.println("palabra2: " + palabra2);




    }
}
