package org.luisml.poointerfaces.modelo;

import java.util.Objects;

public class Cliente{
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;


    public Cliente(){
        this.id = ++ultimoId;  //se usa el ultimo id porque es static y se mantiene
    }

    public Cliente(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Cliente.ultimoId = ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id); //esto equivale a decir que primero el id no sea nulo
        /* this.id != null luego combrueba que sea igual al id del cliente que se esta cursando
        * && this.id.equals(cliente.id)*/

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
