/*
*
* @author David León Galisteo
* Ejercicio 09  - Tema 7.2
*
*/


public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Vamos a rotar una matriz cuadrada en el sentido horario de las agujas");
    System.out.println("del reloj. Los números serán generados al azar.");
    System.out.println("_______________________________________________________________________");
    
    int[][] array = new int[12][12];
    int[][] array2 = new int[12][12];
    int i;
    int j;
    int aux;
    
    //////inicializamos el array2 a 200 para saber cuándo se ha introducido un valor nuevo////////
    for (i = 0; i < 12; i++) {
      for (j = 0; j < 12; j++) {
        array2[i][j] = 200;
      }
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    
    
    ///////////crea el primer array con números aleatorios y lo muestra por pantalla///////////////
    System.out.printf("\n                           ARRAY ORIGINAL                  ");
    System.out.println();
    for (i = 0; i < 12; i++) {
      for (j = 0; j < 12; j++) {
        array[i][j] = (int)(Math.random()*101);
        System.out.print(array[i][j] + " ");
      }
      
      System.out.println();
    }
    ///////////////////////////////////////////////////////////////////////////////
    
    
    System.out.println();
    System.out.printf("\n                             ARRAY ROTADA                       ");
    System.out.println();
    for (i = 0; i < 12; i++) {
      for (j = 0; j < 12; j++) {
         if (i > 0) {                        //el último valor del array pasa a la línea de abajo
          array2[i][11] = array[i - 1][11];
        }
        
        if (i == 11 && j < 11) {
          array2[i][j] = array[i][j + 1];
        }
        
       
        
        if (j == 0 && i <= 10) {      //la primera columna tiene el valor de la columna de abajo.
          array2[i][0] = array[i + 1][0];
        } else if (j > 0 && array2[i][j] == 200) { //si la posición NO está ocupada inserta núevo valor
          array2[i][j] = array[i][j - 1];
        }
        
        
        
        
        System.out.print(array2[i][j] + " ");
      }//for J
      
      System.out.println();
    }//FOR línea 45
    
  }
}
      
