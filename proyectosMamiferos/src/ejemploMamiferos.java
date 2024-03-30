import Mamiferos.*;

public class ejemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        Mamifero leon = new Leon("Sur Africa", "leonCi", 12, 58, 21, 120, 220, 190,2);
        Mamifero tigre = new Tigre("Rusia", "tigreCI", 72, 34, 130, 330, 300,"Siberiano");
        Mamifero lobo = new Lobo("Europa", "Ibérico", 120,1000 , 120, "Gris marrón y negro", 120, 70,"iberico");
        Mamifero perro = new Perro("Africa", "cientificoPerro",345 ,234 , 43, "Tricolor de manchas negras, blancas y óxido", 35,13);
        Mamifero tigreBengala = new Tigre("India e Indonesia", "Bengala1", 72, 317, 110, 270, 220,"Bengala2");
        Mamifero guepardo = new Guepardo("Africa", "cientificoTigre", 23, 94, 140, 72,245);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigreBengala;
        mamiferos[5] = guepardo;



        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanocolmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanoGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecible());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }


    }
    /*Aqui primero se usa un if donde entrara todos los tipos de animas y pasaran todos mediante un for que
    * recorre el array y al principio se imprime lo mas genericio es decirl oque que le pertense a
    * la calse mammifero como la altura peso etc,despues se usa un if donde se averigua si el animal es
    * instancia de felino o canino y dentro de esos if hay otros if para averugar que felinos son o caninos son
    * esto con el fin de poder impimir los atributos de cada animal en especificio y a su vez tambien imprimir
    * lo que tiene los felinos y caninos y luego de eso se llama los metodos comer dormir, corerr y comunicarse sin
    * tener que mirar sus instnacias ni castearlos ya que esos metodos viene de la clse mas generica que es mamiferos */

}