package primitivosYStrings;

public class Primitivos {
    public static void main(String[] args) {

        byte byteNumber = 127 ;
        System.out.println("byteNumber = " + byteNumber);
        
        System.out.println("el tipo de byte corresponde en Bytes a: "+ Byte.BYTES );
        System.out.println("el tipo de byte corresponde en bits a: "+ Byte.SIZE );
        System.out.println("el numero máximo en tipo Byte es: "+ Byte.MAX_VALUE );
        System.out.println("el numero mínimo en tipo Byte es: "+ Byte.MIN_VALUE );

         short shortNumber  = 128;
        System.out.println("shortNumber = " + shortNumber);

        System.out.println("el tipo de short corresponde en Bytes a: "+ Short.BYTES );
        System.out.println("el tipo de short corresponde en bits a: "+ Short.SIZE );
        System.out.println("el numero máximo en tipo short es: "+ Short.MAX_VALUE );
        System.out.println("el numero mínimo en tipo short es: "+ Short.MIN_VALUE );


        int intNumber  = -32769;
        System.out.println("intNumber = " + intNumber);

        System.out.println("el tipo de int corresponde en Bytes a: "+ Integer.BYTES );
        System.out.println("el tipo de int corresponde en bits a: "+ Integer.SIZE );
        System.out.println("el numero máximo en tipo int es: "+ Integer.MAX_VALUE );
        System.out.println("el numero mínimo en tipo int es: "+ Integer.MIN_VALUE );


        long longNumber  =2147483648L; //para una variable tipo long se debe agregar l o L es recomedable L
        System.out.println("longNumber = " + longNumber);

        System.out.println("el tipo de long corresponde en Bytes a: "+ Long.BYTES );
        System.out.println("el tipo de long corresponde en bits a: "+ Long.SIZE );
        System.out.println("el numero máximo en tipo long es: "+ Long.MAX_VALUE );
        System.out.println("el numero mínimo en tipo long es: "+ Long.MIN_VALUE );



        float floatNumber =  1.5e3F; //  es lo mismo que decir 1500
        float floatNumber2 =  1.5e-3F; //  es lo mismo que decir 0,0015 esto se puedo
        // ya que float guarda los valores como una notación científica

        System.out.println("floatNumber = " + floatNumber);
        System.out.println("floatNumber2 = " + floatNumber2);
        
        System.out.println("el tipo de float corresponde en Bytes a: "+ Float.BYTES );
        System.out.println("el tipo de float corresponde en bits a: "+ Float.SIZE );
        System.out.println("el numero máximo en tipo float es: "+ Float.MAX_VALUE );
        System.out.println("el numero mínimo en tipo float es: "+ Float.MIN_VALUE );
        
        
        double doubleNumber = 4.9E-324  ;
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("el tipo de double  corresponde en Bytes a: "+ Double.BYTES );
        System.out.println("el tipo de double corresponde en bits a: "+ Double.SIZE );
        System.out.println("el numero máximo en tipo double es: "+  Double.MAX_VALUE );
        System.out.println("el numero mínimo en tipo double es: "+ Double.MIN_VALUE );

    }

}
