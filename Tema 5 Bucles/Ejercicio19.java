/*
*
* @author David León Galisteo
* Ejercicio 19  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("\nVamos a dibujar una pirámide.");
    System.out.println("Usted deberá introducir la altura y el carácter");
    System.out.println("con el que desee que se dibuje la pirámide");
    System.out.println("_________________________________________ \n");
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca la altura de la pirámide, por favor.");
    System.out.print("Altura: ");
    int height = Integer.parseInt(s.nextLine());
    
    System.out.println("\nAhora introduzca el carácter con el que desee que");
    System.out.println("se dibuje la pirámide.");
    System.out.print("Carácter: ");
    
    String c = s.nextLine();
    int espacios;
    espacios = height - 1;
    int altura = 1;
    
    for (int j = 1; j <= height; j++) {
      
      
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      for (int i = 1; i < altura * 2; i++) {
        System.out.print(c);
      }
      
      System.out.println();
      
      altura ++;
      espacios--;
      
    }
    
  }
}
