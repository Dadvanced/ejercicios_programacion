/*
*
* @author David León Galisteo
* Ejercicio 44  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio44 {
  public static void main(String[] args) { 
    System.out.println("En éste programa vamos a insertar un dígito dentro de");
    System.out.println("un número indicando su posición.");
    System.out.println("____________________________________________\n");
    System.out.print("Por favor, introduzca un número entero positivo :");
    
    Scanner n = new Scanner(System.in);
    long numeroIntroducido = Long.parseLong(n.nextLine());
    
    System.out.print("\nIntroduzca la posición donde quieres insertar el número: ");
    int posicion = Integer.parseInt(n.nextLine());
    
    System.out.print("\nIntroduzca el número que desee insertar: ");
    int digitoAInsertar = Integer.parseInt(n.nextLine());
    
    long volteado = 0;
    int contador = 0; //comprueba el número de dígitos del número introducido
    
    while (numeroIntroducido > 0) { //damos la vuelta al número introducido
      volteado = volteado * 10 + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
      contador++;
    }  
    
    System.out.println();
    System.out.print("El número resultante es: ");
    
    for (int i = 1; i < posicion; i++) {
      System.out.print(volteado % 10);
      volteado /= 10;
      contador--;
    }
    
    System.out.print(digitoAInsertar);
        
    do {
      System.out.print(volteado % 10);
      volteado /= 10;
      contador--;
    } while (contador > 0);
    
    
  }
}
