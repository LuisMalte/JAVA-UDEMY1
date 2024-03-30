package Mamiferos;

public abstract class Canino extends Mamifero {
    protected String color;
    protected  float tamañocolmillos;

    public Canino(String habitat, String nombreCientifico,
                  float altura, float peso, float largo, String color, float tamañocolmillos) {
        super(habitat, nombreCientifico, altura, peso, largo);
        this.color = color;
        this.tamañocolmillos = tamañocolmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamañocolmillos() {
        return tamañocolmillos;
    }
}
