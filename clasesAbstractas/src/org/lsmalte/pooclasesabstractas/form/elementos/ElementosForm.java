package org.lsmalte.pooclasesabstractas.form.elementos;

import org.lsmalte.pooclasesabstractas.form.validador.LargoValidador;
import org.lsmalte.pooclasesabstractas.form.validador.Validador;
import org.lsmalte.pooclasesabstractas.form.validador.mensaeje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementosForm {
    protected String valor;
    protected String nombre;
    List<Validador> validadores;
    List<String> errores;

    /*se crea una lista validadores y otro errores una es para validar
    * todos los elementos y la otro para agregar sus errores */
    public ElementosForm() {
        this.validadores=new ArrayList<>();
        this.errores=new ArrayList<>();

        /*se inicializa las listas antes creadas al crear cualquier elementosform*/
    }
    public ElementosForm addValidadores(Validador validador){
        this.validadores.add(validador);
        return this;
        /*se agrega los validadores ya que se podra validar
        un elementoform con varios validadores y se uso this para poder seguir agregando
        * despues de usar el metodo ya que devuelve el mimos objeto*/
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getErrores() {
        return errores;
    }

    public ElementosForm(String nombre) {
        this(); //se llama el constructor vació
        this.nombre = nombre;
    }

    public void setValor(String valor) {

        this.valor = valor;
    }

    public boolean esValido(){
      for(Validador v: validadores){
          if(!v.esValido(valor)){
              if(v instanceof MensajeFormateable){
                  this.errores.add(((MensajeFormateable)v).MensajeFormateado(nombre));
                  /*convierto el validador generico a un validador LargoValidador haciendo con el casteo y luego
                  * llamo el metodo que da el mensaje formateado*/

              }else{
                  this.errores.add(String.format(v.getMensaje(), nombre));

              }
          }
      }
      return  this.errores.isEmpty();
    }
/*aqui se hace todos las validadciones se recorre la lista validadores
* y luego se mira si el validador es false y si es false se agrega a la lista erorres y
* esa lista se le agrega los errores que viene predeterminados
* y luego para dar un true o false solo se verifica si la lista errores
* esta vacia ya que si esta vacia entonces es valida ya que
* no hay errores y si no es vacia es porque hay errores y devolvera false*/
    abstract public String dibujarHtml();
}
