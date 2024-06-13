package org.maltelm.poointerfaces.repositorio;
//*se vovlio generica quitandole los clientes por <T>
// y indicando que es genrica **/

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
                        PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {
}
