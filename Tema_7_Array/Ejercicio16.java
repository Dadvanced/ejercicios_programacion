/*
*
* @author David León Galisteo
* Ejercicio 16  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Se va a mostrar 20 números aleatorios comprendidos entre el 0 y el 400.");
    System.out.println("Usted deberá decidir si quiere que se muestren los múltiplos de 5 o 7.");
    System.out.println("________________________________________________________________________");
    
    int[] array = new int[20];
    Scanner n = new Scanner(System.in);
    
    for (int i = 0; i < 20; i++) {
      array[i] = (int)(Math.random()*401); //genera números aleatorios entre 0 y 400 (ambos incluídos)
      System.out.print(array[i] + " ");
    }
    
    System.out.println();
    System.out.println();
    System.out.println("¿Desea mostrar los múltiplos de 5 o de 7?");
    System.out.print("(pulse 1 para múltiplo de 5 o 2 para múltiplo de 7): ");
    int userChoice = Integer.parseInt(n.nextLine());
    
    if (userChoice == 1) {
      for (int i = 0; i < 20; i++) {
        if (array[i] % 5 == 0) {
          System.out.print("[" + array[i] + "]");
        } else {
          System.out.print(array[i] + " ");
        }
      } //forr para elección 1 (mínimo)
    } else if (userChoice == 2) {
      for (int i = 0; i < 20; i++) {
        if (array[i] % 7 == 0) {
          System.out.print("[" + array[i] + "]");
        } else {
          System.out.print(array[i] + " ");
        }
      }//for
    } //else if
  }
}
