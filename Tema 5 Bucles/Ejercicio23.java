/*
* @author David León Galisteo
* Ejercicio 23  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args) { 
    System.out.println("\nIntroduce tantos números como quieras. Mientras no");
    System.out.println("supere los 10000 podrás seguir introduciendo números.");
    System.out.println("Cuando ésto ocurra, se mostrará el total acumulado, el contador");
    System.out.println("de los números introducidos y la media.");
    System.out.println("_________________________________________\n");
    
    Scanner n = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    
    int contador = 0;
    int totalAcumulado = 0;
    int numero = 0;
    
    do {
      numero = Integer.parseInt(n.nextLine());
      contador++;
      totalAcumulado += numero;
    } while (numero < 10000);
   
   double media = totalAcumulado / contador;
   System.out.println("_________________________________________\n");
   System.out.println("\nEl total acumulado es: " + totalAcumulado);
   System.out.println("Has introducido un total de: " + contador + " números");
   System.out.println("La media es: " + media);
    
  }
}
