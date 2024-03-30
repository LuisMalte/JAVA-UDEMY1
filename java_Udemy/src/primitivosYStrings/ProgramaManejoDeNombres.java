package primitivosYStrings;

import javax.swing.*;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre de la primera persona");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre de la segunda persona");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre de la tercera persona");

        String[] nombes = {nombre1,nombre2,nombre3};
        for( String  i : nombes){
            System.out.println(i.toUpperCase().charAt(1)+"."+i.substring(i.length()-2));
        }


    }
}
