import org.lsmalte.compania.Cliente;
import org.lsmalte.compania.Empleado;
import org.lsmalte.compania.Gerente;
import org.lsmalte.compania.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjmEmpresa {
    public static void main(String[] args) {

      Person person = new Person("nombre", "lastname","323PE","calle100PE");
      Cliente cliente = new Cliente("nameCli","lasNameCli","323CLI","calle100CLE",23);
      Gerente gerente = new Gerente("nameGe","lasNameGE","323GE","calle100GE",2000,134,134123);
      Empleado empleado = new Empleado("nameEM","lasNameEM","323EM","calle100EM",200023,1000);


        System.out.println("=============================================================================================================================");
        imprimir(empleado);

        System.out.println("==================================================================FIN===========================================================");
        System.out.println("=============================================================================================================================");
        imprimir(gerente);
        gerente.setPresupuesto(200000);
        System.out.println("==================================================================FIN===========================================================");
        System.out.println("=============================================================================================================================");
        empleado.aumenarRemuneracion(50);
        imprimir(empleado);
        System.out.println("==================================================================FIN===========================================================");
        System.out.println("=============================================================================================================================");
        imprimir(gerente);
        System.out.println("==================================================================FIN===========================================================");
    }
    static void imprimir(Person person) {
        System.out.println(person.toString());
        System.out.println("==================================================================FIN===========================================================");
    }
}       