package operadores;

import java.util.Scanner;

public class EjmLoginTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] usernames = {"luis","miguel","carlos"};
        String [] passwords = {"luis1","miguel1","carlos1"};

        System.out.print ("Ingrese el username: " );
        String u = scanner.next();

        System.out.print ("Ingrese el password: " );
        String p = scanner.next();

        boolean valido = false;
        for ( int i = 0; i< usernames.length; i++){
             valido =  usernames[i].equalsIgnoreCase(u)&&passwords[i].equalsIgnoreCase(p)? true:valido;
             //se pone : valido ya que en este caso de que se ponga false, como no se puede por el break entonces usar el bucle seguira
            // corriendo y validado la informacion entonces casi siempre dara false lo unicamanera que no de error es si en caso de que
            // el usuario que se busca se el ultimo entonces se pone la misma variable para que en caso de que el usuari no sea el ultimo se guarde
            // el valor que obtuvo antes

        }

        String sentence = valido ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username o password incorrecta".concat("\n lo siento    necesita autentificación");

        System.out.println(sentence);

    }
}
