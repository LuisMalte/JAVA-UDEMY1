package wrapper;

import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {
      String text = "metodo get class";
      Class strclass = text.getClass();

        System.out.println("strclass.getName() = " + strclass.getName()); //
//        En Java, la clase "Class" es una clase predefinida que te permite obtener
//        información sobre otras clases en tiempo de ejecución. Puedes usarla para
//        acceder a los métodos, campos, constructores y otras características de una clase en particular.
        System.out.println("strclass.getName() = " + strclass.getSimpleName());
        System.out.println("strclass.getName() = " + strclass.getPackageName());
        System.out.println("strclass = " + strclass);

        for (Method method : strclass.getMethods()){ // muestra todos los metodos de la clase string
            System.out.println("method.getName() = " + method.getName());


        }
        Integer num = 1;
        Class intClas = num.getClass();

        System.out.println("intClas.getSuperclass() = " + intClas.getSuperclass()); // MUESTRA LA CLASE PADRE
        System.out.println("intClas.getSuperclass() = " + intClas.getSuperclass().getSuperclass()); // MUESTRA LA CLASE PADRE DEL PADRE

    }
}
