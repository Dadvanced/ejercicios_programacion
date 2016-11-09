/*
*
* @author David León Galisteo
* Ejercicio 31  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio31 {
  public static void main(String[] args) {
    System.out.println("\nVamos a dibujar una \"L\" en la cual usted introduce la altura.");
    System.out.print("Por favor, introduzca la altura: ");
    
    Scanner n = new Scanner(System.in);
    int alturaIntroducida = Integer.parseInt(n.nextLine()); //el usuario introduce la altura de la "L"
    
    for (int i = 1; i < alturaIntroducida; i++) { //pinta la altura de la "L"
      System.out.println("*");
    }
    
    int base = (alturaIntroducida / 2) + 1;
    
    for (int i = 1; i <= base; i++) { //pinta la base de la "L"
      System.out.print("*");
    }
    
  }
}
