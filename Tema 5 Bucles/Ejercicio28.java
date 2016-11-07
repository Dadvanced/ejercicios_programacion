/*
* @author David León Galisteo
* Ejercicio 28  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio28 {
  public static void main(String[] args) {
    System.out.println("\nVamos a calcular el factorial de un número introducido por teclado");
    System.out.println("________________________________________________-\n");
    
    Scanner n = new Scanner(System.in);
    
    boolean numeroCorrecto = true;
    
    int factorial = 1;
    int numero;
    
    do { //comprueba si el número introducido es un entero positivo.
      System.out.println("Por favor, introduce el número positivo entero: ");
      numero = Integer.parseInt(n.nextLine());
      
      if (numero > 0) {
        numeroCorrecto = true;
      } else {
        numeroCorrecto = false;
        System.out.println("Ése número no es correcto");
      }
      
    } while (!numeroCorrecto);
    
    
    
    for (int i = 1; i <= numero; i++) { //realiza el factorial
      factorial *= i;
    }
    System.out.println("\nEl resultado es: " + factorial);
    
  }
}
