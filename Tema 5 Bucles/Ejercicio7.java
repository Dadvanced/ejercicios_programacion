/*
*
* @author David León Galisteo
*
* Ejercicio 7 tema 5 - bucles
*
*/
import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("\nBienvenido a la caja fuerte leónidus, la más segura del mundo.");
    System.out.println("Te doy 4 oportunidades para intentar abrirla.");
    System.out.println("_________________________________________ \n");
    
    Scanner codigo = new Scanner(System.in);
    int combinacion = 7895;
    int intentos = 0;
    boolean acertado = false;
    
    do {
      System.out.println("\nIntroduce el número secreto: "); 
      System.out.println("Número de intentos: " + intentos);
      int numero = Integer.parseInt(codigo.nextLine());
      if (numero == 7895) {
        System.out.println("\n¡Enhorabuena, has acertado!");
        acertado = true;
      } else {
        System.out.println("\nCódigo incorrecto, vuelve a intentarlo");
        intentos ++;
      }
    } while (intentos <4 && !acertado);
    
  }
}
