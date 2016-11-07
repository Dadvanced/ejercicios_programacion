/*
* @author David León Galisteo
* Ejercicio 24  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("\nA través de un número n que introduzca usted por teclado");
    System.out.println("vamos a dibujar una pirámide de números con n filas");
    System.out.println("______________________________________________\n");
    
    Scanner n = new Scanner(System.in);
    
    System.out.println("\nIntroduzca el número: ");
    
    int alturaIntroducida = Integer.parseInt(n.nextLine());
    
    int espacios;
    espacios = alturaIntroducida - 1;
    int altura = 1; 
    int i = 0;
    
    while (altura <= alturaIntroducida) {
      
      //inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      //pinta la línea de números
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      altura++;
      espacios--;
      
    } //while
  }
}
