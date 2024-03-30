package org.luislm.app.hogar;
public class Persona {
    public String nombre;
    public String apellido;

/*String nombre; /*como esta en default no se podra acceder fuera a el fuera del
paquete
*/
    public static final  String GENERO_MASCULINO = "Masculino";
    public  static final String GENERO_FEMENINO = "Femenino";


    private ColorPelo colorPelo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String lanzarPelota(){
        return "lanza la pelota";
    }

    public static String saludar(){
        return "hola que tal";
    }


}

