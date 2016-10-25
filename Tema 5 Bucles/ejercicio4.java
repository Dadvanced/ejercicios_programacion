/*
*
* @author David León Galisteo
*
* Ejercicio 4 tema 5 - bucles
*
*/

public class ejercicio4 {
  public static void main(String[] args) {
    System.out.println("\nSe va a mostrar una cuenta hacia atrás desde el");
    System.out.println("320 hasta el 160 de 20 en 20");
    System.console().readLine();
    
    for (int i = 320; i >=160; i = (i - 20)) {
      System.out.println("\n " + i);
    }
  }
}
