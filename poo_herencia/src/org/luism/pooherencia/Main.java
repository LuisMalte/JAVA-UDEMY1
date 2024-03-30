package org.luism.pooherencia;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creando un objeto tipo estudiante");
        Student student = new Student();
//        Person student = new Student();
        /*En caso de que se incistnacia asi se debera castear a student para que pueda acceder a todos los metodos de Student
        * tal que asi:
        *  ((Student)student).setNotaEspanol(3.2);
        * y ya te esta manera se podria acceder a los metodos de estudiante */
        student.setNombre("Luis");
        student.setEdad(13);
        student.setNotaEspanol(3.2);


        System.out.println("Creando un objeto tipo professor");
        Professor professor= new Professor();
        professor.setNombre("ricardo");
        professor.setEdad(64);
        professor.setAsignatura("español");


        /*Al crear un clase con hijos los getters y setters del padre los podra usar el
        * hijo incluso si esos atributos no los tiene el hijo    */

        student.email= "lus@.com";
        professor.email= "lus@.com";

        /*esto se puede hacer porque email esta con protected lo que hace que se pueda
        * acceder primero que sea una clase que este en el mismo paquete y tambien que sea una clase hija*/

        System.out.printf("Estudiante: Nombre: %s, Edad: %d, Nota Español: %.2f, Email: %s%n",
                student.getNombre(), student.getEdad(), student.getNotaEspanol(), student.email);
        System.out.println("============================================================================================");
        System.out.printf("Profesor: Nombre: %s, Edad: %d, Asignatura: %s, Email: %s%n",
                professor.getNombre(), professor.getEdad(), professor.getAsignatura(), professor.email);

        System.out.println("============================================================================================\n");
        System.out.println("Creando un objeto tipo InternationalStudent");

        InternationalStudent intStudent = new InternationalStudent();
        intStudent.setNombre("carlos");
        intStudent.setApellido("malte");
        intStudent.setInstitucion("Inem");
        intStudent.setNotaMatematicas(4.5);
        intStudent.setNotaIdioma(5);
        intStudent.setPais("argentina");
        /*esto demuetra que todas las clases hija de una que tambien es hija puede acceder
        * a los metodos de la class abulo*/
        /*Con esto podemos ver como al crear una clase hija ya primero a su clase padre es decir primero se instancia como
        * persona, luego como estudiante, y por ultimo como estudiante intercambi eso solo en los casos que ambas
        * clases tenga costructores vacios ya que en caso que haya un constructor con argumentos tendre que usar super() dentre de los
        * cotructores de los hijos que lo que hara que pueda llamar a los otros constructores de las clases padres y darle
        * los argumentos que son requeridos es decir si tengo la clase padre con un constructor con argumento nombre entonces
        * uso super en estudiante para que no me de error y pueda poner nombre llamando desde la clase constructor de estudainte
        * llamr*/
        Class clase = intStudent.getClass();

        System.out.println("============================================================================================");
        System.out.println("============================================================================================");
        while(clase.getSuperclass() !=   null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.printf("La clase %s es hija de la clase padre %s \n",
                    hija, padre);
            clase = clase.getSuperclass();


        }
        /*de esta manera puedo ver como de que clase era cada clase para eso solo tengo que coger
        * la ultima clase en este caso intstudent para luego get clase que lo que hace es decir cual es
        * su clase y superClass dice cual es su clase padre y luego solo cambio de clase hija para repterilo mismo
        * hasta que ya no haya clase padre*/
    }
}