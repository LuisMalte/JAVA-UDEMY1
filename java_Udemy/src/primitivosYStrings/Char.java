package primitivosYStrings;

public class Char {
    public static void main(String[] args) {


        // maneras de escribir caracteres
        char caracter = '\u0024'; // codico unicod se puede saber el codigo por medio Mapa de Caracteres
        char decimal = 36; // en decimal
        char simbolo = '$'; // por su simbolo

        System.out.println("Son iguales? " + (caracter==decimal && decimal==simbolo));

        //caracteres especiales estos se pueden usar en los string tambien
        char retroceso  = '\b';
        System.out.println("retroceso hace esto" + retroceso);
        char tabulador = '\t';
        System.out.println(tabulador+"tabulador hace esto" );
        char nuevaLinea = '\n';
        System.out.println("nueva linea hace " + nuevaLinea+ "esto");
        char retornoCarro = '\r';
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-retorno carro hace " + retornoCarro+ "_-_-_-_-_-_-_-_-_-_-_-_-esto");

    }
}
