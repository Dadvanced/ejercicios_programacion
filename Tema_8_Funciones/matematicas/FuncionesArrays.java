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


/**
* Devuelve el valor mínimo de un array que se pasa como parámetro
* @param x es el array que se pasa como parámetro
* @return <code>minimo</code> devuelve el valor mínimo que se encuentra en un array 
*/

  public static int minimoArrayInt(int x[]) {
    int minimo = Integer.MAX_VALUE;
    
    for (int i = 0; i < x.length; i++) {
      if (x[i] < minimo) {
      minimo = x[i];
      }//if
    }//for
    return minimo;
  }
  
  /**
   * Devuelve el valor máximo de un array de enteros
   * @param x array unidimiensional de números enteros
   * return <code>max>/code> devuelve el número máximo de un array introducido por parámetros
   */
  
  public static int maximoArrayInt(int x[]) {
    int maximo = Integer.MIN_VALUE;
    
    for (int i = 0; i < x.length; i++) {
      if (x[i] > maximo) {
        maximo = x[i];
      }
    }
    return maximo;
  }
  
  
  /**
   * Devuelve la media del array que se pasa como parámetro
   * 
   * @param x array unidimiensional de números enteros
   * return <code>media</code> devuelve la media del array introducido
   */
  
  public static int mediaArrayInt(int x[]) {
    int media = 0;
    int contador = 0;
    
    for (int i = 0; i < x.length; i++) {
      media += x[i];
      contador++;
    }
    
    return media / contador;
  }
  
  
}
