package Mamiferos;

public abstract class Felino extends Mamifero {
    protected float tamanoGarras;
    protected int velocidad;


    public Felino(String habitat, String nombreCientifico, float altura, float peso, float largo, float tamanoGarras, int velocidad) {
        super(habitat, nombreCientifico, altura, peso, largo);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
/*cuando una clase abstracta es hija de otra clase abstracta no tiene la
* necesidad de implmentar el metodo o los atributos de la clase padre abstracta
*
* tambien en ese casa ya no creamos los protected de la clase padre a las
* clases hijas esto porque no es necesario ademas esas variables se pueden acceder
* desde cualquier calse hija
*
* cabe recordar que en los costructores se usa el supera para inicilizar la clase
* mamifero es decir desde felino podemos inicilizar mamifero y todas sus variables
* lo cual no es opcional se debe inicializar con super*/