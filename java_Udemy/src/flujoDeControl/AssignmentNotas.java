package flujoDeControl;
import javax.swing.*;
/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio
de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos
(contadores, sumas).Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error
 finalizando el programa.
*/

public class AssignmentNotas {
        public static void main(String[] args) {

              double[] notas = new double[20];
              double suma5=0, suma4=0, suma=0 ;
              int cantidad5=0, cantidad4=0, cantidad1=0;
              boolean errores= false;

              for (int i=0; i< notas.length;i++){

                      notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                              "Ingrese el la nota del niño ".concat(Integer.toString(i+1))));
                      if (notas[i]==0 || notas[i] >7) {
                          errores=true;
                          JOptionPane.showMessageDialog(null, "Error ingreso una nota fuera del rango");
                          break;
                      } else if (notas[i]>5) {
                          suma5 +=notas[i];
                          cantidad5++;
                      }
                      else if (notas[i]<4) {
                          suma4 +=notas[i];
                          cantidad4++;
                          if (notas[i]==1) {
                              cantidad1++;
                          }
                      }

                      suma+=notas[i];

              }

             if (!errores) {
                 JOptionPane.showMessageDialog(null,
                         "El promedio de notas mayores que 5 es ".concat(Double.toString(suma5 / cantidad5)));
                 JOptionPane.showMessageDialog(null,
                         "El promedio de notas menores a 4  es ".concat(Double.toString(suma4 / cantidad4)));
                 JOptionPane.showMessageDialog(null,
                         "La cantidad de niños que sacaron 1 fue  ".concat(Integer.toString(cantidad1)));
                 JOptionPane.showMessageDialog(null,
                         "El promedio de todas las notas es ".concat(Double.toString(suma / 20)));
             }


        }


}




