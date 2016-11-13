/*
*
* @author David León Galisteo
* Ejercicio 38  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio38 {
  public static void main(String[] args) {
    System.out.println("\nVamos a dibujar un reloj de arena desde una altura introducida por teclado.");
    System.out.println("La altura deberá ser un número impar mayor o igual a 3.");
    System.out.println("______________________________________________\n");
    
    Scanner n = new Scanner(System.in);
    boolean esAlturaCorrecta = false;
    int alturaIntroducida = 0;
    
    do { //comprueba que la altura introducida sea la correcta.
      System.out.println("\nPor favor, introduzca altura: ");
      alturaIntroducida = Integer.parseInt(n.nextLine());
      
      if (alturaIntroducida < 3 || alturaIntroducida % 2 == 0) {
        System.out.println("\nNúmero incorrecto, por favor, vuelva a introducir el número.");
      } else {
        esAlturaCorrecta = true;
      }
      
    } while (!esAlturaCorrecta);
    
    int espacios = (alturaIntroducida / 2) + 1;
    int altura = 1;
    int relleno = alturaIntroducida - 1;
    
    ////////////////////////////////////////////////////
    
    while (altura < (alturaIntroducida / 2) + 1) {
      
      for (int i = 1; i < altura; i++) { //inserta espacios ANTES del primer asterísco aprovechando la variable de ALTURA
      System.out.print(" ");
    }
    
    System.out.print("*"); //pinta el primer asterísco
      
      for (int i = 1; i < relleno; i++) {  //inserta asteríscos internos
        System.out.print("*");
      }
      
      System.out.print("*");
             
      
      System.out.println();
      
      altura++;
      espacios--;
      relleno -= 2;
    }
    
    
    ////////////////////// parte de abajo/////////////////
    
    relleno = 0;
    espacios = alturaIntroducida / 2;
    altura = 1;
    
    while (altura <= (alturaIntroducida / 2) + 1) {
      
      //inserta espacios delante
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      
      System.out.print("*");
      for (int i = 1; i < relleno; i++) {
        System.out.print("*");
      }
      
      if (altura > 1) {
        System.out.print("*");
      }
      
      System.out.println();
      altura++;
      espacios--;
      relleno +=2;
    } //while
    
    
  }
}
