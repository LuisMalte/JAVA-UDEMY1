package flujoDeControl;

import java.util.Scanner;
/*
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
pero sin usar el símbolo de multiplicación (*).
Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios,
donde menos por menos es positivo.
*/

public class AssignmentMultiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");

        int num = Integer.parseInt(scanner.next());
        System.out.print("Ingrese el segundo valor: ");

        int num2 = Integer.parseInt(scanner.next());
        int resultado = 0;

        for (int i = 0; i < Math.abs(num2); i++) {
        resultado += Math.abs(num);
        }

        String mensaje = (num<0 && num2<0)||(num>0 && num2>0) ?"EL resultado de la multiplicación " + num+ " por " + num2+ " es : " + resultado:
                "EL resultado de la multiplicación " + num+ " por " + num2+ " es : " + (-resultado);

        System.out.println(mensaje);

    }

}




