/*
*
* @author David León Galisteo
* Ejercicio 11  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Va usted a introducir 10 números por teclado y posteriormente vamos");
    System.out.println("a pasar los números primos a las primeras posiciones.");
    System.out.println("________________________________________________");
    System.out.print("Por favor, introduzca 10 números separados por un INTRO: ");
    
    Scanner n = new Scanner(System.in);
    
    int[] array1 = new int[10];
    
    for (int i = 0; i < 10; i++) {
      array1[i] = Integer.parseInt(n.nextLine());
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
      System.out.printf("│%4s ", array1[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
     
     int[] array2 = new int[10];
     int leftPlace = 0;
     int rightPlace = 9;
     boolean esPrimo = true;
     
     for (int i = 0; i < 10; i++) { //éste for ordenará los números
       
       for (int j = 2; j < array1[i]; j++) { //comprueba que los números del array sean primos o no.
         if (array1[i] % j == 0) {
           esPrimo = false;
         }
       } 
       
      if (esPrimo) {
        array2[leftPlace] = array1[i];
        leftPlace++;
      } else {
        array2[rightPlace] = array1[i];
        rightPlace--;
      } //if
      
      esPrimo = true;
      
    } //for
    
    System.out.println(); //salto de línea
    
    
    System.out.printf("\n                            ARRAY ORDENADA                             ");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4s ", array2[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
  }
}
