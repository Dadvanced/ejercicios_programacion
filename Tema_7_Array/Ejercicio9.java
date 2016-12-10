/*[100]
*
* @author David León Galisteo
* Ejercicio 9  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.println("Va a usted a introducir 8 números y posteriormente se mostrará por");
    System.out.println("pantalla junto a las palabras \"par\" o \"impar\".");
    System.out.println("___________________________________________________________________");
    
    Scanner n = new Scanner(System.in);
    int[] numero = new int[8];
    
    for (int i = 0; i < 8; i++) {
      System.out.print("\nIntroduce un número: ");
      numero[i] = Integer.parseInt(n.nextLine());
    }
    
    System.out.println();
    
    for (int i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " par.");
      } else {
        System.out.println(numero[i] + " impar.");
      }
    } //for
    
  }
}
