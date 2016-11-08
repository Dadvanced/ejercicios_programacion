/*
*
* @author David León Galisteo
* Ejercicio 29  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio29 {
  public static void main(String[] args) {
    System.out.println("\nVamos a mostrar los números enteros positivos");
    System.out.println("menos a uno introducido por teclado y que no sean");
    System.out.println("divisibles por otro introducido tambien por teclado.");
    System.out.println("_____________________________________________ \n");
    
    Scanner n = new Scanner(System.in);
    
    System.out.print("\nIntroduce un número: ");
    int numeroIntroducido = Integer.parseInt(n.nextLine());
    
    System.out.println("\nIntroduce ahora el número por el cuál el número anterior NO");
    System.out.print("será divisible: ");
    int numeroNoDivisible = Integer.parseInt(n.nextLine());
    
    for (int i = 0; i < numeroIntroducido; i++) {
      if ((i % numeroNoDivisible) != 0) {
        System.out.print(i + " ");
      }
    }
    
  }
}
 
