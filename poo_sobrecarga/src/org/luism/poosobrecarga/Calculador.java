package org.luism.poosobrecarga;

public class Calculador {

    /*creamos este metodo privado para que no se pueda crear o instaciar una objeto de la clase calculadora y se tenga que
    * usar de manera estatica */
    private Calculador() {
    }

    public  static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }
    public static float sum(float a, int b){
        return a+b;
    }

    public static float sum(int a, float b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static int  sum(String a, String b){
        int resultado;
        try {
            resultado=Integer.parseInt(a)+Integer.parseInt(b);
        }catch (NumberFormatException e ){
            return 0;
        }
        return resultado;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }


    /*la variables de argumentos premite agregar como un
    * parametro un arreglo o varias variables y esto se manejara como
    * un arreglo dentro del metodo*/
    public  static int sum(int... argumentos){
        int total =0;
        for (int i:argumentos) {
            total+=i;

        }
        return total;
    }

    public static int sum(float a,int... argumentos){
        int total =0;
        for (int i:argumentos) {
            total+=i;

        }
        return total;
    }


}

