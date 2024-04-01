package org.luismlc.poointerface.imprenta;


import static org.luismlc.poointerface.imprenta.Genero.PROGRAMACION;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(  new Persona("John","Doe"), "Ingenieria de sistemas"
               , "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Informe informe = new Informe(new Persona("Martin","22"),new Persona("Fowler","23")
                , "Estudio sobre microservicios");



        Libro libro =  new Libro(new Persona("Erika","34"),
                "Patrones de diseños: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }
    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}