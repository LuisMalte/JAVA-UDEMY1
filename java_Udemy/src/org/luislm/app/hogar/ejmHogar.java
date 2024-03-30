package org.luislm.app.hogar;

import org.luislm.app.jardin.Perro;
import static org.luislm.app.hogar.Persona.saludar;
public class ejmHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
/* perro.jugar(p) perro no puede jugar en la casa
esto porque el metodo jugar esta default y asi evitamos que el perro no juege en la casa
*/



        /*Persona.saludar();*/
        String saludar = saludar();
        /*para utilizar metodos staticos sin instanciar la clase
        * tambien hay que importar el metodo estatico incluso si ambas clases son del
        * mismo paquete */
    }


}
