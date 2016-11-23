/*
*
* @author David León Galisteo
* Ejercicio 17  - Tema 6
*
*/
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) { 
    System.out.println("Vamos a realizar una pecera con un pececito desde");
    System.out.println("una altura y anchura introducida por el usuario.");
    System.out.println("_____________________________________________");
    System.out.print("\nPor favor, introduzca la altura (mínimo 4): ");
    
    Scanner n = new Scanner(System.in);
    int alturaIntroducida = Integer.parseInt(n.nextLine());
    
    System.out.print("\nPor favor, introduce la anchura (mínimo 4): ");
    int anchura = Integer.parseInt(n.nextLine());
    
    int area = (alturaIntroducida - 2) * (anchura - 2); //averiguamos el área de la pecera
    int posicionPez = (int)(Math.random()*area) + 1;
    int contador = 1; // cuando el contador sea igual al área, dibujaremos al pececito 
    
    for (int i = 1; i < alturaIntroducida; i++) {
      
      if (i == 1) {
          for (int j = 1; j <= anchura; j++) { //dibuja la parte superior de la pecera
          System.out.print("*");
        } //for
        System.out.println(); //salto de línea
      }
        
            
      System.out.print("*"); //dibuja el primer asterísco
      
      for (int f = 1; f <= anchura - 2; f++) { //inserta los espacios internos
        if (contador++ == posicionPez) {
          System.out.print("&");
          } else {
            System.out.print(" ");
          }
      }
      
      System.out.print("*"); //inserta el último asterísco de la pecera
      System.out.println();
    } //for deja de pintar la pecera
    
    for (int i = 1; i <= anchura; i++) {
      System.out.print("*");
    }
  }
}
