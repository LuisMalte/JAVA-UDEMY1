package org.luism.pooherencia;

public class MianConstructoresSuper {
    public static void main(String[] args) {

        Person person = new Person("nombre","adaf",12);
        person.email="email.com";

        Student student = new Student("no", "si",12,"inem",2.4, 2.4,2.3);
        student.email="email2.com";

        Professor professor = new Professor("name","lastname",23,"mate");
        professor.email="email2.com";

        InternationalStudent   internationalStudent = new InternationalStudent("nom","alm",12,"inem","Alemania",4);
       internationalStudent.setNotaEspanol(3);
       internationalStudent.setNotaMatematicas(2);
       internationalStudent.setNotaHistoria(5);


        System.out.println("\n\nInformación del estudiante:");
        imprimir(student);
        System.out.println("=============================================================================================================================\n\n");
        System.out.println("Información de la persona:");
        imprimir(person);
        System.out.println("=============================================================================================================================\n\n");
        System.out.println("Información de la estudiante internacional:");
        imprimir(internationalStudent);
        System.out.println("=============================================================================================================================\n\n");
        System.out.println("Información del profesor:");
        imprimir(professor);
        System.out.println("=============================================================================================================================\n\n");


    }
static void imprimir(Person person){
    System.out.println("Información de la persona:");
    System.out.printf("Nombre: %s %s\n",person.getNombre() , person.getApellido());
    System.out.printf("Email: %s\n", person.email);
    System.out.printf("Edad: %d\n", person.getEdad());
    if (person instanceof  Student){
        System.out.println("=============================================================================================================================");
        System.out.println("Información del estudiante:");
        System.out.printf("Institución: %s\n",((Student)person).getInstitucion());
        System.out.println("Calificaciones:");
        System.out.printf("Matemáticas: %.2f\n", ((Student)person).getNotaMatematicas());
        System.out.printf("Historia: %.2f\n",((Student)person). getNotaHistoria());
        System.out.printf("Español: %.2f\n", ((Student)person).getNotaEspanol());
        System.out.println("Promedio notas "+ ((Student) person).calcularPromedio() );

        if (person instanceof InternationalStudent){
            System.out.println("=============================================================================================================================");
            System.out.println("Información del estudiante internacional:");
            System.out.printf("País: %s\n",((InternationalStudent)person).getPais());
            System.out.printf("Nota de idioma: %d\n", ((InternationalStudent)person).getNotaIdioma());
            System.out.println("Promedio notas internacional "+ ((Student) person).calcularPromedio() );
        }
    }
    if (person instanceof Professor             ) {
        System.out.println("=============================================================================================================================");
        System.out.println("Información del profesor:");
        System.out.printf("Asignatura : %s\n",((Professor)person).getAsignatura());
        System.out.println("=============================================================================================================================");

    }

    System.out.println(person.saludar());
    /*esto es un metodo sobreescrito es decir cada clase tiene el mismo metodo pero de manera diferente
    *  entonces por eso se usa el person ya que como todos lo tienen lo que hace es que si es un estudiante pues tambien es una persona
    * pero ira al metodo de estudaitne que es el sobre escrito
    * cosas interesantes que se puede usar una parte de lo que se usa en el metodo
    * con el super()
    *  public String saludar() {
        return super.saludar()+" soy profesor de la asignatura "+ getAsignatura();
    }
    * que lo que hace es coger lo que devoleria el metodo de la clase padre y queda ya adisposicion
    * de nosotros que agregarle como en este case que le agrege un string mas
    *
    * otra cosa intereante es que studiante internacional se sobre escribira desde los sobre escribido de student no lo de persona */
    System.out.println("==================================================================FIN===========================================================");


    /**/
}
}