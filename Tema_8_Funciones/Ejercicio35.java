/**
* Ejercicio 35
* Tema 8
*
* @author David León Galisteo
*/

import java.util.Scanner;
import matematicas.FuncionesMatematicas;

public class Ejercicio35 {
  public static void main(String[] args) {
    System.out.println("Vamos a convertir un número entero positivo al sistema de palotes.");
    System.out.println("_________________________________________________________________");
    System.out.print("\nPor favor, introduce un número entero positivo: ");
    
    Scanner n = new Scanner(System.in);
    
    int numero = Integer.parseInt(n.nextLine());
    
    System.out.println(convierteEnPalotes(numero));
    
  }
  
  
  
  
  /**
  * Devuelve una cantidad de palitos basado en el número entero que se introduce como parámetro
  * @param n es el número que el usuario introduce en el código principal
  * return palitos es la variable donde se guardan lo palitos.
  **/
  
  
  public static String convierteEnPalotes(int n) {
    int volteado = FuncionesMatematicas.voltea(n);
    int digitos = FuncionesMatematicas.digitos(n);
    int numeroARestar = 0; //con esta variable contaremos el número de palitos según el número
    String palitos = "";
    
    while (digitos > 0) {
      numeroARestar = volteado % 10;
      while (numeroARestar > 0) {
        palitos += "|";
        numeroARestar--;
      }
      palitos += "-";
      digitos--;
      volteado /= 10;
    }
    
    return palitos;
  }
}
