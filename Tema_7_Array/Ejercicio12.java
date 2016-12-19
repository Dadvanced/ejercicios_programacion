/*
*
* @author David León Galisteo
* Ejercicio 12  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Va a usted a introducir 10 números por teclado para posteriormente");
    System.out.println("elegir un número inicial y un número final de ese mismo array y cambiar");
    System.out.println("las posiciones de ambos números corriendo los demás números del array");
    System.out.println("hacia la derecha.");
    System.out.println("________________________________________________________________________");
    System.out.print("Por favor, introduzca 10 números separados por un INTRO: ");
        
    Scanner n = new Scanner(System.in);
    int[] array = new int[10];
    int inicial = 0;
    int indiceFinal = 0;
    
    for (int i = 0; i < 10; i++) { //se introducen los 10 valores del array
      array[i] = Integer.parseInt(n.nextLine());
    }
    
    System.out.printf("\n                            ARRAY ORIGINAL                             ");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4s ", array[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    System.out.println();
    System.out.println("Ahora, escoja un índice inicial para cambiar su valor por el de un índice");
    System.out.println("final (el índice inicial debe ser menor al índice final).");
    
    do {
      System.out.println("\nIntroduzca el índice inicial: ");
      inicial = Integer.parseInt(n.nextLine());
      
      System.out.println("\nIntroduzca ahora el índice final: ");
      indicefinal = Integer.parseInt(n.nextLine());
      
      if (inicial > indicefinal) {
        System.out.println("El indice inicial debe ser menor al índice final.");
      }
    } while (inicial > indiceFinal);
      
      
      
      while (inicial) {
        int aux = array[9];
      
        for (int i = 9; i > 0; i--) {
          array[final] = array[final + 1]; 
        }
      
        array[0] = aux;  
      }
      
    }
  }
}
