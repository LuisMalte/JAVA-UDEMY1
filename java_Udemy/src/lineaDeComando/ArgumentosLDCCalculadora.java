package lineaDeComando;



public class ArgumentosLDCCalculadora {
    public static void main(String[] args) {

        if ( args.length!= 3){
            System.out.println("Debe ingresar valores ");
            System.exit(-1);
        }
        String operacion = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        double resultado = 0;
        switch (operacion){
            case "suma" -> resultado = num1 +num2;
            case "div" ->{
                if (num2 == 0){
                    System.out.println(" no se puede dividir por 0" );
                    System.exit(-1);
                }
                resultado = (double) num1 /num2;

            }
            case "multi" -> resultado = num1*num2;
            case "resta" -> resultado = num1-num2;

        }
        System.out.println("resultado es: " + resultado);
    }
}

//para poder correr el codigo desde el compliador se seleciona los tres puntos al lado del debug y luego se selecciona
        //ejecutar con parametros y en parametros se pone lo que se necesite se seleciona aplicar  y luego se ejecuta

