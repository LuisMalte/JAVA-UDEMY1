package org.lsmalte.compania;

public class Gerente extends Empleado {
    private double presupuesto ;

    public Gerente(String nombre, String apellido, String numeroFiscal, String dirrecion,double remuneracion,int empleadoId,double presupuesto) {
        super(nombre, apellido, numeroFiscal, dirrecion,empleadoId,remuneracion);
        this.presupuesto = remuneracion;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "presupuesto" + presupuesto+ '\n';
    }
}
