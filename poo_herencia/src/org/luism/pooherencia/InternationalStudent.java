package org.luism.pooherencia;

public class InternationalStudent extends Student {
    String pais;
    int notaIdioma;
public InternationalStudent(){
    System.out.println("Inicializando constructor InternationalStudent.......");

}
    public InternationalStudent(String nombre,String apellido, int edad,String institucion,String pais,int notaIdioma){
        super(nombre,apellido,edad,institucion);
        this.pais = pais;
        this.notaIdioma=     notaIdioma;
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNotaIdioma() {
        return notaIdioma;
    }

    public void setNotaIdioma(int notaIdioma) {
        this.notaIdioma = notaIdioma;
    }

    @Override
    public String saludar() {
        return super.saludar()+ " pero soy un estudiante internacional estudio en "+getPais();
    }

    @Override
    public double calcularPromedio() {
        return (super.calcularPromedio()*3+notaIdioma)/4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pais='" + pais + '\'' +
                ", notaIdioma=" + notaIdioma;
    }
}
