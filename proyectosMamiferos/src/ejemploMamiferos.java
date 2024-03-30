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
        mamiferos[1] = guepardo;


        for (Mamifero animal : mamiferos) {

        }



    }
}