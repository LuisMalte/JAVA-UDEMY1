package variablesDate;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AssigmentCalculadoraEdad {
        public static void main(String[] args) throws ParseException {

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            Date fechaNacimiento = format.parse(JOptionPane.showInputDialog(null,
                    " ingrese el fecha  de su nacimiento con este formato yyyy-MM-dd "));

            Date fecha2 = new Date();
             format = new SimpleDateFormat("yyyyMMdd");


            int nacimiento = Integer.parseInt(format.format(fechaNacimiento));
            int actual = Integer.parseInt(format.format(fecha2));

            int edad = (actual -  nacimiento)/10000;
            JOptionPane.showMessageDialog(null,"la edad es: " + edad);

            //lo que se hace es muy sencillo es recivir las fechas de nacimiento y luego volverlas en un int para luego restarlas
            //lo mas intereante es la forma de hallar la fecha donde ser resta la actul y la reciente pero ambas de una menera completa
            // es decir mi fecha nacimiennto seria 20041224 y la actual 20230623  lo cual es interesante porque de esa manera se puede ver
            // la forma mas exacta

        }
    }


