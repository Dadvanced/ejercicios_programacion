/*
* @author David León Galisteo
* Ejercicio 39  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio39 {
  public static void main(String[] args) {
    System.out.println("\nVamos a mostrar una serie de números y su factorial");
    System.out.println("a partir de un número (entero positivo) introducido por teclado.");
    System.out.println("_____________________________________________");
    
    System.out.print("\nPor favor, introduzca un número: ");
    Scanner n = new Scanner(System.in);
    int numero = Integer.parseInt(n.nextLine());
    
    int factorial = 1;
    
    
    for (int i = 1; i <= numero; i++) { //realiza el factorial
      factorial *= i;
      System.out.println(factorial);
    }
    
  }
}
