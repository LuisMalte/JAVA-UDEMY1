package operadores;

import javax.swing.*;

public class AssignmentOrdenar {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));

        String  orden = num1>num2? Integer.toString(num1)+ ", " + Integer.toString(num2):Integer.toString(num2)+ ", " + Integer.toString(num1);


        JOptionPane.showMessageDialog(null, orden);

    }
}
