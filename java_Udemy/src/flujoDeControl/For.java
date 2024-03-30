package flujoDeControl;


public class For {
        public static void main(String[] args) {
            for (int i=1, j = 10; i<j; i++ ,j-- ){

                if ( j %2!=0){
                    continue;
            }
                System.out.println(i +" -- "+j );

            }

            // en el for puede ir mas de dos variables y se puede usar un if y un continue para que no se realice cierta accion
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_f-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");

            String []nombres = {"luis","miguel", "antonio", "angel","sofia"};

            for (int i = 0; i<=nombres.length; i++){

                if (nombres[i].toLowerCase().contains("sofia") || nombres[i].equalsIgnoreCase("miguel")){

                    // se puede ver que hay dos fromas de buscar si hay cierto string en un arrelgo
                    continue;
                }
                System.out.println("nombre "+ i+ " " + nombres[i] );

            }

            //no se puede usar <= cuando se quiere impirmir un arreglo ya que en este caso ira a un numero extra es decir si tengo un arreglo
            // de tres y le pongo el <= el bucle dara un giro de 4 veces lo que o casiona el bulce vaya a un ciclo que no existe y aprace este
            //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
            //	at FlujoDeControl.For.main(PropiedadesDeSystem.java:23) para que esto no suceda se puede restarle uno a nombre.lenght o no solo poner <
        }
    }


