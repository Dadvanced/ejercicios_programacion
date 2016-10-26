/*
*
* @author David León Galisteo
*
* Ejercicio 5 tema 5 - bucles
*
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("\nSe va a mostrar una cuenta hacia atrás desde el");
    System.out.println("320 hasta el 160 de 20 en 20");
    System.console().readLine();
    
    int i = 320;
    
    while (i >=160) {
      System.out.println("" + i);
      i = (i - 20);
    }
    
  }
}
