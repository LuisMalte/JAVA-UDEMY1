package arreglos;

import java.util.Scanner;

public class EjmEstudiantes {

    public static void calificaciones( double[] clase){
        Scanner scanner = new Scanner(System.in);
        int i=0;
        for (double j:clase) {
            System.out.printf("Ingrese la nota del estudiante %s: ",(i+1));
            clase[i++]= scanner.nextInt();
        }

    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] claseMatematicas, claseHistorias, claseLenguaje;
        claseMatematicas = new double[3];
        claseHistorias = new double[3];
        claseLenguaje = new double[3];

        double sumaMatematicas = 0, sumaHistorias = 0, sumaLenguaje = 0;


        System.out.println("""
                
                ================================Ingrese la notas de matematicas ========================================
                 \s""");
        calificaciones(claseMatematicas);
        System.out.println("""
        
                ================================Ingrese la notas de historia ========================================
                 \s""");
        calificaciones(claseHistorias);
        System.out.println("""
                
                ================================Ingrese la notas de lenguaje ========================================
                 \s""");
        calificaciones(claseLenguaje);


        for (int i =0; i<claseHistorias.length; i++){
            sumaMatematicas+=claseMatematicas[i];
            sumaHistorias+=claseHistorias[i];
           sumaLenguaje+=claseLenguaje[i];

        }



        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- Promedios  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

        System.out.printf("el promedio de la clase de matemáticas es: %s \n",(sumaMatematicas/3));
        System.out.printf("el promedio de la clase de historia es: %s \n",(sumaHistorias/3));
        System.out.printf("el promedio de la clase de lenguaje es: %s\n",(sumaLenguaje/3));
        System.out.printf("el promedio total es: %s \n",((sumaLenguaje+sumaMatematicas+sumaHistorias)/3));


        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");


        System.out.println("Ingrese el id de un estudiante");
        int id = scanner.nextInt();

        sumaLenguaje = claseLenguaje[id];
        sumaMatematicas = claseMatematicas[id];
        sumaHistorias = claseHistorias[id];



        System.out.printf("el promedio total del estudiante %s es  %s \n", id ,((sumaLenguaje+sumaMatematicas+sumaHistorias)/3));


    }
}
