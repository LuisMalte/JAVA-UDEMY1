package org.maltelm.poointerfaces.repositorio;

import java.util.List;

//*se vovlio generica quitandole los clientes por <T>**/
public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);
}
