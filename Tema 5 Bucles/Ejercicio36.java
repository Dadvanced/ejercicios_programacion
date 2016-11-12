/*
*
* @author David León Galisteo
* Ejercicio 36  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio36 {
  public static void main(String[] args) {
    System.out.println("\nVamos a mostrar si un número (entero positivo) introducido por teclado");
    System.out.println("es o no capicúa (sin importar longitud del mismo).");
    System.out.println("______________________________________________\n");
    System.out.println("Por favor, introduzca un número: ");
    
    Scanner n = new Scanner(System.in);
    long numeroIntroducido = Long.parseLong(n.nextLine());
    
    long numeroIntroducido2 = numeroIntroducido; //guardamos el valor original del número introducido.
    long volteado = 0; 
    
    while (numeroIntroducido > 0) { //damos la vuelta al número
      volteado = (volteado * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
      }
    
    if (numeroIntroducido2 == volteado) {
      System.out.println("\nEl " + numeroIntroducido2 + " es capicúa.");
    } else {
      System.out.println("\nEl " + numeroIntroducido2 + " NO es capicúa.");
    }
    
  }
}
