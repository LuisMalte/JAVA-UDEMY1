package org.lsmalte.pooclasesabstractas.form.validador;

public class NoNullValidador extends Validador{

    protected  String mensaje = "el %s no puede ser nulo"; /*
    este sera el mensaje predetermindo que saldra en caso de error */
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;/*
        este set es para modificar el mensaje predeterminado*/
    }    @Override
    public String getMensaje() {
        return mensaje;
    }


    @Override
    public boolean esValido(String valor) {
        return (valor != null && !valor.isBlank());
    }
}
