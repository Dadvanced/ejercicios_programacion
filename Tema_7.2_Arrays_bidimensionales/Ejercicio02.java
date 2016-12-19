/*
*
* @author David León Galisteo
* Ejercicio 02  - Tema 7.2
*
*/
import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Introduzca 20 números enteros para mostrar las sumas de todos ellos");
    System.out.println("como si de una hoja de cálculo se tratase.");
    System.out.println("_________________________________________________________________________");
    System.out.println("\nIntroduzca 20 números enteros separados por un INTRO:");
    
    int[][] num = new int[4][5];
    int fila = 0;
    int columna = 0;
    int sumaFila = 0;
    int filaTotal = 0;
    int columnaTotal = 0;
    int sumaColumna = 0;
    Scanner n = new Scanner(System.in);
    
    for (fila = 0; fila < 4; fila++) { //introduce los números mientras lleva la cuenta del array
      for (columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        num[fila][columna] = Integer.parseInt(n.nextLine());
      }
    }
    System.out.println(); //salto de línea
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      
      System.out.printf("|%7d   ", sumaFila);
      filaTotal += sumaFila;
      sumaFila = 0;
      System.out.println();
    }
    
    System.out.println("_________________________________________________________________");
    
    for (columna = 0; columna < 5; columna++) {
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }
      
      System.out.printf("%7d   ", sumaColumna);
      columnaTotal += sumaColumna;
      sumaColumna = 0;
    }//for 
    
    System.out.printf("|%7d   ", (columnaTotal + filaTotal));
    
  }
}
