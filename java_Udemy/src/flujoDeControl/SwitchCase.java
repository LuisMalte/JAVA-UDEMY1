package flujoDeControl;

import java.util.Scanner;

public class SwitchCase {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("digite un numero: ");
          byte num = Byte.parseByte( scanner.next());
            switch (num){

                case 0:
                    System.out.println("escogiste el numero 0 " );
                    break;
                case 1:
                    System.out.println("escogiste el numero uno " );
                    break;
                case 2:
                    System.out.println("escogiste el numero dos " );
                    break;
                case 3:
                    System.out.println("escogiste el numero 0 " );
                    break;
                default:
                    System.out.println("No escogiste ningún numero de la lista ");
            }

            //switch funciona como un if y acepta diferentes cosas para ponerlo como parametro puede ir un string un char, y elementos de una calse enum
            // se debe poner siempre un break en cada caso ya que en caso de que no ponerlo entrara a la condiciones siguientes incluso si nos las cumple y ejecutara
            //lo que haya adentro en los siguietes


            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n" + "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +"\n ");
            System.out.print("Ingrese el año : ");
            int ano = Integer.parseInt( scanner.next());

            System.out.print("Ingrese el mes que desea saber cuantos dias tiene : ");
            byte mes = Byte.parseByte( scanner.next());
            int dias = 0;
            switch (mes){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dias =31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dias =30;
                    break;
                case 2:
                    if (ano%400==0  || ((ano%4 == 0) && !(ano%100==0))){
                        dias= 29;
                    }else{
                        dias=28;
                    }
                    break;
                default:
                    System.out.println("ingrese un numero valido");

            }

            System.out.println("los dias del mes ".concat( Integer.toString(mes)).concat(" del año ".concat(Integer.toString(ano)))+ " son " + dias);





        }
    }


