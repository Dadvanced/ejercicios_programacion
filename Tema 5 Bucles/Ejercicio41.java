/*
*
* @author David León Galisteo
* Ejercicio 41  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio41 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar cuántos dígitos pares y cuántos impares");
    System.out.println("hay en un número introducido por teclado.");
    System.out.println("___________________________________________\n");
    System.out.print("Por favor, introduzca el número: ");
    
    Scanner n = new Scanner(System.in);
    long numeroIntroducido = Long.parseLong(n.nextLine());
    long numero = numeroIntroducido;
    
    int numeroPar = 0;
    int numeroImpar = 0;
    long cuenta = 0; //lleva la cuenta del numero introducido
    
    do {
      cuenta = numeroIntroducido % 10;
      
      if (numeroIntroducido % 2 == 0) {
        numeroPar++;
      } else {
        numeroImpar++;
      }
      numeroIntroducido /= 10;
    } while (numeroIntroducido > 0);
    
    
    System.out.println("\nEl número " + numero + " tiene " + numeroPar + " dígitos pares y " + numeroImpar + " digitos impares.");
    
  }
}
