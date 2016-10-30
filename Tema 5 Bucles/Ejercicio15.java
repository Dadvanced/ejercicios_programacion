/*
*
* @author David León Galisteo
* Ejercicio 15  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) { 
    System.out.println("\nComo no sé traducir lo que pide el ejercicio 15");
    System.out.println("usted introduzca la base de un número (real) y el exponente");
    System.out.println("que ya el programa hará el resto...");
    System.out.println("_________________________________________ \n");
    
    System.out.print("Introduzca la base (real): ");
    
    Scanner s = new Scanner(System.in);
    
    Double base = Double.parseDouble(s.nextLine()); //base
    
    System.out.print("\nAhora el exponente (entero positivo): ");
    
    int expo = Integer.parseInt(s.nextLine()); //exponente
    double potencia = 1;
    
    for (int i = 1; i <=expo; i++) {
      int exponente = 1;
      
      for (int j = 0; j <exponente; j++) {
        potencia *=base;
        
      }
      System.out.println("\n" + base + "^" + i + "=" + potencia);
      
    } //cierra el "for"
    
  }
}
