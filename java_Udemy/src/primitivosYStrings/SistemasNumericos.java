package primitivosYStrings;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal =0;


        try{
             numeroDecimal = Integer.parseInt( JOptionPane.showInputDialog(null, "ingrese un numero"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "vuelva a escribir el numero");
            main(args); // se llama el metodo main en la expecion en la clase para que se repita
            System.exit(0); // se llama esto para terminar el codigo y con esto no hacer dos veces el metodo main el que entra en la expcion
            // y el que queda con decimal 0
        }



        // con integer.parseINT lo que hago es llamar la clase Integer y llamao el metodo parseINT para convertir un string en un int
        System.out.println("numeroDecimal = " + numeroDecimal);
        int numeroBinario = 0b0101;
        System.out.println("numeroBinario = " + numeroBinario);
        int numeroOctal =037;
        System.out.println("numeroOctal = " + numeroOctal);
        int numeroHexadecimal = 0X202f;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

       String resultadoBinario = ("numero Decimal "+numeroDecimal  +" en binario " + Integer.toBinaryString(numeroDecimal));
        String resultadoHexadecimal =("numero Decimal "+ numeroDecimal  +" en hexadecimal " + Integer.toHexString(numeroDecimal));
        String resultadoOctal =  ("numero Decimal "+numeroDecimal  + " en octal " + Integer.toOctalString(numeroDecimal));

        System.out.println(resultadoBinario);
        System.out.println(resultadoOctal);
        System.out.println(resultadoHexadecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n"+ resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
        // JoptionPane es algo similar una clase donde dependiendo el metodo que escojamos sera una podra escribir texto o solo
        // sera un mensaje lo que hace es morar ventanas con mensajes


    }
}
