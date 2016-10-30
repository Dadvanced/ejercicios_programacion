/*
*
* @author David León Galisteo
* Ejercicio 12  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) { 
    System.out.println("\nVamos a mostrar los primeros términos de la serie Fibonacci.");
    System.out.println("La serie empieza por 0 y el siguiente es 1. La serie sigue");
    System.out.println("con la suma de los 2 números anteriores.");
    System.out.println("_______________________________________ \n");
    System.out.println("\nIntroduzca el número que indica cuántos términos quiere que se muestre");
    System.out.print("Número: ");
    
    Scanner s = new Scanner(System.in);
    
    int numero = Integer.parseInt(s.nextLine());
    
    int contador = 0;
     int a = 0; //primer número de la serie Fibonacci
     int b = 1; //segundo número de la serie Fibonacci
     int AUX;
     
     System.out.print("" + a);
     
    do {
      System.out.print(" " + b);
      AUX = a;
      a = b; //cambiando valores
      b = AUX + b;
      contador++;
    } while (contador <=numero);
  }
}
