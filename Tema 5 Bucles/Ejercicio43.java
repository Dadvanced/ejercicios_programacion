/*
*
* @author David León Galisteo
* Ejercicio 43  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio43 {
  public static void main(String[] args) {
    System.out.println("Vamos a partir un número (previamente introducido por teclado) en 2 partes.");
    System.out.println("Deberá introducir el número por el cuál quiere que se parta el");
    System.out.println("número introducido.");
    System.out.println("Por ejemplo: el número introducido es 5234 y quiere que se parta por");
    System.out.println("el 2º dígito.");
    System.out.println("Los nuevos números serían 52 y 34.");
    System.out.println("_____________________________________________\n");
    System.out.print("Introduzca un número con al menos 2 dígitos: ");
    
    Scanner n = new Scanner(System.in);
    int numeroIntroducido = Integer.parseInt(n.nextLine());
    
    System.out.print("\nIntroduzca ahora el número por el cual partir al anterior ");
    int numeroAPartir = Integer.parseInt(n.nextLine());
    
    int numero = numeroIntroducido; //guardamos valor original del número introducido
    int volteado = 0;
    
    while (numeroIntroducido > 0) { //volteamos el número introducido
      volteado = volteado * 10 + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    
    System.out.print("\nLos números partidos son el ");
    
    for (int i = 1; i < numeroAPartir; i++) {
      System.out.print(volteado % 10);
      volteado /= 10;
    }
    
    System.out.print(" y el ");
    
    do {
      System.out.print(volteado % 10);
      volteado /= 10;
    } while (volteado > 0);
    
  }
}
