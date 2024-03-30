import org.lsmalte.almacen.*;

public class Main {
    public static void main(String[] args) {
        Producto[] productos= new Producto[5];
        productos[0] = new Producto("namePro",3000);
        productos[1] =  new Lacteo("nameLa",5000,2,230 );
        productos[2] = new Fruta("nameFru",1000,1,"roja");
        productos[3] = new Limpieza("nameLi",2300,"si",1.5);
        productos[4] = new NoPerecible("nameNo",1000,2,270 );

        imprimir(productos);
    }
    static void imprimir (Producto[] productos){
        for(Producto i: productos){

        System.out.println("-------------------------------- " + i.getClass().getSimpleName() + "---------------------------------");
        System.out.println("Nombre: " + i.getNombre());
        System.out.println("Precio: " + i.getPrecio());
        switch (i) {
            case Lacteo lacteo -> {
                System.out.println("Cantidad (gr/cc): " + lacteo.getCantidad());
                System.out.println("Proteinas (gr): " + lacteo.getProteinas());
                System.out.println("--------------------------------fin---------------------------------");

            }
            case Fruta fruta -> {
                System.out.println("Peso (gr): " + fruta.getPeso());
                System.out.println("Color: " + fruta.getColor());
                System.out.println("--------------------------------fin---------------------------------");
            }
            case Limpieza limpieza -> {
                System.out.println("Componentes: " + limpieza.getComponentes());
                System.out.println("Litros: " + limpieza.getLitros());
                System.out.println("--------------------------------fin---------------------------------");
            }
            case NoPerecible noPerecible -> {
                System.out.println("Calorias (kCal): " + noPerecible.getCalorias());
                System.out.println("Contenido neto (gr): " + noPerecible.getContenido());
                System.out.println("--------------------------------fin---------------------------------");
            }
            /*este case hace lo mismo que si tuviera if (producto instance of fruta)
            * pero de una manera mas facil y sin usar instnace of ya que con el case basta
            * ya que dice como si producto es fruta se hace tal cosa y ya solo que enveces de usar
            * la varialbe i se usa una variable auxiliar creada en el case  */

            default ->{
                System.out.println("--------------------------------error---------------------------------");

            }
        }
        }
    }
}