/*[100]
*
* @author David León Galisteo
* Ejercicio 10  - Tema 7
*
*/


public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar 20 número generados aleatoriamente para posteriormente");
    System.out.println("ordenarlos de forma que los pares se muestren a la izquierda del array");
    System.out.println("y los impares en las celdas restantes.");
    System.out.println("______________________________________________________________________");
    
    int[] array1 = new int[20];
    
    for (int i = 0; i < 20; i++) {
      array1[i] = (int)(Math.random()*100); //genera números aleatorios para cada valor del array.
      System.out.print(array1[i] + " ");
    }
    
    System.out.println("\n___________________________________________________________________");
    System.out.println("Ahora mostraremos los números de manera ordenada.");
    System.out.println();
    
    int[] array2 = new int[20];
    int aPar = 0;
    int aImpar = 19; //controlará el final del array para introducir los números impares
    
    for (int i = 0; i < 20; i++) { //éste for ordenará los números
      if (array1[i] % 2 == 0) {
        array2[aPar] = array1[i];
        aPar++;
      } else {
        array2[aImpar] = array1[i];
        aImpar--;
      } //if
    } //for
    
    for (int i = 0; i < 20; i++) {
      System.out.print(array2[i] + " ");
    }
    
  }
}
