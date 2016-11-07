/*
* @author David León Galisteo
* Ejercicio 27  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio27 {
  public static void main(String[] args) { 
    System.out.println("\nSe va a mostrar, contar y sumar los múltiplos de 3");
    System.out.println("que hay entre 1 y un número leído por teclado.");
    System.out.println("___________________________________________ \n");
    System.out.print("\nIntroduce el número (entero): ");
    
    Scanner n = new Scanner(System.in);
    
    int numero = Integer.parseInt(n.nextLine());
    int i = 0;
    int contador = 0;
    int suma = 0;
    
    System.out.println();
    
    while (i <= numero) { //muestra los números
      if ((i % 3) == 0) {
        System.out.println(i);
        contador++;
        suma += i;
      }
      i++;
    } //while
    
    System.out.println("_______________________________________\n");
    System.out.println("\nLa cantidad de números múltiplos de 3 que hay entre el 1");
    System.out.println("y el número introducido es: " + contador);
    System.out.println("Y la suma de los números da como resultado: " + suma);
    
  }
}
