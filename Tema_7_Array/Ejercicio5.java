/*
*
* @author David León Galisteo
* Ejercicio 5  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Va usted a introducir 10 números enteros (separados por un INTRO) y");
    System.out.println("posteriormente lo mostraremos por pantalla junto al máximo y mínimo.");
    System.out.println("__________________________________________________________________");
    
    Scanner n = new Scanner(System.in);
    int[] num = new int[10];
    
    int numMax = Integer.MIN_VALUE;
    int numMin = Integer.MAX_VALUE;
    
    System.out.println("Por favor, introduzca 10 números separados por un INTRO: ");
    
    for (int i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(n.nextLine());
      
      if (num[i] > numMax) {
        numMax = num[i];
      } //if
      
      if (num[i] < numMin) {
        numMin = num[i];
      } //if
    }
    
    System.out.println("______________________________________________________________");
    System.out.println("ahora mostraremos los números introducidos junto al número máximo y mínimo.");
    System.out.println();
    
    for (int i = 0; i < 10; i++) {
      System.out.print(num[i]);
      
       if (num[i] == numMax) {
        System.out.print(" máximo");
      }
      
      if (num[i] == numMin) {
        System.out.print(" mínimo");
      }
      System.out.println();
    } //for    
    
    
  }
}
