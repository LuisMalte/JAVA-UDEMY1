package org.lsmalte.appFacturas.modelo;

import java.security.SecureRandom;

public class Cliente {
    private String nombre;
    private String nif; //codigo tributario

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
