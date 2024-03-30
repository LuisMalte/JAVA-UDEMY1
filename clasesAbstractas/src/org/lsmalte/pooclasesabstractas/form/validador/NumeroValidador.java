package org.lsmalte.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{
    protected  String mensaje = "el %s tiene que ser un entero";
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
        try {
            Integer.parseInt(valor);
            return true;
        }catch (NumberFormatException exception){
            return false;
        }
    }
}
