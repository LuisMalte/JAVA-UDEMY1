package operadores;

public class TernarioEIncre {
    public static void main(String[] args) {

        int a =1;
        int b= a++;
        int c = b+a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int numero = 10;
        // esta es una simplificacion del condicional ifeslse con algo simple se da la condicion
        // y se hace una cosa u otra
        String esPar = (numero%2==0)? "es par ": "es impar";
        System.out.println("El numero " + esPar);

        int i = 5, j=7, division1 = j/i; // una manera de crear varias variales en una sola linea
        System.out.println("divicion1 = " + division1); // da uno divdo que tanto i, j, division 1 son de tipo int por ende
        // los redondea
        float division2 = j/i; // esto sigue dando 1 ya que j e i son  int para forzar que i y j sean float
        System.out.println("division2 = " + division2);
        division2 = (float) j/i; // se obligan con un cast
        System.out.println("division2 = " + division2);


        String aprovado = "";
        double nota= 3.4;
        aprovado = nota>=3.5 ? "aprobóternarioEIncre": "perdio";
        System.out.println("aprobado = " + aprovado);

    }
}
