package claseSystem;


import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadesDeSystem {
        public static void main(String[] args) {

            try {
/*
                esta es una forma de agragar ciertas configuaraciones a la clase system
                primero se crear un archivo tipo file y luego en el archivo se van poniendo las configuracioens
                necesarios se parando las palabras por .
                luego aqui se llama el archivo con fileInput luego se crea un obejto propierties
                para poder subir las nuevas configuraciones con load y luego actulizar las configuariaciones con serpropierties y ya estaria
                si se quiera agrgar una configuracion sin crear un archivo se puede desde usando el objeto properties.setProperties */
                FileInputStream archivo = new FileInputStream("src/config.propearties");
                Properties properties = new Properties(System.getProperties()   );
                properties.load(archivo);
                properties.setProperty("escuchando.music","si");
                System.setProperties(properties);
                System.getProperties().list(System.out);
                System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
                System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");

                String properties2 = System.getProperty("otra");
                System.out.println("properties = " + properties2);
            }catch (Exception exception){

                System.err.println("error no hay un archivo con ese nombre");
                /*esto es una manera para que se imprima en rojo para mostrarlo como un error */
                System.out.println("exception = " + exception);

                System.exit(1);
         /*       lo que hace es que salga del programa esto si no lo pongo tambine saldra pero es una manera manul
                ademas que de esta manera puedo poner un status que puede ser cualquier numero lo normal es 0*/
            }


        }
    }


