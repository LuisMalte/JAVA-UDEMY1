package org.lsmalte.pooclasesabstractas.form.validador;

import org.lsmalte.pooclasesabstractas.form.validador.mensaeje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {

    protected  String mensaje = "el campo %s debe tener minimo %d y maximo %d";
    private  int min; /*preterminadamente empieza en 0*/
    private  int max = Integer.MAX_VALUE;

    public LargoValidador() {

    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        /*
        this.mensaje = String.format(this.mensaje, min,max);
        es string forma es para darle forma a un string funciona como lo e
        estoy usando en un string le doy un %d en el string principal los cuales seran las variables
        que iran y luego les doy las variables */
        if (valor==null){
            return true;
        }
        int largo = valor.length();
        return (largo>=min &&largo <= max);

    }

    @Override
    public String MensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, min, max);
    }



  /*  public  String getMensajeFormateado(String campo){
        return String.format(this.mensaje, campo, min, max);
    }*/
    /*ley doy un nuevo formato al mensaje usando strign format*/
}
