package variablesDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DarLaFecha {
        public static void main(String[] args) {

            Calendar calendario = Calendar.getInstance();

            calendario.set(2020,1,25,15,20,10);
            // hay que tener en ucneta que los meses se cuentan desde 0 asi que el mes 0 es enero y el 11 es diciembre
            System.out.println("calendario sin formato = " + calendario.getTime());


            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");

            calendario.set(2020,Calendar.MAY,25,12,20,10);
            // Ya que empieza desde cero hay una funcion para poder obtener el día
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("calendario con formato  = " + formato.format(calendario.getTime()));

            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
          // ESTA ES UNA FORMA DE PONER LA FECHA TAMBIEN ESTA TAMBIEN TIENE MAS FORMAS DE MODIFICAR COMO LA HORA QUE SE PUEDE PONER AM Y PM
            calendario.set(Calendar.YEAR, 2021);
            calendario.set(Calendar.MONTH,10);
            calendario.set(Calendar.DATE, 12);
            calendario.set(Calendar.HOUR, 10);// SE PUEDE TAMBINE HACER PARA SELECIONAR HORAS DE 0 A 23 PERO HAY QUE PONER HourOfDay
            calendario.set(Calendar.AM_PM, 1 ); //SE PUEDE PONER 1 PARA PM O 0 PARA AM O SE PUEDE USAR Calander.AM o PM
            calendario.set(Calendar.MINUTE, 10);
            calendario.set(Calendar.SECOND, 10);
            calendario.set(Calendar.MILLISECOND, 10);

            formato = new SimpleDateFormat(" 'Dia:'EEEE, 'Fecha':yyyy-MM-dd, 'hora:' HH:mm:ss:SSS:a");
            System.out.println("calendario con formato   = " + formato.format(calendario.getTime()));

            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");

            Calendar calendario2 = Calendar.getInstance();

            calendario2.set(2020,1,25,15,20,10);
//tambien se puede comvinar ambas maneras
            calendario2.set(Calendar.HOUR, 10);
            calendario2.set(Calendar.AM_PM, 1 );
            System.out.println("calendario con formato   = " + formato.format(calendario2.getTime()));






        }
    }


