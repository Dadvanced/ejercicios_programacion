/*
*
* @author David León Galisteo
*
* Ejercicio 9 tema 5 - bucles
*
*/
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.println("\nVamos a mostrar la cantidad de dígitos que contiene");
    System.out.println("un número introducido por usted.");
    System.out.println("_______________________________________ \n");
    System.out.print("Por favor, introduzca el número: ");
    
    Scanner datos = new Scanner(System.in);
    
    int numero = Integer.parseInt(datos.nextLine());
    int contador = 0;
    
    while (numero >0) {
      numero = numero / 10;
      contador ++;
    }
    
    System.out.println("\nLa cantidad de dígitos del número introducido es");
    System.out.println("" + contador);
    
  }
}
