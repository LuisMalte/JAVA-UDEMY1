package org.luisml.poointerfaces.repositorio;

import org.luisml.poointerfaces.modelo.Cliente;

import java.util.List;

/*public interface PaginableRepositorio {
    List<Cliente> list(int desde, int hasta);



Se paso a una forma generica por eso la <T>
}*/
public interface PaginableRepositorio <T> {
    List<T> list(int desde, int hasta);
}
