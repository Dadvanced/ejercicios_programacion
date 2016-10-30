/*
*
* @author David León Galisteo
* Ejercicio 13  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("\nVamos a leer una lista de 10 números (introducidas");
    System.out.println("por usted) y determinaremos si son positivos o negativos");
    System.out.println("______________________________________________ \n");
    
    Scanner s = new Scanner(System.in);
    
    int positivo =0;
    int negativo =0;
    
    for (int i = 0; i <10; i++) {
      System.out.print("\nIntroduce un número: ");
      int numero = Integer.parseInt(s.nextLine());
      
      if (numero >0) {
        positivo++;
      } else {
        negativo++;
      }
    }
    
    System.out.println("______________________________________________\n");
    System.out.println("\nHas introducido " + positivo + " positivos y " + negativo + " negativos");
  }
}
