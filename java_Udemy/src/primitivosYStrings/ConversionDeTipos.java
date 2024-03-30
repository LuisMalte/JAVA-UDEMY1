package primitivosYStrings;

public class ConversionDeTipos {
    public static void main(String[] args) {
        
        String intSrt = "12";
        int intNum = Integer.parseInt(intSrt); //control d para duplicar linea de codigo
        System.out.println("intNum = " + intNum);

        String byteSrt = "1";
        byte byteNum = Byte.parseByte(byteSrt);
        System.out.println("byteNum = " + byteNum);

        String doubleStr = "12e-1";
        double doubleNum = Double.parseDouble(doubleStr); //alt j para selecionar varias varialbes iguales y escoger cuales modificar
        System.out.println("doubleNum = " + doubleNum);


        String floatStr = "1222.2e-8f";
        float floatNum = Float.parseFloat(floatStr); //control por encima de la variable para ver que tipo de varialbe es
        System.out.println("floatNum = " + floatNum);

        String booleanSrt = "TruE";
        boolean boleanVariable = Boolean.parseBoolean(booleanSrt); //se puede escribir TRUE de cualquier forma
        // ya que el metodo parse usa equalsIgnoreCase(s);
        System.out.println("boleanVariable = " + boleanVariable);
        
        int intNum2 = 12;
        String intSrt2 = Integer.toString(intNum2);
        System.out.println("intSrt2 = " + intSrt2);
        String intSrt3 = String.valueOf(intNum2);
        System.out.println("intSrt3 = " + intSrt3);
        // estas son dos maneras de convertir primitovos a string tambine se puede hacer para double
        // byte, boolean etc la diferencia de cada uno es que se usan diferentes clases y que al usar valueOf
        // se usa las sobr carga de metodos ya que se convertira a string pero se usara diferente
        // metodo dependiendo lo que se agrege como parametrp


        int i = 10000;
        short s = (short) i; // (short) esto se llama cast y lo que hace es forzar la conversion de un int a un
        // short esto se debe hacer solo cuando un quiero convertirlo a un tamaño menor en este caso int es mayor a shor
        // pero no es necesario si se va convertir a uno mayor
        System.out.println("s = " + s);

        int i1 = 32769; // cuando se fuerza convertir un numero que no se soporta se da un numeor diferente al deseado
        short s1 = (short)i1;
        System.out.println("s1 = " + s1); //soutv para imprimir la ultima variable
        char cha = (char) i;
        System.out.println("cha = " + cha); //cuando se fuerza convertir un int a un chart lo que se consigue es que se muestre
        // el carracter corespodinte a ese codigo es decir 10000 corresponde en unicode a ✐ simpre y cuadno el codigo exista 
                
    }
}
