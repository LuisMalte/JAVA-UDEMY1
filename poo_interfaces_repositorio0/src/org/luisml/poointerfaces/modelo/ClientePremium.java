package org.luisml.poointerfaces.modelo;

public class ClientePremium  extends  Cliente implements  Comparable<ClientePremium> {
    public ClientePremium(String nombre, String apellido) {
        super(nombre, apellido);
    }
/*compare to no tiene ninguan fucionalidad solo se usa para usarlo de
 ejemplo
* */
    @Override
    public int compareTo(ClientePremium o) {
        return 0;
    }
}
