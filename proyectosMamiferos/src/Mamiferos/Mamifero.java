package Mamiferos;

public abstract class Mamifero {
    protected String habitat;
    protected String nombreCientifico;
    protected  float altura;
    protected  float peso;
    protected  float largo;

    public Mamifero(String habitat,
                    String nombreCientifico, float altura, float peso, float largo) {
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
        this.altura = altura;
        this.peso = peso;
        this.largo = largo;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public float getLargo() {
        return largo;
    }

     public abstract String comer();
     public abstract String correr();
     public abstract String dormir();
     public abstract String comunicarse();

}
