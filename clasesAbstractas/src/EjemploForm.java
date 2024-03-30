import org.lsmalte.pooclasesabstractas.form.elementos.ElementosForm;
import org.lsmalte.pooclasesabstractas.form.elementos.InputForm;
import org.lsmalte.pooclasesabstractas.form.elementos.SelectForm;
import org.lsmalte.pooclasesabstractas.form.elementos.TextareaForm;
import org.lsmalte.pooclasesabstractas.form.elementos.select.Opcion;
import org.lsmalte.pooclasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidadores(new RequeridoValidador()).addValidadores(new NoNullValidador());
        InputForm password = new InputForm("password","password");
        password.addValidadores(new RequeridoValidador())
                .addValidadores(new NoNullValidador())
                .addValidadores(new LargoValidador(6,10));

        InputForm email = new InputForm("email", "email");
        email.addValidadores(new RequeridoValidador())
                .addValidadores(new NoNullValidador())
                .addValidadores(new LargoValidador(7,20))
                .addValidadores(new EmailValidador());

        InputForm edad = new InputForm("edad","number");
        edad.addValidadores(new NumeroValidador());


        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidadores(new NoNullValidador());
        Opcion java = new Opcion("1","Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("1c","Python"))
                .addOpcion(new Opcion("3", "JavaScript").setSelected())
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));


        username.setValor("luis");
        password.setValor("123456");
        email.setValor("luis@gmail.com");
        edad.setValor("21");
        /*java.setSelected(true);
        *
        * */
        experiencia.setValor("... más de 10 años de experiencia ...");


       /* List<ElementosForm>elementosForms = new ArrayList<>();
        elementosForms.add(username);
        elementosForms.add(password);
        elementosForms.add(email);
        elementosForms.add(edad);
        elementosForms.add(experiencia);
        elementosForms.add(lenguaje);

        EN VEZ DE USAR ESTA ARRYLIST SE USA PARA QUE SE MEJOR EL ASLIST
        */
        /*esto



        es una calse anonima no es una clase que sea crea como las demas se crea como un metodo o objeto
        pero cumple casi la misma funcion por eso tiene el metodo dibujar y en este caso la clase anonima
        lo que hace es que se crea un elemntoform de tipo invalidado, es mas bien una clase que se crea
        para un solo objeto */

        ElementosForm saludar = new ElementosForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\"" +this.valor+ "\">";
            }
        };
        saludar.setValor("no sirve xd");


        List<ElementosForm>elementosForms = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar
        );


        for (ElementosForm e: elementosForms){
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }

      /*  elementosForms.forEach(e->{
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println); *//*err -> System.out.println(err) esto es lo mismo que lo
                esta ahi pero solo es una abreviatura
                 forEach(e-> es lo mismo que un foreach for (ElementosForm e: elementosForms){ solo que con una
                 expresion lamba*//*


            }
        });*/

        /*
        elementosForms.forEach(e->{
            if(!e.esValido()){
                e.getErrores().forEach(err -> System.out.println(e.getNombre()+":"+err)); /*err -> System.out.println(err) esto es lo mismo que lo
                esta ahi pero solo es una abreviatura pero solo puede ir a imprimir err no se le puede agragar mas
                 forEach(e-> es lo mismo que un foreach for (ElementosForm e: elementosForms){ solo que con una
                 expresion lamba


            }
        });
        lo que hace el codiogo es recorrer en el primer for se recorre
        todos los elementos y luego apartir de eso pro cada elemento se mira si es valido
        si no es valido se recorre los errores con el segundo for y en caso de ser valido no se hace nda
                */



        elementosForms.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}