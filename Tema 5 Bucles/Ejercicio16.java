/*
*
* @author David León Galisteo
* Ejercicio 16  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("\nVamos a averiguar si el número introducido por usted");
    System.out.println("es o no primo (divisible entre el 1 y sí mismo)");
    System.out.println("______________________________________________ \n");
    
    Scanner n = new Scanner(System.in);
    
    int numero = Integer.parseInt(n.nextLine());
    
    boolean primo = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        primo = false;
      }
    }
    
    if (primo) {
      System.out.println("\nEl número " + numero + " es primo");
    } else {
      System.out.println("\nEl número " + numero + " NO es primo");
      
    } //cierra el "else"
  }
}
