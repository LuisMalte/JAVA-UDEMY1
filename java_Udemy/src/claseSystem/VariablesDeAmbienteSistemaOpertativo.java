package claseSystem;


import java.util.Map;

public class VariablesDeAmbienteSistemaOpertativo {
        public static void main(String[] args) {

            Map<String,String> varEnv = System.getenv();

            String username = System.getenv("USERNAME");
            System.out.println("username = " + username);

            String username2 = varEnv.get("USERNAME");
            System.out.println("username = " + username2);



            String java_Home = System.getenv("JAVA_HOME");
            System.out.println("java_Home = " + java_Home);

            String temp = System.getenv("TEMP");
            System.out.println("TEMP = " + temp);

            String temp2 = varEnv.get("TEMP");
            System.out.println("TEMP = " + temp2);


            //imprimo todos las variables de entorno  con un foreach

            for (String key: varEnv.keySet()    ) {
                System.out.printf( " %s --> %s \n",key,varEnv.get(key));

            }

/*esta es la manera de llamar o buscar las varialbes de entorno del sistemas opertivos tambien se puede agregar por consolo
 o en la aplicion de windowos varialbes de entrorno y hya que reiniciar intellij cuando se agrega si esque antes de agregar la varialbe nueva el intellij estaba abierto*/

        }
    }


