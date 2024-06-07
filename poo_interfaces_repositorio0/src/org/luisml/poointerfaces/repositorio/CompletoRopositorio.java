package org.luisml.poointerfaces.repositorio;

public interface CompletoRopositorio extends   CrudRepositorio,
        OrdenableRepositorio,PaginableRepositorio,contable{ /*esto se hae para  que solo haya un interface en client list
        repositorio de esa manera nos ahorramos el casteo y solo llamamos a una interface ya que esta herada todo
        de las anteirores*/
}
