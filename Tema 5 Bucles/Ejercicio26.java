/*
* @author David León Galisteo
* Ejercicio 26  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio26 {
  public static void main(String[] args) {
    System.out.println("\nVoy a dar la posición de un dígito dentro de un número");
    System.out.println("que previamente haya usted introducido (por ejemplo 143657).");
    System.out.println("____________________________________________\n");
    System.out.print("\nIntroduce el número, por favor: ");
    
    Scanner n = new Scanner(System.in);
    int numero = Integer.parseInt(n.nextLine());
    
    System.out.print("\nA continuación el dígito que desee (localizado en ese número): ");
    int digito = Integer.parseInt(n.nextLine());
    int posicion = 0;
    int a;
    int volteado = 0;
        
     while (numero > 0) {  //damos la vuelta al número
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      
    } 
    
    
    do { 
      a = volteado / 10;
      posicion++;
      if (a == digito) {
        System.out.println("\nLa posición del dígito " + digito + " es " + posicion);
      } else {
      }
           
      volteado = volteado / 10;
    } while (volteado >= 0);
    
  }
}
