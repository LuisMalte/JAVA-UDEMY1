package org.maltelm.poointerfaces.repositorio;

import java.util.List;
//*se vovlio generica quitandole los clientes por <T>**/

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
