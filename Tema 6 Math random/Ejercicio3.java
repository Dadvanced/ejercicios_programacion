/*
*
* @author David León Galisteo
* Ejercicio 3  - Tema 6
*
*/
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) { 
    System.out.println("Vamos a mostrar al azar un carta de la baraja española.");
    System.out.println("Le daré la oportunidad de indicar cuántas cartas desea ver.");
    System.out.println("____________________________________________");
    System.out.print("Introduzca el número de cartas que desee ver: ");
    
    Scanner n = new Scanner(System.in);
    int i = Integer.parseInt(n.nextLine());
    
    int palo = 0;
    int carta = 0;
    int repeticiones = 1;
    String sPalo = " ";
    String sCarta = " ";
    
    do {
      carta = (int)(Math.random()*10) + 1;
      
      switch (carta) {
        case 1:
        sCarta = "As";
        break;
        
        case 8:
        sCarta = "Sota";
        break;
        
        case 9:
        sCarta = "Caballo";
        break;
        
        case 10:
        sCarta = "Rey";
        break;
        
        default:
        sCarta = String.valueOf(carta);
      }
           
      palo = (int)(Math.random()*4) + 1;
      
      switch (palo) {
        case 1:
        sPalo = "bastos";
        break;
        
        case 2:
        sPalo = "espadas";
        break;
        
        case 3:
        sPalo = "copas";
        break;
        
        case 4:
        sPalo = "oros";
        break;
        
        default:
      }
      
      System.out.println("\nPulse INTRO para sacar una carta:");
      System.console().readLine();
      System.out.println("La carta obtenida es el " + sCarta + " de " + sPalo);
           
      repeticiones ++;
    } while (repeticiones <= i);
    
  }
}
