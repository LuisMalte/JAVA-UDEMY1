package claseSystem;
public class EjecutarAppSO {
        public static void main(String[] args) {

            /*esta es una manera de abir ciertos programas del sistema opertivo
            * se debe usar un objeto de la clase runtime y otra process de alli
            * de asegurar me de cual es sistemas opertativos (so) y luego ejecuto el
            * programa */
            try {
              Runtime runtime = Runtime.getRuntime();
              Process process;
              if (System.getProperty("os.name").toLowerCase().startsWith("windows")){
                 process =  runtime.exec("explorer");
              }else {
                  process = runtime.exec("notepad");
              }
              process.waitFor(); // esta metodo lo que hace es esperar a que se cierre la aplacion para que se acabe
                // el programa
            }catch (Exception exception){

                System.err.println("error no hay un aplicación con ese nombre");
                System.out.println("exception = " + exception);

                System.exit(1);

            }


        }
    }


