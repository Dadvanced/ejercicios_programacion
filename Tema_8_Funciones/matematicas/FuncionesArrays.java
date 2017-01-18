/**
* Funciones de arrays
* Tema 8
*
* @author David León Galisteo
*/

package matematicas;

public class FuncionesArrays {


  /**
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }



  
/**
* Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indican
* como parámetros.
* @param n indica el tamaño del array
* @param min indica el rango mínimo del array
* @param max indica el rango máximo del array
* @return <code>array</code> devuelve el array 
*/
  public static int[] generaArrayInt(int n, int min, int max) {
    int[] array = new int[n];
    
    for (int i = 0; i < n; i++) {
      array[i] = (int)(Math.random()*(max - min + 1) + min);
    }
    return array;
  }



}