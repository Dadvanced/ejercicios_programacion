/*
*
* @author David León Galisteo
* Ejercicio 3  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Va usted a introducir 10 números enteros (separados por un INTRO) y");
    System.out.println("posteriormente lo mostraremos por pantalla de forma inversa.");
    System.out.println("__________________________________________________________________");
    
    Scanner n = new Scanner(System.in);
    int[] num = new int[10];
    
    System.out.println("Por favor, introduzca 10 números separados por un INTRO: ");
    
    for (int i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(n.nextLine());
    }
    
    System.out.println("______________________________________________________________");
    System.out.println("Los números introducidos se mostrarán ahora en orden inverso.");
    System.out.println();
    
    for (int i = 9; i >= 0; i--) {
      System.out.println(num[i]);
    }    
    
    
  }
}
