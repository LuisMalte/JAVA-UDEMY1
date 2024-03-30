package operadores;

import java.util.Scanner;
  /* Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
        La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
        Si la capacidad actual es 70 litros: imprimir Estanque lleno
        Si está entre 60 y menor a 70: imprimir Estanque casi lleno
        Si está entre 40 y menor a 60: imprimir Estanque 3/4
        Si está entre 35 y menor a 40: imprimir Medio Estanque*/

public class AssignmentGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese medida actual del estanque: ");
        double litros = Double.parseDouble(scanner.next());

        if (litros==70) System.out.println(" Estanque lleno ");
        else if (litros>= 60 && litros<70) System.out.println("Estanque casi lleno " );
        else if (litros>= 40 && litros<60)System.out.println("Estanque 3/4 " );
        else if (litros>= 35 && litros<40)System.out.println("Medio Estanque" );

    }
}
