package org.luism.pooherencia;

public class MianSobreEscrituraToString {
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
    System.out.println(person.toString());
    System.out.println("==================================================================FIN===========================================================");
/*otra manera de imprimir la informacion es usando el metodo toString
* algo interesante es que el metodo to string fue creado en el desde persona y por ende se llamaba al metodo
* saludar de persona pero cada vez que se llama el metodo to string el cual tiene el super.tostring imprime el metodo salutlar
* de cada clase lo mismo pasa con el metodo promedio de estudiante y estudiante internacional               */
}
}