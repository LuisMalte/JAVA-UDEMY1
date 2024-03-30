package aPOO.auto;

public class Motor {
    private  TipoMotor tipo;
    private double cilindrada;

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Motor() {
    }

    public Motor(TipoMotor tipo, double cilindrada) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }
}
