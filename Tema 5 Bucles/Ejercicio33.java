/*
*
* @author David León Galisteo
* Ejercicio 33  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio33 {
  public static void main(String[] args) {
    System.out.println("\nVamos a dibujar la letra \"U\" con una altura");
    System.out.println("introducida por usted.");
    System.out.println("_______________________________________________ \n");
    
    Scanner n = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la altura: ");
    int alturaIntroducida = Integer.parseInt(n.nextLine());
    
    int espacios = alturaIntroducida - 2; //espacios internos
    int altura = 1; //llevará la cuenta de la altura de la "U"
    
    do { //dibujará el cuerpo de la "("
      System.out.print("*");
      
      for (int i = 0; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      System.out.print("*");
      System.out.println();
      
      altura++;
    } while (altura < alturaIntroducida);
    
    
      System.out.print(" ");
      
      for (int i = 0; i <= espacios; i++) {
        System.out.print("*");
      }
      
      System.out.print(" ");
  }
}
