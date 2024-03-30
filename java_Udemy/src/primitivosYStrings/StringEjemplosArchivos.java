package primitivosYStrings;

public class StringEjemplosArchivos {
    public static void main(String[] args) {

        String archivo = "algun_Archivo.xml";
        String archivo1 = "algun_Archivo1.pdf";
        String archivo2= "algun_Archivo2.dll";
        String archivo3= "algun.Archivo3.js";

        String[] archivos = {archivo, archivo1, archivo2, archivo3};
//esta es la mejor manera de ver las extenciones de los archivos usando losm metodos de los strings se usa el
// lastIndex porque este da la ubicacion del . y se usa last porque puede habaer casos de nombres con varios puntos y solo necesitamos el ultimo
// y se usa el metodo subString por que da el nombre del archivo
// desde cierto punto y se le suma uno porque si lo daria con el punto
        for (String archivoTemp : archivos) {
            int i = archivoTemp.lastIndexOf('.');
            System.out.println(archivoTemp.substring(i+1));
        }

    }
}
