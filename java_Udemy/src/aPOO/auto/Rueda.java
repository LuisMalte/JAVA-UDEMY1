package aPOO.auto;

public class Rueda {
    private  String fabriacante;
    private  Integer aro;
    private  Double ancho;

    public String getFabriacante() {
        return fabriacante;
    }

    public Integer getAro() {
        return aro;
    }


    public Double getAncho() {
        return ancho;
    }


    public Rueda(String fabriacante, Integer aro, Double ancho) {
        this.fabriacante = fabriacante;
        this.aro = aro;
        this.ancho = ancho;
    }


}
