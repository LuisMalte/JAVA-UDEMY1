package claseSystem;


import java.util.Properties;

public class PropiedadesDeSystem {
        public static void main(String[] args) {
            String username = System.getProperty("user.name"); // da el nombre de usuario
            System.out.println("username = " + username);

             String home = System.getProperty("user.home"); // en que perfil esta
            System.out.println("home = " + home);

             String workpace = System.getProperty("user.dir"); // ubicacion del archivo
            System.out.println("workpace = " + workpace);

             String java = System.getProperty("java.version"); // version de java
            System.out.println("java = " + java);

             String lineSeparator  = System.getProperty("line.separator"); // salto de linea no se ve nada pero se hace el salto
            System.out.println("line.separator: " + lineSeparator + "una linea nueva");


             String lineSeparator2  = System.lineSeparator(); // salto de linea de una manera mas simple
            System.out.println("line.separator: " + lineSeparator2 + "una linea nueva");


            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
            System.out.println(" todas las propiedades de system \n ");
            Properties properties = System.getProperties();
            properties.list(System.out);//se impirmie una lista de todas las propiedadew
            /*
            system es una clase que proporcina metods e informacion del entrorno o del sistema
            para ver todoas las propiedades se puede hacer llamaando el metodo System.getProperties(); o
            mirando la pagina web de java https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
            */
        }
    }


