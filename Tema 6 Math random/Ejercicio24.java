/*
*
* @author David León Galisteo
* Ejercicio 24  - Tema 6
*
*/
import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("Voy a elegir un dígito al azar desde un número");
    System.out.println("introducido por teclado (entero positivo).");
    System.out.println("__________________________________________");
    System.out.print("\nPôr favor, introduzca un número: ");
    
    Scanner n = new Scanner(System.in);
    
    int numero = Integer.parseInt(n.nextLine());
    int numCopia = numero; //guardamos el valor original del número
    int contador = 0; //lo usaremos para averiguar la longitud del número
    int posicion = 0; //ésta variable indicará la posición del dígito a escoger
    
    while (numero > 0) { //averiguamos la longitud del número
      numero /= 10;
      contador++;
    }
    
    posicion = (int)(Math.random()*contador) + 1;
    
    for (int i = 1; i < posicion; i++) {
      numCopia /= 10;
    }
    
    System.out.println("\n" + numCopia % 10);
    
  }
}
