/*
*
* @author David León Galisteo
* Ejercicio 22  - Tema 6
*
*/
import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("Vamos a dibujar una serpiente desde una altura");
    System.out.println("introducida por teclado.");
    System.out.println("__________________________________________");
    System.out.print("Por favor, introduzca la altura: ");
    
    Scanner n = new Scanner(System.in);
    int alturaIntroducida = Integer.parseInt(n.nextLine());
    
    int espacios = 12; //espacios donde se empezará a dibujar la serpiente
    int posicionAleatoria = 0; //determina la posición de los asteríscos
    int altura = 1; //controla la altura actual de la serpiente
    int i = 0; //itinerante
    
    for (i = 1; i <= espacios; i++) { //inserta la primera línea de espacios
      System.out.print(" ");
    }
    
    System.out.println("@"); //inserta la cabeza de la serpiente
    
    ////////////////////cuerpo de la serpiente
    
    do {
      posicionAleatoria = (int)(Math.random()*3);
      switch (posicionAleatoria) { //determina si el asterísco irá antes, después o en la misma línea que el anterior
        case 0:
        break;
        
        case 1:
        espacios -=1;
        break;
        
        case 2:
        espacios +=1;
        break;
        
        default:
      }
      
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      System.out.print("*");
      
      System.out.println();
      altura++;
      
    } while (altura < alturaIntroducida);
    
  }
}  
