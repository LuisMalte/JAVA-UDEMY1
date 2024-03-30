package claseMath;

public class ejmRandom {
    public static void main(String[] args) {


        double numRandom = Math.random(); //dara numeros ramdos entre 0 a 0.99 ya que no puede llegar a uno esto a que
       //  y siempre da un valor tipo dauble
        System.out.println("numRandom = " + numRandom);
       /* do{
            numRandom = Math.random();
            System.out.println("numRandom = " + numRandom);
        }while (numRandom!=1);

*/
        numRandom = Math.random()*7;/*si se decea cambiar el rango se hace una multiplicacion  por el numero que queira por solo
       nunca el numero sera porque se esta multiplicando se multiplica porque los nuemeros que se dan son del 0 a 0.99
       entonces al multiplicarlo por pues da valores mas grandes pero nunca 7 por que nunca el numero llega a ser 1 para multiplicarlo por 7*/
        System.out.println("numRandom = " + numRandom);
        /*do{
            numRandom = Math.random()*7;
            System.out.println("numRandom = " + numRandom);
        }while (numRandom!=7);
*/

     String[] colores ={"rojo","negro","amarillo","verde", "naranja"};

     numRandom= Math.random()*colores.length;// colores.length es 5 porque no empiza desde la posicion 0 por ende
        // no hay que cambiar nada se puede dejar como esta porque el maximo valor que puede llegar a ser random puede
         // 4
        System.out.println("color = " + colores[(int) numRandom]); // se pone (int) porque randomnum puede dar valores
        //tipo double entonces hay que hacer cast para que solo de tipo int
    }
}
