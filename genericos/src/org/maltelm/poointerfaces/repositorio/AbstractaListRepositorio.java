package org.maltelm.poointerfaces.repositorio;

import org.maltelm.poointerfaces.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;


/*esta clase tiene todos los elmentos pero estan de mnaera genericas por eso el
* <T extends BaseEntity> que es lo que lo hace generico y que lo limita a que toda
* clase generic tiene que tener implmentada o heredar a baseEntity          y tambien
* implementa los metodos de las clase ordenable es decir que hija se hace esto como s
* si fuese una capas. esta clase sera la que usemas para los mains*/
public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {

    /*son los mismos metos que teniamos antes solo que se cambia en vez de cliente por
    * T que generico*/
    protected List<T> dataSource; /*lista abstracta */

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }


    /*como limitamos a que los obejos tienen que heredar de la clase BaseEntity
    * por eso podemos tener este metodo con los get ya que todos objetos
    * que implementes esta clase deben tener id   */
    @Override
    public T porId(Integer id) {
        T resultado = null;
        for(T cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
