/*[100]
*
* @author David León Galisteo
* Ejercicio 7  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Se va a generar 100 números aleatorios entre el 0 y el 20.");
    System.out.println("Luego, introducirá usted 2 valores y cambiaremos los números del primer");
    System.out.println("valor por los del segundo (y se mostrarán entre comillas).");
    System.out.println("\n____________________________________________________________");
        
    Scanner n = new Scanner(System.in);
    
    int[] numero = new int[100];
    
    for (int i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random()*21) + 1;
      System.out.print(numero[i] + " ");
    }
    System.out.println("\n____________________________________________________________");
    
    System.out.println("\nAhora introduce el número que desea cambiar: ");
    int numeroACambiar = Integer.parseInt(n.nextLine());
    
    System.out.println("\nY ahora el número nuevo por el cual se cambiará el anterior: ");
    int numeroNuevo = Integer.parseInt(n.nextLine());
    
    for (int i = 0; i < 100; i++) {
      if (numero[i] == numeroACambiar) {
        numero[i] = numeroNuevo;
      }
      
      System.out.print(numero[i] + " ");
    } //for
    
  }
}
