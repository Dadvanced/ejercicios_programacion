/*
*
* @author David León Galisteo
* Ejercicio 32  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio32 {
  public static void main(String[] args) {
    System.out.println("\nVamos a realizar la suma de los dígitos pares de");
    System.out.println("un número entero introducido por teclado.");
    System.out.println("_____________________________________________\n");
    System.out.print("Introduce el número entero: ");
    
    Scanner n = new Scanner(System.in);
    long numeroIntroducido = Long.parseLong(n.nextLine()); //El usuario introduce el número
    
    System.out.print("\nLos números pares son: ");
    
    long volteado = 0;
    while (numeroIntroducido > 0) {  //damos la vuelta al número
      volteado = (volteado * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    
    int suma = 0;
    
    do {
      int cuenta = (int)volteado % 10;
      
      if (cuenta % 2 == 0) {
        System.out.print(cuenta + " ");
        suma += cuenta;
      }
      
      volteado /= 10;
      
    } while (volteado > 0);
    
    System.out.println("\nLa suma de los números pares es: " + suma);
    
  }
}
