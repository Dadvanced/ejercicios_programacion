/*
*
* @author David León Galisteo
* Ejercicio 40  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio40 {
  public static void main(String[] args) {
    System.out.println("Vamos a pintar un rombo a partir de un número (altura) introducido");
    System.out.println("por teclado (siendo impar y mayor o igual a 3)");
    System.out.println("_______________________________________________\n");
    
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
    
    System.out.println();
    
    int espaciosInternos = 1;
    int espaciosExternos = (alturaIntroducida / 2) + 1;
    int altura = 1;
    
    while ((altura <= (alturaIntroducida / 2) + 1)) { //parte de arriba del rombo
    
      for (int i = 1; i < espaciosExternos; i++) { //empieza insertando espacios
        System.out.print(" ");
      }
      
      System.out.print("*"); //inserta el primer asterísco
      
      if (altura > 1) {
        for (int i = 1; i <= espaciosInternos; i++) { //inserta espacios internos
          System.out.print(" ");
        }
        System.out.print("*");
      }
      
      System.out.println();
      
      if (altura > 1) { //comprueba si debe incrementar el número de espacios
        espaciosInternos +=2;
      }
      
      altura++;
      espaciosExternos--;
    } //while 
    
    ///////////////////parte inferior del rombo ///////
    
    espaciosExternos = 1;
    espaciosInternos = espaciosInternos - 2;
    altura = 1;
    
    while (altura < (alturaIntroducida / 2) +1) {
      
      for (int i = 1; i <= espaciosExternos; i++) {
        System.out.print(" ");
      }
      
      System.out.print("*");
      
      for (int i = 2; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (espaciosInternos > 1) {
        System.out.print("*");
      }
      
      System.out.println();
      
      altura++;
      espaciosExternos++;
      espaciosInternos -=2;
    } //while
    
  }
}
