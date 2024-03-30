package org.luislm.app.jardin;

import  org.luislm.app.hogar.*; //De esta mananera se importa todo el paquete incluyendo ambas
//clases  es por el *




/*import static org.luislm.app.hogar.Persona.saludar;
import  static org.luislm.app.hogar.Persona.GENERO_MASCULINO;
import  static  org.luislm.app.hogar.Persona.GENERO_FEMENINO;*/
import  static  org.luislm.app.hogar.Persona.*;
/*De esta manera se importa todos los statics */



import static org.luislm.app.hogar.ColorPelo.*;
/*se importa de igual manera como si fuera una atributos estaticos */

public class EjmPaquete {
    public static void main(String[] args) {

  /*      Gato gato = new Gato();*/
       /* org.luislm.app.Perro perro= new Perro(); en este caso se debe importar nada ya que esta en
   el mismo paquete */


        Persona persona = new Persona();
        persona.nombre = "luis";
        Perro perro= new Perro();
        perro.nombre= "paco";
        perro.raza = "si";
        String jugar = perro.jugar(persona);
        System.out.println("jugar = " + jugar);




        /*al importar un metodo estatico no hay necesidad instanciarlo
        * con la clase persona es decir se vuelve como si fuera de la clase
        * ejmPaquete se converite en un metodo statico de esta calse lo mismo
        * se puede hacer con atributos*/
        String saludar = saludar();
        String generoFemenino = GENERO_FEMENINO;


        persona.setColorPelo(ColorPelo.MONO);
        persona.setColorPelo(AZUL);
    }
}
