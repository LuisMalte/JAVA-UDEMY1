package flujoDeControl;
/*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar
el número de veces (ingresado) para pedir el número entero, entonces se requiere:
Calcular el menor número e imprimir el valor.
Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". Si no, imprimir "el número
menor es igual o mayor que 10!".*/

import java.util.Scanner;

public class AssignmentOrdenar {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int interaciones=0;
                while (interaciones<10){

                        System.out.print("ingrese la cantidad de números que va a comprar: ");
                        interaciones= Integer.parseInt(scanner.next());
                }




                int []numeros= new int[interaciones];
                int k =0;
                int numMenor = numeros[0];

                for ( int i:numeros) {

                        System.out.printf("ingrese el valor del números %s: ", k+1);
                        numeros[k]= Integer.parseInt(scanner.next());
                        k++;
                        if (numMenor>i){
                                numMenor=i;
                        }

                }


                if (numMenor<10) System.out.printf("el numero menor es  %s  y es menor que 10", numMenor);
                else if (numMenor==10) System.out.printf("el numero menor es  %s  y es igual que 10", numMenor);
                else System.out.printf("el numero menor es  %s  y es mayor que 10", numMenor);


        }


}




