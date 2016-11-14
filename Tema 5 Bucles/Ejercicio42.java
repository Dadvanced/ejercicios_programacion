/*
*
* @author David León Galisteo
* Ejercicio 42  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio42 {
  public static void main(String[] args) {
    System.out.println("Tras introducir un número entero positivo por teclado, vamos a");
    System.out.println("mostrar los cinco números siguientes y además si son o no primos.");
    System.out.println("________________________________________________\n");
    System.out.print("Por favor, introduzca el número: ");
    
    Scanner n = new Scanner(System.in);
    int numeroIntroducido = Integer.parseInt(n.nextLine());
    
    boolean primo = true;
    
   for (int i = 1; i <= 5; i++) {
   
     for (int j = 2; j < numeroIntroducido; j++) {
        if ((numeroIntroducido % j) == 0) {
          primo = false;
        }
      }
      
      if (primo) {
        System.out.println("\nEl número " + numeroIntroducido + " es primo");
      } else {
        System.out.println("\nEl número " + numeroIntroducido + " NO es primo");
        
      } //cierra el "else"
      primo = true;
      numeroIntroducido++;
    } //for
    
  }
}

