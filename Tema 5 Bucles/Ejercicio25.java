/*
* @author David León Galisteo
* Ejercicio 25  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    System.out.println("\nIntroduce un número por teclado, mostraremos ese número alrevés.");
    System.out.println("El número puede contener varias cifras");
    System.out.println("______________________________________________ \n");
    System.out.print("\nNúmero (entero): ");
    
    Scanner n = new Scanner(System.in);
    
    int numero = Integer.parseInt(n.nextLine());
    
    do {
      int a = numero % 10;
      System.out.print(a +"");
      numero = numero / 10;
    } while (numero > 0);
  }
}
      
