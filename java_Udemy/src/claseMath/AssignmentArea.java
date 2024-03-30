package claseMath;

import javax.swing.*;

/*
Pedir el radio de un círculo y calcular su área.
    utilizar la formula:
    area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
    Recomiendo primero implementar la tarea en el IDE para probarla y revisarla bien,
    luego publica tu código de la clase main por esta vía.
*/
public class AssignmentArea {
    public static void main(String[] args) {
       double radio = Double.parseDouble(
               JOptionPane.showInputDialog(null, "Ingrese el area del circulo"));
       double area = Math.PI * Math.pow(radio,2);
       JOptionPane.showMessageDialog(null, "el area de un circulo con "+ radio+ " de radio es: "+ area);
    }
}
