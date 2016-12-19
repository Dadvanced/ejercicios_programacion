/*
*
* @author David León Galisteo
* Ejercicio 04  - Tema 7.2
*
*/


public class Ejercicio04 {
  public static void main(String[] args)
    throws InterruptedException { // Se añade esta línea para poder usar sleep {
    System.out.println("Se va a mostrar el sumatorio de un array de números aleatorios");
    System.out.println("comprendidos entre el 100 y ell 999.");
    System.out.println("_______________________________________________________________");
    
    
    int[][] num = new int[4][5];
    int fila = 0;
    int columna = 0;
    int sumaFila = 0;
    int filaTotal = 0;
    int columnaTotal = 0;
    int sumaColumna = 0;
    
        //////////////generamos los números de manera aleatoria ////////////7
    for (fila = 0; fila < 4; fila++) { 
      for (columna = 0; columna < 5; columna++) {
        num[fila][columna] = (int)(Math.random()*900) + 100;
      }
    }
    System.out.println(); //salto de línea
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      
      Thread.sleep(500);
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
      Thread.sleep(500);
      System.out.printf("%7d   ", sumaColumna);
      columnaTotal += sumaColumna;
      sumaColumna = 0;
    }//for 
    Thread.sleep(500);
    System.out.printf("|%7d   ", (columnaTotal + filaTotal));
    
  }
}
