/*
*
* @author David León Galisteo
* Ejercicio 2  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("Vamos a definir un Array con símbolos y posteriormente");
    System.out.println("mostraremos sus distintos valores.");
    System.out.println("________________________________________________");
    
    String[] simbolo = new String[10];
    
    simbolo[0] = "a";
    simbolo[1] = "x";
    simbolo[4] = "@";
    simbolo[6] = " ";
    simbolo[7] = "+";
    simbolo[8] = "Q";
    
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4s ", simbolo[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
  }
}
