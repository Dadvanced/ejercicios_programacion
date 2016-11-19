/*
*
* @author David León Galisteo
* Ejercicio 8  - Tema 6
*
*/


public class Ejercicio8 {
  public static void main(String[] args) { 
    System.out.println("En éste programa vamos a mostrar 3 apuestas de la quiniela");
    System.out.println("en 3 columnas para los 14 partidos y el pleno al 15.");
    System.out.println("_______________________________________________");
    System.out.println("Pulse INTRO para mostrar las apuestas.");
    System.console().readLine();
    
    int resultadoPartido;
    int columnas = 3;
    
    for (int fila = 1; fila <= 15; fila++) { //controla las filas para las apuestas
      System.out.printf("%4d. |", fila);
      
      if (fila == 15) {
        columnas = 1;
      }
      
      for (int apuesta = 1; apuesta <= columnas; apuesta++) { //apuesta para cada columna
        resultadoPartido = (int)(Math.random()*6) + 1;
        
        switch (resultadoPartido) {
          case 1:
          case 2:
          case 3:
          System.out.print("1  |");
          break;
          
          case 4:
          case 5:
          System.out.print("  2|");
          break;
          
          case 6:
          System.out.print(" X |");
          break;
          
          default:
        }
      }//for
      System.out.println(); //salto de línea para acceder a la siguiente fila.
    } //for
    
  }
}
