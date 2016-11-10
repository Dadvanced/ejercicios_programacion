/*
*
* @author David León Galisteo
* Ejercicio 35  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio35 {
  public static void main(String[] args) {
    System.out.println("\nVamos a dibujar una \"X\" con una altura introducida por teclado.");
    System.out.println("La altura deberá ser un número impar mayor o igual a 3.");
    System.out.println("______________________________________________\n");
    
    Scanner n = new Scanner(System.in);
    boolean esAlturaCorrecta = false;
    
    do { //comprueba que la altura introducida sea la correcta.
      System.out.println("\nPor favor, introduzca altura: ");
      int alturaIntroducida = Integer.parseInt(n.nextLine());
      
      if (alturaIntroducida < 3 || alturaIntroducida % 2 == 0) {
        System.out.println("\nNúmero incorrecto, por favor, vuelva a introducir el número.");
      } else {
        esAlturaCorrecta = true;
      }
      
    } while (!esAlturaCorrecta);
    
    int espacios = alturaIntroducida - 2;
    
    
    
  }
}
