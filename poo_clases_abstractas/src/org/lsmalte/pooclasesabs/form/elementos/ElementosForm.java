package org.lsmalte.pooclasesabs.form.elementos;


 public abstract class ElementosForm {
    protected String valor;
    protected String nombre;

    public ElementosForm() {

    }

    public ElementosForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    abstract  public String dibujarElmento();
    /*un metodo public no puede tener cuerpo es decir nada
     * entre {} */
}

