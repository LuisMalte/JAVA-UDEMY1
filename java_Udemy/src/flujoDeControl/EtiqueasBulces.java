package flujoDeControl;


public class EtiqueasBulces {
        public static void main(String[] args) {

            bucle1: for (int i = 0; i < 5; i++) {
                System.out.println();
                 for (int j = 0; j < 5; j++) {
                    if (i == 2 && j == 3) {
                        break bucle1;
                    }
                    System.out.printf("[i = %s, j = %s] ", i, j);
                }
                 //printf es una manera mas facil de concatenar a mi parecer solo hay que poner %s donde quiero que vaya la
                //variable

            }

         /*
             bucle1: Esto es una etiqueta es practicamente como nombrar un bucle y esto sirve para decir  que bulce se sale
             este caso si no pongo  break bucle1; se saldra del bucle sin nombre y seguira mostrando las demas cosas pero con
             esto logro salirme de todo el bucle sin desde le segundo bulce las etiquetas tambien pueden ir en un while
            */

        }


}




