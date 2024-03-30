package flujoDeControl;


public class EjmEtiquetas {
        public static void main(String[] args) {
            String frase = "tres tigres tristes tigres tragan trigo en un trigal";
            String palabra = "tigre";

            int maxPalabra = palabra.length();
            int maxFrase = frase.length()-maxPalabra; // esto se hace para que llego hasta las
            // ultimos 5 caracteres de la frase ya que no tendira sentido ya que en menos de 5 caractres no entrara la palabra
            int cantidad = 0;

           buclePrincipal:
           for (int i=0; i<= maxFrase;){
               int k =i;
               for (int j=0; j< maxPalabra; j++){
                   if (palabra.charAt(j)!=frase.charAt(k++)){
                   i++;
                   continue buclePrincipal; // aqui es importante la etiqueta ya que en caso de faltar pasaria a cantidad++ y a la suma de i
                       // y daria un resultado erroneo
                    }

               }
              cantidad++;
              i+=maxPalabra;

           }
           System.out.printf("La cantidad de veces que se repite la palabra %s es %s veces ", palabra, cantidad);
    }
}


