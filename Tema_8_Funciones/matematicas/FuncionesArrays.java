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
  
  
  /*
   * Dice si un número está o no dentro de un array
   * 
   * @param x array unidimiensional de números enteros
   * @param n número que se buscará dentro del array
   * return <code>true</code> devuelve "verdadero" si el número se encuentra dentro del array
   */
  
  public static boolean estaEnArrayInt(int x[], int n) {
    for (int numero : x)  {
      if (n == numero) {
        return true;
      }
    }
    return false;
  }
  
  
   /** Busca un número en un array y devuelve la posición (índice) en la que se encuentra
   * 
   * @param x array unidimiensional de números enteros
   * @param n número que se buscará dentro del array
   * return <code>posicion</code> devuelve -1 en caso de que no se encuentre en el array
   */
   
   public static int posicionEnArray(int x[], int n) {
     for (int i = 0; i < x.length; i++) {
       if (n == x[i]) {
         return i;
       }
     }
     return -1;
   }
   
   
   
   /** Voltea un array 
   * 
   * @param x array unidimiensional de números enteros
   * return <code>arrayVolteado</code> devuelve el array volteado
   */
   
   public static int[] volteaArrayInt(int x[]) {
     int[] arrayVolteado = new int[x.length];
     int indiceTotal = x.length;
     
     for (int i = 0; i < x.length; i++) {
       arrayVolteado[i] = x[indiceTotal - 1];
       indiceTotal--;
     }
     return arrayVolteado;
   }
   
   
   
   /** Rota n posiciones a la derecha los números de un array
   * 
   * @param x array unidimiensional de números enteros
   * @param n número de veces que se rotará el array hacia la derecha
   * return <code>arrayRotado</code> devuelve el array rotado
   */
   
   public static int[] rotaDerechaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
      
    return arrayRotado;
  }
  
  /**
   * Devuelve un array rotada <code>n</code> posiciones a la izquierda tomando
   * como referencia el array que se pasa como parámetro. Los números que van
   * saliendo por la izquierda vuelven a entrar por la derecha.
   *
   * @param x array unidimiensional de números enteros
   * @param n número de movimientos (rotaciones hacia la izquierda) a realizar
   * @return  array rotada <code>n</code> posiciones a la izquierda
   */
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
      
    return a;
}
       
       
     
   
   
  
}
