/*
*
* @author David León Galisteo
* Ejercicio 06  - Tema 7.2
*
*/


public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Se va a generar un array con números aleatorios comprendidos entre el");
    System.out.println("0 y 100 para posteiormente indicar la posición del número máximo y");
    System.out.println("mínimo.");
    System.out.println("_____________________________________________________________________");
    
    int[][] array = new int[6][10];
    int numMax = Integer.MIN_VALUE;
    int numMin = Integer.MAX_VALUE;
    int posicionFilaMin = 0;
    int posicionColumnaMin = 0;
    int posicionFilaMax = 0;
    int posicionColumnaMax = 0;
    
    /////////////dibuja el array (extender el terminal para su correcta visualización
    /////////////comprueba que no se repita el número generado en el array///////////777777
    boolean repetido;
    int i;
    int j;
    int fila = 0;
    int columna = 0;
      
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        do {
          array[fila][columna] = (int)(Math.random() * 1001);

          // Comprueba si el número generado ya está en el array.
          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (array[fila][columna] == array[i / 10][i % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      
    
        System.out.printf("%7d   ", array[fila][columna]);
        
        if (array[fila][columna] > numMax) {
          numMax = array[fila][columna];
          posicionFilaMax = fila;
          posicionColumnaMax = columna;
        }
        
        if (array[fila][columna] < numMin) {
          numMin = array[fila][columna];
          posicionFilaMin = fila;
          posicionColumnaMin = columna;
        }
        
      }//for
      System.out.println();
    }
    
    System.out.println("El número máximo es: " + numMax);
    System.out.println("Y se encuentra en la fila; " + posicionFilaMax + " columna: " + posicionColumnaMax);
    
    System.out.println("El número mínimo es: " + numMin);
    System.out.println("Y se encuentra en la fila; " + posicionFilaMin + " columna: " + posicionColumnaMin);
    
  }
}
