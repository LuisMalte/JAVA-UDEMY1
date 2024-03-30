package org.luism.pooherencia;

public class Student extends Person{
    private String institucion;
    private double notaMatematicas;
    private double notaHistoria;
    private double notaEspanol;

    public Student (){
        System.out.println("Inicializando constructor estudiante.......");
    }
    /*no esta dando error debido a que existe un constructor vacio
            en person como esto permite que se pueda crear un objeto y luego se va agregando las demas cosas */
    public Student(String nombre,String apellido){
        super(nombre,apellido);
    }

    public Student(String nombre,String apellido, int edad,String institucion){
        super(nombre,apellido,edad);
        this.institucion= institucion;
    }
    public Student(String nombre,String apellido, int edad,String institucion,double notaMatematicas, double notaHistoria,double notaEspanol){
        super(nombre,apellido,edad);
        this.institucion= institucion;/*simpre debe ir super arriba ya que es lo que primero se instancia es decir primero
        se crea una persona y luego un alumno*/
        this.notaEspanol = notaEspanol;
        this.notaHistoria= notaHistoria;
        this.notaMatematicas = notaMatematicas;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public double getNotaEspanol() {
        return notaEspanol;
    }

    public void setNotaEspanol(double notaEspanol) {
        this.notaEspanol = notaEspanol;
    }

    @Override
    public String saludar() {
        return super.saludar()+ " Y soy un estudiante de la institución " +
                getInstitucion();
    }

    public  double calcularPromedio (){
        return (notaMatematicas+notaHistoria+notaEspanol)/3;
    }

    @Override
    public String toString() {
        return super.toString() +'\'' +
                "institucion='" + institucion + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaHistoria=" + notaHistoria +
                ", notaEspanol=" + notaEspanol +
                ", promedio="+ calcularPromedio() ;
    }
}
