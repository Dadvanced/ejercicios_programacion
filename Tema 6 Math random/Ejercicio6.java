/*
*
* @author David León Galisteo
* Ejercicio 6  - Tema 6
*
*/
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) { 
    System.out.println("El programa va a pensar un número entre 0 y el 100.");
    System.out.println("El usuario deberá de intentar adivinar de qué número");
    System.out.println("se trata en tan sólo 5 oportunidades.");
    System.out.println("______________________________________________");
    System.out.println("Número de intentos: 5");
    
    int intentos = 5;
    Scanner n = new Scanner(System.in);
    int numero = (int)(Math.random()*100); //el programa piensa un número.
    int adivina = 101; //le damos un valor para inicializarlo pero que 
    //no esté dentro del rango de números en los que el programa pensará.
    boolean acertado = false;
    
    do {
      System.out.println("\nIntroduzca el número que estoy pensando: ");
      adivina = Integer.parseInt(n.nextLine());
      
      if (adivina == numero) {
        System.out.println("\n¡Enhorabuena! Has acertado, el número era: " + numero);
        acertado = true;
      } else if (adivina < numero) {
        System.out.println("\nIncorrecto, el número que he pensado es mayor.");
        intentos--;
      } else if (adivina > numero) {
        System.out.println("\nIncorrecto, el número que he pensado es menor.");
        intentos--;
      }
      System.out.println("\nNúmero de intentos " + intentos);
      System.out.println("______________________________________");
    } while (intentos > 0 && !acertado);
    
    
    if (!acertado) {
      System.out.println("\nLo siento, has agotado todos los intentos, el número");
      System.out.println("que estaba pensando es: " + numero);
    }
    
        
  }
}
