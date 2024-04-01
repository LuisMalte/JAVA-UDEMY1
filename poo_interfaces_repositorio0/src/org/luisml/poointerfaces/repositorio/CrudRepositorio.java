package org.luisml.poointerfaces.repositorio;

import org.luisml.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);

    void  Crear (Cliente cliente);
    void editar (Cliente cliente);
    void eliminar(Integer id);

}
