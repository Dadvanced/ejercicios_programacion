/*
*
* @author David León Galisteo
* Ejercicio 37  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio37 {
  public static void main(String[] args) {
    System.out.println("\nVamos a realizar un conversor del sistema decimal al");
    System.out.println("sistema \"palotes\".");
    System.out.println("Para ello, deberá usted de introducir un número entero positivo.");
    System.out.println("______________________________________________\n");
    System.out.print("Por favor, introduzca un número: ");
    
    Scanner n = new Scanner(System.in);
    int numeroIntroducido = Integer.parseInt(n.nextLine());
    
    int numero = numeroIntroducido; //guardamos el valor original del número introducido
    int volteado = 0;
    while (numeroIntroducido > 0) {
      volteado = volteado * 10 + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    do {
      for (int i = 1; i <= (volteado % 10); i++) {
        System.out.print("|");
      }
      
      System.out.print(" - "); //inserta el "separador"
      volteado /= 10;
    } while (volteado > 0);
    
  }
}
