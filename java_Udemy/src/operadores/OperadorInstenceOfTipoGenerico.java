package operadores;


import primitivosYStrings.Char;

public class OperadorInstenceOfTipoGenerico {
    public static void main(String[] args) {
        Number num = 12; // Esto crear una variable tipo generic donde la variable no se le da una calse en especifico
        // y el compilador  lo hace autoBoxing o sea le guarda como int o un string dependiedo el caso algo similar como con java
        // pero  nostros lo intanciamos con una clase mas general
        Object palabra = "hola";
        // puede ser generico istanciar la con objet o con number a varialbe que recibe un numero

        boolean b2 = num instanceof Integer;
        System.out.println("num es hija  a  la clase integer? " + b2);

         b2 = num instanceof Long;
        System.out.println("num es hija  a  la clase Long? " + b2);
        // al crear la clase tipo generica se puede preguntar sin que de error de sintaxis por otras clases como una varialbe
        //tipo integer preguntar si es tipo long, double lo cual antes no se podiga y se puede ya que todos esas clases
        //son pertenecientes a la calse number
         b2 = num instanceof Double;
        System.out.println("num es hija  a  la clase Double ? " + b2);


        b2 = num instanceof Number;
        System.out.println("num hereda de la clase number? " + b2);

        b2 = num instanceof Object;
        System.out.println("num hereda de la clase objerct? " + b2);

        b2 = palabra instanceof String;
        System.out.println("num es hija  de la clase String? " + b2);

        b2 = palabra instanceof Char;
        System.out.println("num es hija  de la clase char? " + b2);

        b2 = palabra instanceof Number;
        System.out.println("num es hija  de la clase number? " + b2);

        b2 = palabra instanceof Object;
        System.out.println("num hereda de la clase objerct? " + b2);

        // instance of sirve para ver si ciertos objetos pertenecen a ciertas calses o son heredadaes de alguna clase y da un true o un false. no se puede
        // preguntar con ciertos tipos de objetos y clases es decir no puedo preguntar si un String instancia con la clases integer


        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
        System.out.println("Orden de operadores arimetica y pre pos incremento y decremento");
        int i = 14;
        int j = 8;
        int k= 20;


        double resultado= ++i +j--+k/3d*10; // los pos, pre incremento y decremento van primero y luego se soluciona arictmeticamente
        //(15+8)+20/3*10 se pone d en el tres porque sera un double se usa double por que es mas exacto
        System.out.println("resultado = " + resultado);

    }
}
