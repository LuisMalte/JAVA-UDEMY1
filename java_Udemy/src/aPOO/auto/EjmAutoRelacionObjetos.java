package aPOO.auto;

import java.lang.reflect.Array;

public class EjmAutoRelacionObjetos {

    public static void main(String[] args) {
        Rueda[] ruedasC1 = new Rueda[5];

//        ruedasC1[0] = new Rueda("Tokohama", 16 ,7.5);
//        ruedasC1[1] = new Rueda("Tokohama", 16 ,7.5);
//        ruedasC1[2] = new Rueda("Tokohama", 16 ,7.5);
//        ruedasC1[3] = new Rueda("Tokohama", 16 ,7.5);
//        ruedasC1[4] = new Rueda("Tokohama", 16 ,7.5);

                            /*UNA MANERA MAS OPTIMIZADA */
        for (int i=0; i<ruedasC1.length;i++) {
            ruedasC1[i] = new Rueda("Tokohama", 16 ,7.5);
        }
        Persona conductor1 = new Persona("Luci", "Martinez");
        Auto auto2 = new Auto("chevrolet", "logan ", Color.NEGRO,new Motor(TipoMotor.BENCINA,2.0), new Estanque(30));
        auto2.setConductor(conductor1);
        auto2.setRuedas(ruedasC1);



        Persona conductor2 = new Persona("Pato", "Rodriguez");
        Auto auto3 = new Auto("Mazda", "BT-50 ", Color.ROJO,new Motor(TipoMotor.DIESEL,3.0), new Estanque(30));
        auto3.setTipo(TipoAuto.PICKUP);
        auto3.setConductor(conductor2);

        Rueda[] ruedasC2 = new Rueda [5];
        for (int i=0; i<ruedasC2.length;i++) {
            auto3.addRuedas(new Rueda("Tokohama", 16 ,7.5));
        }


        Persona conductor3 = new Persona("Bea", "gonzales");
        Auto auto4 = new Auto("Nissan", "Navara ", Color.GRIS,new Motor(TipoMotor.DIESEL,3.0), new Estanque());
                 auto4.addRuedas(  new Rueda("Pirelli", 20 ,11.5))
                .addRuedas(  new Rueda("Pirelli", 20 ,11.5))
                .addRuedas(  new Rueda("Pirelli", 20 ,11.5))
                .addRuedas(  new Rueda("Pirelli", 20 ,11.5))
                .addRuedas(  new Rueda("Pirelli", 20 ,11.5));
                 auto4.setConductor(conductor3);


        System.out.println(auto4);



    }
}
