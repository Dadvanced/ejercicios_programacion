/*
*
* @author David León Galisteo
* Ejercicio 01  - Tema 7.2
*
*/
import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Se va a definir un array de 3 filas y 6 columnas para posteriormente,");
    System.out.println("mostrarlo por pantalla en forma de tabla.");
    System.out.println("_______________________________________________________________________");
    
    int[][] num = new int[3][6];
    
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    int fila;
    int columna;

    System.out.print("       ");
    for(columna = 0; columna < 6; columna++) {
      System.out.print("   Columna " + columna);
    }
    for(fila = 0; fila < 3; fila++) {

      System.out.print("\nFila " + fila);
  
      for(columna = 0; columna < 6; columna++) {
        System.out.printf("%9d   ", num[fila][columna]);
        
      }   
    }
  }
}
