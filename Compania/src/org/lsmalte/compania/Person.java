package org.lsmalte.compania;

public class Person {
        private String nombre;
        private String apellido;

        private String numeroFiscal;
        private String dirrecion;


    public String getApellido() {
        return apellido;
    }


    public String getNumeroFiscal() {
        return numeroFiscal;
    }


    public String getDirrecion() {
        return dirrecion;
    }

    public Person(String nombre, String apellido, String numeroFiscal, String dirrecion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.dirrecion = dirrecion;
    }

    @Override
    public String toString() {
        return "===========================================================" +
                "Nombre'" + nombre + '\n' +
                "Apellido'" + apellido + '\n' +
                "NumeroFiscal'" + numeroFiscal + '\n' +
                "Dirrecion'" + dirrecion + '\n';
    }
}
