package arreglos;

import java.util.Scanner;

public class BuscarInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int[] arreglo1 = new int[4];
         int length =  arreglo1.length;
         for (int i =0; i<length;i++){
             System.out.print("Ingrese un numero: ");
             arreglo1[i]= scanner.nextInt();
         }
        System.out.println(""" 
               ========================================================================
                \s""");
        System.out.print("\r\n ingrese un numero que desea saber su posición: " );
        int num = scanner.nextInt();

        int i =0;
       /* while (i<length && arreglo1[i]!= num){
            i++;
        }*/


        //lo que se hace es que se recorra el arreglo hasta que llege a su fin o hasta que la posicion del arreglo que
        //se esta iterando coincida con el numero buscado  no puede ser == la condicion ya que se esta diciendo
        //que el bulce continue mientras los numeros iterados del arreglo sen iguales lo cual solo pasaria si
        //el primer numero es igual pero cuando no sea igual se sale lo cual no permite en contrar el objeto


        for (i=0; i<length &&arreglo1[i]!=num;i++){}

        /*funcion igual que el while con la diferencia que noy ha que poner un ++ donde del cuerpo del bulce
        el porqué no se hay un error cuando es el ultimo objeto que se esta buscando es por
        el numero con el pos incremeto entonces va sumado lo cual hae antes de entrar al bulce se cuestione
        la condicion o sea primero pregunta si son iguales o no en caso de que sean iguales sale pero si no son
        iguales sigue su rumbo entrando al bucle
        **/
        System.out.println("""
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-
                _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                \s""");

        if (i==4){ // si es 10 es porque llego hasta el fin del arreglo lo cual siginifica que no es ya que el
            //arreglo tiene solo 9 indices
            System.out.println("El número no esta en el arreglo");
        }else{ // y si no es 10 es porque para ya uqe encontro el objeto
            System.out.printf("el numero %s se encontró en la posición %s", num, i);
        }
    }
    

}
