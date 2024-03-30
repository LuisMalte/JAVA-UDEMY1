package org.lsmalte.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{
    protected String mensaje = "El campo %s tiene que ser de tipo email";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";/* esta es expreciones regualres y la usamos
    para tener la manera en que deberia ir el email es algo basico no es tan comejo lo que es mas se utiliza
    es que compruebe que haga un @ y que antes del @ haya caracteres y luego tambien haya ccaractres */
    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {

    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
