package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class CopiarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a, pares, impares, cero;

        int contadorPares = 0, contadorImpares=0, contadorCero=0;
        System.out.print("Ingrese la cantidad de números que va a ingresar: ");
        int num = scanner.nextInt();
        a = new int[num];
        int length = a.length;

        for (int i=0; i<length;i++){
            System.out.print("Ingrese un número : ");
            a[i]= scanner.nextInt();
        }

        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- Arreglo principal -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");
        for (int  i=0; i<length;i++) {
            System.out.println( (i) +" = "+ a[i]);
        }



        for (int j : a) {
            if (j == 0 ) {
                contadorCero++;
            } else if (j % 2== 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }


        }


        cero = new int[contadorCero];
        impares = new int[contadorImpares];
        pares= new int[contadorPares];

        contadorPares = 0;
        contadorImpares=0;
        contadorCero=0;

        for (int j : a){
            if (j == 0 ) {
                cero[contadorCero++]= j;
            } else if (j % 2== 0) {
                pares[contadorPares++]= j;
            } else {
                impares[contadorImpares++]= j;
            }

        }

        contadorPares = 0;
        contadorImpares=0;
        contadorCero=0;
        for (int j : cero){
            System.out.println( (contadorCero++) +" = "+ j);
        }
        for (int j : impares){
            System.out.println( (contadorImpares++) +" = "+ j);
        }
        for (int j : pares){
            System.out.println( (contadorPares++) +" = "+ j);
        }




    }
}
