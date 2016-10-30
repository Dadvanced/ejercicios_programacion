/*
*
* @author David León Galisteo
* Ejercicio 14  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("\nVamos a calcular la potencia de un número a traveś de");
    System.out.println("los datos que introduzca usted");
    System.out.println("____________________________________ \n");
    System.out.print("Por favor, introduzca la base (entero positivo): ");
    
    Scanner s = new Scanner(System.in);
    int base = Integer.parseInt(s.nextLine());
    
    System.out.print("A continuación introduzca el exponente ");
    
    int expo = Integer.parseInt(s.nextLine());
    int repeticiones =0;
    
    do {
      base = base * base;
    } while (repeticiones == expo);
    
    System.out.println("\nEl resultado es: " + base);
    
  }
}
