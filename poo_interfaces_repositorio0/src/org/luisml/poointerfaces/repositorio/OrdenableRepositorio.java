package org.luisml.poointerfaces.repositorio;

import org.luisml.poointerfaces.modelo.Cliente;

import java.util.List;

/*public interface OrdenableRepositorio {
    List<Cliente> list(String campo, Direccion direccion);



Se paso a una forma generica por eso la <T>
}*/
public interface OrdenableRepositorio<T> {
    List<T> list(String campo, Direccion direccion);
}
