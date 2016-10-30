/*
*
* @author David León Galisteo
* Ejercicio 18  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("\nVamos a mostrar los números enteros comprendidos");
    System.out.println("entre dos números que usted introduzca.");
    System.out.println("\nRecuerde que los números no sean iguales");
    System.out.println("__________________________________________ \n");
    
    Scanner n = new Scanner(System.in);
    
    boolean numDiferente = true;
    int a;
    int b;
    
    do {
      System.out.print("\nIntroduzca el primer número: ");
      a = Integer.parseInt(n.nextLine());
      
      System.out.print("\nIntroduzca ahora el segundo número: ");
      b = Integer.parseInt(n.nextLine());
      
      if (a == b) {
        System.out.println("\nRecuerde introducir 2 números DIFERENTES.");
        numDiferente = false;
      } else {
        numDiferente = true;
      } //cierra el "else"
    } while (!numDiferente);
    
    
    System.out.println("\nLos números comprendidos entre " + a + " y " + b + " son ");
    
    
    if (a < b) {
      for (int i = a; i <=b; i +=7) {
         System.out.print(" " +  i);
       }
     } else {
       for (int i = b; i <=a; i +=7) {
         System.out.print(" " + i);
       } //cierra el "for"
       
     } //ciera el "else"
   }
 } 
