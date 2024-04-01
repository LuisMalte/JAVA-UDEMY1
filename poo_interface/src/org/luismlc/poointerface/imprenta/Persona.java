package org.luismlc.poointerface.imprenta;

public class Persona {
    private String nombre;
    private  String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return STR."\{nombre} \{apellido}";
    }
}

/*se usa un costructor vacio en caso de que se necesite
 pasar los valores por el setter y no por el constructor*/