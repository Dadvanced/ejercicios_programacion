/*
*
* @author David León Galisteo
* Ejercicio 10  - Tema 7.2
*
*/
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al 3 en raya.");
    System.out.println("_________________________________________________\n");
    
    int jugadas = 0;
    int fila;
    int columna;
    boolean jugador1 = true;
    boolean ganador = false;
    Scanner n = new Scanner(System.in);
    
    String[] ficha = new String[3];
    ficha[0] = " ";
    ficha[1] = "◉";
    ficha[2] = "✕";
    
    int[][] posicion = new int[3][3];      //guardaremos si la posición ya ha sido asignada
    String[][] tabla = new String[3][3];
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        tabla[i][j] = ficha[0]; //hacemos que todas las casillas del tableron sean espacios vacíos
      }
    }
    
    while (jugadas < 9) {
      //////////////////////dibuja el tablero de juego/////////////////777 
      for (int i = 0; i < 3; i++) {
        System.out.print(i + "|"); //pinta el número de la fila
        for (int j = 0; j < 3; j++) {
          if (j < 2) {
            System.out.print(tabla[i][j] + "|");
          } else {
            System.out.print(tabla[i][j]);
          }
        }
        System.out.println();
              
      }
      
      System.out.printf("  0 1 2");
    /////////////////////////////////////////////////////////////////////////77
    
      System.out.print("\nPor favor introduzca el número de fila: ");
      fila = Integer.parseInt(n.nextLine());
      
      System.out.print("\nPor favor introduzca el número de columna: ");
      columna = Integer.parseInt(n.nextLine());
      
      if (jugador1) { //la ficha seá una u otra dependiendo de al jugador que le toque
        tabla[fila][columna] = ficha[1];
        jugadas++;
      } else {
        tabla[fila][columna] = ficha[2];
        jugadas++;
      }
      
      if (jugador1) {
        jugador1 = false;
      } else {
        jugador1 = true;
      }
      
    } //while línea 34
      
      
      if (!ganador) {
        System.out.println("______________________________________");
        System.out.println("\n¡Vaya, habeis quedado en tablas!\n");
       //////////////////////dibuja el tablero de juego si nadie ha ganado/////////////////
        for (int i = 0; i < 3; i++) {
          System.out.print(i + "|"); //pinta el número de la fila
          for (int j = 0; j < 3; j++) {
            if (j < 2) {
              System.out.print(tabla[i][j] + "|");
            } else {
              System.out.print(tabla[i][j]);
            }
          }
          System.out.println();
                
        }
        System.out.printf("  0 1 2");
      } //if
      /////////////////////////////////////////////////////////////////////////////////////
  }
}
