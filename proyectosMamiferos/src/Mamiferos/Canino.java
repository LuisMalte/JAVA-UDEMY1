package Mamiferos;

public abstract class Canino extends Mamifero {
    protected String color;
    protected  float tamanocolmillos;

    public Canino(String habitat, String nombreCientifico,
                  float altura, float peso, float largo, String color, float tamanocolmillos) {
        super(habitat, nombreCientifico, altura, peso, largo);
        this.color = color;
        this.tamanocolmillos = tamanocolmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanocolmillos() {
        return tamanocolmillos;
    }
}
