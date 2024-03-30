package org.lsmalte.compania;

public class Empleado extends Person{
    private int empleadoId;
    private double remuneracion;

    public Empleado(String nombre, String apellido, String numeroFiscal, String dirrecion, int empleadoId, double remuneracion) {
        super(nombre, apellido, numeroFiscal, dirrecion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "EmpleadoId" + empleadoId + '\n'+
                "Remuneracion=" + remuneracion + '\n';
    }
    public void  aumenarRemuneracion( int porcentaje){
        double aumento = (double) porcentaje /100;
        remuneracion += aumento*remuneracion;
    }
}
