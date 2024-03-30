package aPOO.auto;

public class EjmAuto {

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        /*lo que hace es new es que guardo el objeto en un espacio de la memoria pero auto1 que seria la
        * variable no guarda al objeto lo que guarda es la referecia de la ubicacion del objeto guardado */

        auto1.setColor(Color.AZUL);
        auto1.setFabricante("KIA");
//
//        System.out.println("auto1.color = " + auto1.color);
//        System.out.println("auto1.fabricante = " + auto1.fabricante);
//        System.out.println("auto1.modelo = " + auto1.modelo);
//        System.out.println("auto1.cilindraje = " + auto1.cilindraje);

        auto1.setModelo("SI");

        System.out.println(auto1);
        System.out.println("================================================================");
        System.out.println(auto1.acelerar(130) );
        System.out.println("================================================================");

        System.out.println(auto1.frenar());
        System.out.println("================================================================");
        System.out.printf("Kilometros por litros: %s \n", auto1.calcularConsumo(80,0.60f));
        System.out.println("================================================================");
        System.out.printf("Kilometros por litros: %s \n",auto1.calcularConsumo(80,60));
/*esta tiene algo de encapsulamiento ya que se pieden ciertas cosas que no se pueden ver es decir yo pido el metodo calcualr
* consumo pero no estoy viendo lo que hay por dentro solo me da el valor y ya *
 */
//        Auto auto2 = new Auto("chevrolet", "logan ", Color.NEGRO, 100);
        Auto auto2 = new Auto("chevrolet", "logan ", Color.NEGRO,new Motor(TipoMotor.BENCINA,2.0), new Estanque(30));





        //METODO EQUALS
//        Auto copy = new Auto("chevrolet", "logan ", Color.NEGRO, 100);
        Auto copy = new Auto("chevrolet", "logan ", Color.NEGRO,new Motor(TipoMotor.BENCINA,2.0), new Estanque(30));
        System.out.println("auto2 y copy son iguales? "+ (auto2==copy));
        System.out.println("auto2 y copy son iguales? "+ (auto2.equals(copy)));


        /*antes de haber sobre escrito el metodo equls ambos daban false pero ahora sobre escrito == da false y equls da
* true*/





        // ///////////////////////////////////////////////////////////////////////////////////////////////////
        // USO DE METODO STATIC
        System.out.println("================================================================");
        System.out.println("================================================================ \n");

//        Auto auto3 = new Auto("chevrolet", "logan ", Color.ROJO, 150);
        Auto auto3 =new Auto("chevrolet", "logan ", Color.ROJO,new Motor(TipoMotor.DIESEL,2.0), new Estanque(30));
        System.out.println(auto3);

        Auto.setKilometros(50);

        System.out.println("DESPUES DE EL METODO STATIC");
        System.out.println(auto1);
        System.out.println(copy);
        System.out.println(auto3);
        Auto.setCapacidadEstantan(12);
        System.out.println("kilometros por litros => " +  Auto.calcularConsssumo(300,60));
        /*Se puede convocar el metodo calcularConsssumo como auto1 o auto3.calcularConsssumo pero no es lo idoneo
        * ya que lo mejor es llamarlo con el nombre de la clase  */




        /// DESPUES DEL ID
        System.out.println("auto1 = " + auto1);
        System.out.println("auto2 = " + auto2);
        System.out.println("copy = " + copy);
        System.out.println("auto3 = " + auto3);


        // USO TIPO AUTO
        auto1.setTipo(TipoAuto.PICKUP);
        System.out.println("auto1 = " + auto1);

        TipoAuto tipo = auto1.getTipo();
        switch (tipo){
            case COUPE -> System.out.println("Es un Auto pequeño de dos puertas y típi|camente deportivo ");
            case CONVERTIBLE -> System.out.println("El Auto es deportivo y descapotable de dos puertas");
            case FURGON -> System.out.println("el Auto es utilitario de trasporte, de empresas");
            case HATCHBACK -> System.out.println("Es un Auto mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un Auto de doble camina o camioneta  ");
        }
/*ES una manera de usar el switch case con clases enum dondde dependiendo lo que se escoja se puede hacer algo
* puede ir codigo mas complejo pero en esta caso solo se puso un print */



        ///////FOR EACH CON ENUM

        for (TipoAuto i:TipoAuto.values() ) //tipovalues da un arraglo con los enum
        {
            System.out.println(i);
        }
    }
}
