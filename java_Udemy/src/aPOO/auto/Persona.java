package aPOO.auto;

public class Persona {
    private  String nommbre;
    private  String apellido;

    public String getNommbre() {
        return nommbre;
    }

    public String getApellido() {
        return apellido;
    }
    public Persona(String nommbre, String apellido) {
        this.nommbre = nommbre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nommbre + " " + apellido + '\'';
    }
}
