import org.luisml.poointerfaces.modelo.Cliente;
import org.luisml.poointerfaces.repositorio.*;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Pérez"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Luci", "Martínez"));
        repo.crear(new Cliente("Andrés", "Guzmán"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Cliente> paginable = ((PaginableRepositorio)repo).list(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo)
                .list("apellido", Direccion.ASC);
        for(Cliente c: clientesOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println(" ============= ");
        ((OrdenableRepositorio)repo)
                .list("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("===== eliminar ======");
        //repo.eliminar(2);
        repo.listar().forEach(System.out::println);


    }
}
