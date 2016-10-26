/*
*
* @author David León Galisteo
*
* Ejercicio 10 tema 5 - bucles
*
*/
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("\nVamos a realizar la media de un conjunto de números que introduzca usted.");
    System.out.println("Puede introducir tantos número como desee pero, cuando quiera dejar de");
    System.out.println("introducir números, introduzca un número negativo.");
    System.out.println("___________________________________________ \n");
    
    Scanner s = new Scanner(System.in);
    int contador = 0; // llevará la cuenta de la CANTIDAD de números introducidos
    int cuenta = 0; //llevará la suma de los números introducidos
    int numero = 0; //El número que introducirá el usuario
    
    do {
      System.out.print("\nIntroduzca un número: ");
      numero = Integer.parseInt(s.nextLine());
      if (numero >0) {
        cuenta +=numero;
      }
      contador ++;
    } while (numero >0);
    
    System.out.println("\nLa media de los números introducidos es: " + (cuenta / contador));
    
  }
}
