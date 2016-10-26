/*
*
* @author David León Galisteo
*
* Ejercicio 6 tema 5 - bucles
*
*/

public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("\nSe va a mostrar una cuenta hacia atrás desde el");
    System.out.println("320 hasta el 160 de 20 en 20");
    System.console().readLine();
    
    int i = 320;
    
    do {
      System.out.println("" + i);
      i = (i-20);
    } while (i >=160);
    
  }
}
