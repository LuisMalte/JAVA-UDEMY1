package aPOO.auto;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjmAutoArreglos {

    public static void main(String[] args) {
        Persona conductor1 = new Persona("Luci", "Martinez");
        Auto auto2 = new Auto("chevrolet", "logan ", Color.NEGRO,new Motor(TipoMotor.BENCINA,2.0), new Estanque(30));
        auto2.setConductor(conductor1);



        Persona conductor2 = new Persona("Pato", "Rodriguez");
        Auto auto3 = new Auto("Mazda", "BT-50 ", Color.ROJO,new Motor(TipoMotor.DIESEL,3.0), new Estanque(30));
        auto3.setTipo(TipoAuto.PICKUP);
        auto3.setConductor(conductor2);



        Persona conductor3 = new Persona("Bea", "gonzales");
        Auto auto4 = new Auto("Nissan", "Navara ", Color.GRIS,new Motor(TipoMotor.DIESEL,3.0), new Estanque());
        auto4.setConductor(conductor3);


        Auto auto5 = new Auto("suzuke", "vitara",Color.GRIS,new Motor(TipoMotor.BENCINA,16),new Estanque());
        auto5.setTipo(TipoAuto.SUV);
        auto5.setConductor(new Persona("Lalo", "salamanca"));

        Auto auto6 = new Auto("Audi","A3");
        auto5.setConductor(new Persona("Jano", "Perez" ));

        Auto[] autos = new Auto[5];
        autos[0] = auto2;
        autos[1] = auto3;
        autos[2] = auto4;
        autos[3] = auto5;
        autos[4] = auto6;


        Arrays.sort(autos);
        for(Auto i : autos){
            System.out.println(i.getFabricante() +" "+ i.getModelo());
        }

    }
}
