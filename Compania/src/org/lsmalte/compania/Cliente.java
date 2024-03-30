package org.lsmaltze.compania;

public class Cliente extends Person{
    private int clienteID ;

    public Cliente(String nombre, String apellido, String numeroFiscal, String dirrecion, int clienteID) {
        super(nombre, apellido, numeroFiscal, dirrecion);
        this.clienteID = clienteID;
    }

    public int getClienteID() {
        return clienteID;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ClienteID" + clienteID+ '\n';
    }
}
