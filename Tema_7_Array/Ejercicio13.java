/*
*
* @author David León Galisteo
* Ejercicio 13  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Se va a mostrar 100 números aleatorios comprendidos entre el 0 y el 500.");
    System.out.println("Usted deberá decidir si quiere que se muestre el número máximo o míniimo.");
    System.out.println("________________________________________________________________________");
    
    int[] array = new int[100];
    int minimo = 500;
    int maximo = 0;
    Scanner n = new Scanner(System.in);
    
    for (int i = 0; i < 100; i++) {
      array[i] = (int)(Math.random()*501); //genera números aleatorios entre 0 y 500 (ambos incluídos)
      System.out.print(array[i] + " ");
      
      if (array[i] < minimo) {
        minimo = array[i];
      } //if que cambia el valor al número mínimo
      
      if (array[i] > maximo) {
        maximo = array[i];
      } //if que cambia el valor al número máximo
    }
    
    System.out.println();
    System.out.println();
    System.out.println("¿Desea mostrar el valor mínimo o máximo?");
    System.out.print("(pulse 1 para mínimo o 2 para máximo): ");
    int userChoice = Integer.parseInt(n.nextLine());
    
    if (userChoice == 1) {
      for (int i = 0; i < 100; i++) {
        if (array[i] == minimo) {
          System.out.print("**" + array[i] + "**");
        } else {
          System.out.print(array[i] + " ");
        }
      } //forr para elección 1 (mínimo)
    } else if (userChoice == 2) {
      for (int i = 0; i < 100; i++) {
        if (array[i] == maximo) {
          System.out.print("**" + array[i] + "**");
        } else {
          System.out.print(array[i] + " ");
        }
      }//for
    } //else if
  }
}
