package operadores;

public class JerarquiaOperadoresLogi {
    public static void main(String[] args) {
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;



        boolean b1 = i==j &&  k < l  &&m ==false; // va de izq a derecha  pimero  i y j
        // es true luego k  y l es true y m es true entonces todo es true
        System.out.println("b1 = " + b1);

        boolean b2 = i != j || k <l;  //j e i es false k y l es true entonces es true
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && (k<l || m ==true); // los parentecis cumple la misma funcion que matematicas entonces
        // en el parentesis da true y j e i es true por ente es true
        System.out.println("b3 = " + b3);



        boolean b4 =  m == false ||3 <1 && i!=j; // en esta operacion el resultado es true por la jerarquia de los operadoress
        // el cual su orden es asi primero ! luego && depues || (or) entonces primero se revisa el && luego se revisa el or
        System.out.println("b4 = " + b4);
        boolean b5 = ( m == false ||3 <1) && i!=j;
        System.out.println("b5 = " + b5); // La jerarquia de operadores logicos son interumpidos cuando hay parentesis

    }
}
