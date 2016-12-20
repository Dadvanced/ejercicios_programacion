/*
*
* @author David León Galisteo
* Ejercicio 05  - Tema 7.2
*
*/


public class Ejercicio05 {
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
    for (int fila = 0; fila < 6; fila++) {
      for (int columna = 0; columna < 10; columna++){
        array[fila][columna] = (int)(Math.random()*1001);
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
        
