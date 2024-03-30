package variablesDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DarLaFechaPorConsola {
        public static void main(String[] args) throws ParseException {
            Scanner scanner = new Scanner(System.in);


//manera de ingresar fehca por consola y seria lo mismo para Jopain
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(" ingrese el fecha con este formato yyyy-MM-dd ");

            Date fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();

            if (fecha2.after(fecha)) System.out.println("  La fecha ingresada por el usario es antes de la fuecha actual" );
            else if (fecha2.before(fecha)) System.out.println("  la fecha ingresada por el usuario es despues despues de la fecha actual ");
            else if (fecha2.equals(fecha)) System.out.println("Ambas fechas son iguales   ");

            if (fecha2.compareTo(fecha)>0) System.out.println("La fecha ingresada por el usario es antes de la fuecha actual   " );
            else if (fecha2.compareTo(fecha)<0) System.out.println(" la fecha ingresada por el usuario es despues despues de la fecha actual ");
            else if (fecha2.compareTo(fecha)==0) System.out.println("Ambas fechas son iguales   ");


            /*estas son las maneras de compara fechas*/
        }
    }


