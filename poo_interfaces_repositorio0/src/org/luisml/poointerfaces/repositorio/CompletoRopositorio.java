package org.luisml.poointerfaces.repositorio;

import java.util.List;

/*
public interface CompletoRopositorio extends   CrudRepositorio,
        OrdenableRepositorio,PaginableRepositorio,contable{ */
/*esto se hae para  que solo haya un interface en client list
        repositorio de esa manera nos ahorramos el casteo y solo llamamos a una interface ya que esta herada todo
        de las anteirores*//*

}



Se paso a una forma generica por eso la <T>
*/
public interface CompletoRopositorio <T>extends   CrudRepositorio<T>,
        OrdenableRepositorio<T>,PaginableRepositorio<T>, Contable {
    List<T> listar(int desde, int hasta); /*esto se hae para  que solo haya un interface en client list
        repositorio de esa manera nos ahorramos el casteo y solo llamamos a una interface ya que esta herada todo
        de las anteirores*/
}
