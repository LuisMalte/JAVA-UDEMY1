package org.luism.pooherencia;

public class Professor extends Person {
    private String asignatura;


    public Professor() {
        System.out.println("Inicializando constructor profesor.......");
    }

    public Professor(String nombre, String apellido, int edad, String asignatura) {
        super(nombre, apellido, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return super.saludar() + " soy profesor de la asignatura " + getAsignatura();
    }


    @Override
    public String toString() {
        return  super.toString();
    }

    /*public FINAL class Person en caso de que tuviera una calse asi con final pero en veces de mayuscolas
    * minusculas no se podria tener clases que herreden esto debido a que final no permite que se herede y lo mismo pasaria
    * con los metodos si le pongo un metodo final  public  final String saludar() no
    lo podre sobre escribir  esto es usado por seguirdad o por diseño */
}
