package wrapper;

public class MetodosNums {
    public static void main(String[] args) {
        int intPirmitivo = 327672;
        Integer intergerObj = Integer.valueOf(intPirmitivo); // forma original de como  convertir un int a integer
        Integer integerObt2 = intPirmitivo; // forma abreviado por el autoboxing

        System.out.println("intergerObj = " + intergerObj);
        System.out.println("integerObt2 = " + integerObt2);

        int num1 = intergerObj.intValue(); // igual pero integer a int
        int num2 = integerObt2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        String valor = "13435";
        Integer integerObt3 = Integer.valueOf(valor);// convertir un string a int es casi sirve ya que en valueof se puede poner un int o un string
        // la diferencia con este y parseint es que valueOf se converite en un integer pero parse int se converite en un int
        System.out.println("integerObt3 = " + integerObt3);


        int num3 = Integer.valueOf(valor); // se puede hacer para un primitivo tambien
        System.out.println("num3 = " + num3);

        short short1 = integerObt2.shortValue(); // se convierte un integer a short pero se pierde valor da un numero ni cercano
        System.out.println("short1 = " + short1);

        long long1 = integerObt2.longValue(); // se converite a long y en este no hay perdidas de valores
        System.out.println("long1 = " + long1);


// Integer.valueOf lo que hace es convertir una cadena numero o numeros a un objeto de tipo integer entonces esto sirve en este caso es a un
        //con integer si se necesita comprar == entonces se usa .equals si no se usa dara un error la unicamanera para que funcione
        //correctamente al usar == es para comparar numeros menores a 127 ya que ahi se hace autoboxing lo que significa es que el integer se convierte en
        // en un int o sea de una clase wrapper a un primitivo
    }
}
