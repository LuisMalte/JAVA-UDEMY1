package operadores;

import javax.swing.*;


public class EjmNumMayorTernario {
    public static void main(String[] args) {
       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "));
       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "));
       int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "));

       int  numMax = num1>num2? num1:num2;
       numMax = num3>numMax? num3: numMax;

       JOptionPane.showMessageDialog(null, "el numero mayor es: ".concat(Integer.toString(numMax)));
    }
}
