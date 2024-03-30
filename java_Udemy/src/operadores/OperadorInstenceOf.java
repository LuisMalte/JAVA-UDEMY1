package operadores;


public class OperadorInstenceOf {
    public static void main(String[] args) {
        Integer num = 12;
        String palabra = "hola";

        boolean b1 = num instanceof Integer;
        System.out.println("num es hija  a  la clase integer? " + b1);
        b1 = num instanceof Number;
        System.out.println("num hereda de la clase number? " + b1);

        b1 = num instanceof Object;
        System.out.println("num hereda de la clase objerct? " + b1);

        b1 = palabra instanceof String;
        System.out.println("num es hija  de la clase String? " + b1);

        b1 = palabra instanceof Object;
        System.out.println("num hereda de la clase objerct? " + b1);

        // instance of sirve para ver si ciertos objetos pertenecen a ciertas calses o son heredadaes de alguna clase y da un true o un false. no se puede
        // preguntar con ciertos tipos de objetos y clases es decir no puedo preguntar si un String instancia con la clases integer


    }
}
