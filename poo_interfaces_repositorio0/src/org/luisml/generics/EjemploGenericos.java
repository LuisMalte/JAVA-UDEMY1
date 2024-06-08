package org.luisml.generics;

import org.luisml.poointerfaces.modelo.Cliente;
import org.luisml.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();/*una lista internamente es un generico */
        clientes.add(new Cliente("Andres", "Guzmán"));
        Cliente[] clientesArreglo = {new Cliente("Luci", "Martínez"),
                new Cliente("Andres", "Guzmán")};
        Integer[] enterosArreglo = {1,2,3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe",
                "Luci", "Bea", "John"}, enterosArreglo);



        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernández")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiumList);

        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6, 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Máximo de zanahoria, arándanos, manzana es: "
                + maximo("zanahoria", "arándano", "manzana"));

    }


    public static <T> List<T> fromArrayToList(T[] c){ /*ejemplo de un metodo generic  donde t es el dato
    generico que recibiri cualquier lista de cualquier tipo y luego se convertira en un arrray*/
        return Arrays.asList(c);
    }
    public static <T extends Number > List<T> fromArrayToList(T[] c){ /*ejemplo de un metodo generic donde
    se limita es decir que t aunque es generico tiene que ser de un tipo generico numer ya sea float, int,
    short etc */
        return Arrays.asList(c);
    }
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){ /*
    ejemplo de metodo generico limitado a que sea cliente y que esa clase implemente el metodo
    comparable*/
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x){
        /*un ejemplo de un metodo generico con dos argumentos el cual x se imporeme  x es una array y t lo con
        * vierte en una lista */
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public  static  void  imprimirClientes(List<? extends Cliente> Cliente){
        Cliente.forEach(System.out::println);

    }
    /*lo que va dentro de <> al principio es la limitación y el tipo generico
    * y */

    /*  <T extends Comparable<T>> es la restricción y la declaracin de un metodo
    * generic
    *T maximo la T es lo que se va a devolver y maximo es el nombre
    * (T a, T b, T c) los parametros del metodo */
    public  static  <T extends  Comparable<T>> T maximo(T a, T b, T c){
        /**/
        T max = a;
        if (b.compareTo(max)>0){ /*esto es por la tabla unicode el cual da mayor a 0 si
        es mayor y se mantiene o es menor si es menos */
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
}
