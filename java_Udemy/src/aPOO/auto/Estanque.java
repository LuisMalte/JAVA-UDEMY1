package aPOO.auto;

public class Estanque {
    private int capacidad;



    public Estanque() {
    this.capacidad = 40;
        }
    public Estanque(int capacidad) {
        this.capacidad = capacidad;
    }
    public int getCapacidad() {
        return capacidad;
    }
/*no se pone set porque ya se dara en el costructor
* y no sera modificable solo se podra ver  se pone dos
*  costructores uno para tener valores predetermindos
* y otro para darle los valores que quiera */
}
