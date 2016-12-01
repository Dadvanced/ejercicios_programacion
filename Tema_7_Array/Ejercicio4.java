/*
*
* @author David León Galisteo
* Ejercicio 4  - Tema 7
*
*/


public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar en 3 columnas el cuadrado y cubo de los números de la");
    System.out.println("primera columna (las 3 columnas son array).");
    System.out.println("______________________________________________________________________");
    
    int[] numero = new int[20];
    
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
    }
    
    int[] cuadrado = new int[20];
    
    for (int i = 0; i < 20; i++) {
      cuadrado[i] = numero[i] * numero[i];
    }
    
    int[] cubo = new int[20];
    
    for (int i = 0; i < 20; i++) {
      cubo[i] = (int)(Math.pow(numero[i], 3));
    }
    
    for (int i = 0; i < 20; i++) {
      System.out.printf("%3d  | %5d  | %8d  ", numero[i], cuadrado[i], cubo[i]);
      System.out.println();
    }
  }
}
