/*
*
* @author David León Galisteo
* Ejercicio 17  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("\nVamos a calcular la suma de los 100 números siguietnes");
    System.out.println("desde un número introducido por teclado.");
    System.out.println("__________________________________________ \n");
    
    Scanner n = new Scanner(System.in);
    
    int numero;
    
    do {
      System.out.print("\nIntroduzca un número positivo: ");
      numero = Integer.parseInt(n.nextLine());
      
      if (numero <0) {
        System.out.println("El número introducido no es positivo.");
        System.out.println("Por favor, vuelva a introducir un número positivo");
      }
      
    } while (numero < 0);
    
    int suma = 0;
    
    for (int i = numero; i < numero + 100; i++) {
      suma +=i;
    }
    
    System.out.println("\nLa suma de los 100 números siguientes a " + numero + " es " + suma);
    
  }
}
