package org.luisml.poointerfaces.repositorio;

import org.luisml.poointerfaces.modelo.Cliente;

import java.util.List;

/*
public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);

    void crear(Cliente cliente);
    void editar (Cliente cliente);
    void eliminar(Integer id);


}

Se paso a una forma generica por eso la <T>
*/
public interface CrudRepositorio <T>{
    List<T> listar();
    T porId(Integer id);

    void crear(T cliente);
    void editar (T cliente);
    void eliminar(Integer id);


}
