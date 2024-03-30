package org.luislm.app.jardin;

import org.luislm.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;
    /*protected se comporta muy similar al default en ambos se podra acceder
    * si estan el mismo paquete */

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
