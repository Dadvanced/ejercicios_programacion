/*
*
* @author David León Galisteo
* Ejercicio 6  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Va usted a introducir 10 números enteros (separados por un INTRO) y");
    System.out.println("posteriormente lo mostraremos por pantalla junto al máximo y mínimo.");
    System.out.println("__________________________________________________________________");
    
    Scanner n = new Scanner(System.in);
    int[] num = new int[15];
    
        
    System.out.println("Por favor, introduzca 10 números separados por un INTRO: ");
    
    for (int i = 0; i < 15; i++) {
      num[i] = Integer.parseInt(n.nextLine());
      
    }
    
    System.out.println("______________________________________________________________");
    System.out.println("Array original:");
    System.out.println();
    
    for (int i = 0; i < 15; i++) {
      System.out.println("num[" + i + "]: " + num[i]);
    } //for
    
        
    System.out.println("__________________________________________________________________");
    System.out.println("Array modificada:");
    System.out.println();
    
    int aux = num[14]; //modificamos el valor del array manualmentee
    
    for (int i = 14; i > 1; i--) {
      num[i] = num[i - 1];
    }
    
    num[0] = aux;
    for (int i = 0; i < 15; i++) {
      System.out.println("num[" + i + "]: " + num[i]);
    }
    
  }
}
