/*
*
* @author David León Galisteo
*
* Ejercicio 8 tema 5 - bucles
*
*/
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.println("\nVamos a mostrar la tabla de multiplicar de un número introducido por usted.");
    System.out.print("Por favor, introduzca el número: ");
    Scanner datos = new Scanner(System.in);
    
    int numero = Integer.parseInt(datos.nextLine());
        
    for (int i = 1; i <=10; i ++) {
      System.out.println("\n" + (i * numero));
    }
    
  }
} 
