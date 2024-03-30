package org.luism.pooherencia;

public class Person {
        private String nombre;
        private String apellido;
        protected String email;

        private int edad;

    public Person (){
        System.out.println("Inicializando constructor persona.......");
    }
    public Person(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido= apellido;
    }

    public Person(String nombre,String apellido, int edad){
        this(nombre,apellido); /*esto lo que hace es que llama al otro constructor para haci reutilizarlo */
        this.edad=edad;
    }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String saludar(){
        return "hola que tal!. mi nombre es "+ getNombre();
    }

    @Override
    public String toString() {
        return  saludar() +
                ", apellido='" + apellido + '\'' +
                ", mi email es='" + email + '\'' +
                ", mi edad es=" + edad ;
    }
    /*Al crear un clase con hijos los getters y setters */
}
