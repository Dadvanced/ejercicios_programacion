/*
*
* @author David León Galisteo
*
* Ejercicio 1 tema 5 - bucles
*
*/

public class ejercicio1 {
  public static void main(String[] args) {
    System.out.println("\nVamos a mostrar los múltiplos de 5 de 0 a 100");
    System.console().readLine();
    
    for (int numero = 1; numero <101; numero ++) {
      if (numero % 5 == 0) {
        System.out.println(numero);
      }
    }
  }
}
