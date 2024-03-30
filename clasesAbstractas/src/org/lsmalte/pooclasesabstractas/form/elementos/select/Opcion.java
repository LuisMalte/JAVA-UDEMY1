package org.lsmalte.pooclasesabstractas.form.elementos.select;

public class Opcion {
    private String valor;
    private String nombre;
    private boolean selected;

    public Opcion() {
    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Opcion setSelected() {
        this.selected = true;
        return this;
    }
    /* se sobre escribe el metodo selected para poder selecionar
    * una opcion sin necesidad de crear una variable es decir al momenot de
    * agregarla a lista se puede selecionar  en vez de hacerlo como se hizo con java
    *
    *         /*java.setSelected(true); esto hace el primer metodo
                    .addOpcion(new Opcion("3", "JavaScript").setSelected()) y esto el segundo

     */


}
