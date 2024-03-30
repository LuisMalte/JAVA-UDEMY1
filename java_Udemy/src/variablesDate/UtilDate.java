package variablesDate;


import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDate {
        public static void main(String[] args) {

            Date fechaActual = new Date();

            //Esta es la manera de modificar una variable tipo date con esta casle y con metodo
            // para que funcione hay que saber las palabras recervasas por ejemplo dia es dd mes
            //MMMM con 4 M para imporimir el mes con su nombre completo con 3 es abreviado y con dos es en numeros
            //y asi hay varais maneras
            SimpleDateFormat fechaCustom = new SimpleDateFormat
                    ("dd 'de' MMMM 'del año' yyy 'y la hora exacta es' m - s");

            System.out.println("La fecha es" + fechaCustom.format(fechaActual));

            // se puede buascar en internet todas las combinanionces y palbras disponibles
            //se busca  simpledateformat java #

             fechaCustom = new SimpleDateFormat
                    ("yyyy.MM.dd G 'at' HH:mm:ss z"	);

            System.out.println("La fecha es " + fechaCustom.format(fechaActual));
            System.out.println(" -_-_-_--_-_-_--_-_-_- -_-_-_--_-_-_--_-_-_- \n \n ");

            Date fechaInicio = new Date();
            long suma = 1;
            for (int i = 1; i < 10000000;i++) {
                suma += i;
            }
            System.out.println("suma = " + suma);

            Date fechaFin = new Date();

            Long tiempo = fechaFin.getTime()-fechaInicio.getTime();
           /*  metodo getTime de vuelve un nuemero de tipo long que referencia los milisegundos desde  January 1, 1970,
            hasta hoy
            lo que hacemos es tomar el tiempo al inicio del bulce for y al final para luego restarlos para ver cuantos
            milisegundos tardo*/
            System.out.println("tardo  " + tiempo);


            
            Long tiempo2 = fechaFin.getTime();
            System.out.println("tiempo2 = " + tiempo2);
            
            /*PRO TIPs
            USAR CONTROL ESPACIO PARA VER SUGERENCIAS EN LAS VARIABLES
            USAR CONTROL Y USAR EL CURSOR  ENCIMA DE UNA VARIABLE PARA VER INF0RMACION DE COMO FUE INSTANCIADA, CREADA 
            USAR CONTROLQ Q Y  USAR EL CURSOR  ENCIMA DE UNA VARIABLE DE UNA VARIABLE O METODO  VER INF0RMACION DE QUE TIPO ES, 
            Y QUE HACE EL METODO 
            * */

        }
    }


