package org.luisml.poointerfaces.repositorio;

import org.luisml.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*public class ClienteListRepositorio  *//*implements CrudRepositorio,
        OrdenableRepositorio,PaginableRepositorio*//* implements CompletoRopositorio{



Se paso a una forma generica por eso la <T>*/
public class ClienteListRepositorio  extends AbstractaListRepositorio <Cliente>{
    private List<Cliente> dataSource;

 /*   public ClienteListRepositorio() {
        this.dataSource= new ArrayList<>(); //se inicializa la lista para que cada vez que se cree tenga la clase tenga la
        //lista
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }
*/
    @Override
    public Cliente porId(Integer id) {
        Cliente c= null;
        for(Cliente cliente:dataSource){
            if(cliente.getId() != null && cliente.getId().equals(id)){
                c= cliente;
                break;
            }
        }
        return c;
    }

/*
    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);

    }
*/

    @Override
    public void editar(Cliente cliente) {
        Cliente c=this.porId(cliente.getId());
        c.setNombre(cliente.getNombre()); //creo un cliente y los datos de ese cliente se los pongo a c{
        //que es el cliente que voy a modificar por eso es el getnombre y getappellido
        c.setApellido(cliente.getApellido());

    }

   /* @Override
    public void eliminar(Integer id) {
        dataSource.remove(this.porId(id));

    }*/

/*    @Override
    public List<Cliente> list(String campo, Direccion direccion) {
//        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
*//*        listaOrdenada.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {

            DE FORMA MAS CORTA PARA ESO SE USA UNA EXPRESIONES   LAMBDA*//*
        dataSource.sort((a,b)->{
                int resultado =0;
                if(direccion== Direccion.ASC){
                    switch (campo){
                        case "id"->
                            resultado= a.getId().compareTo(b.getId());
                        case "nombre"->
                                resultado= a.getNombre().compareTo(b.getNombre());
                        case "apellido"->
                                resultado= a.getApellido().compareTo(b.getApellido());

                    }

                } else if (direccion== Direccion.DESC) {
                    switch (campo){
                        case "id"->
                                resultado= b.getId().compareTo(a.getId());
                        case "nombre"->
                                resultado= b.getNombre().compareTo(a.getNombre());
                        case "apellido"->
                                resultado= b.getApellido().compareTo(a.getApellido());

                    }
                }
                return resultado;
            }
            );
        return dataSource;


        DE MANERA MAS OPTIMIZADA:
    }*/

    public List<Cliente> list(String campo, Direccion direccion) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a,b)->{
                    int resultado =0;
                    if(direccion== Direccion.ASC){
                        resultado = ordenar(campo, a, b);

                    } else if (direccion== Direccion.DESC) {
                        resultado = ordenar(campo, b, a);

                    }
                    return resultado;
                }
        );
        return listaOrdenada;
    }

 /*   @Override
    public List<Cliente> list(int desde, int hasta) {
        return dataSource.subList(desde,hasta); *//*subconjunto de la lista   *//*
    }*/
    public static int  ordenar(String campo,Cliente a,Cliente b ) {
        int resultado = 0;
        switch (campo){
            case "id"->
                    resultado= a.getId().compareTo(b.getId());
            case "nombre"->
                    resultado= a.getNombre().compareTo(b.getNombre());
            case "apellido"->
                    resultado= a.getApellido().compareTo(b.getApellido());

        }

        return  resultado;

    }


/*    @Override
    public int total() {
        return  this.dataSource .size();
    }*/
}


