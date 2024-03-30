package org.lsmalte.pooclasesabstractas.form.validador;

public abstract class Validador {
    protected String mensaje;
    public abstract String getMensaje();
    abstract public void  setMensaje(String mensaje);

    abstract public  boolean esValido(String valor);
}
