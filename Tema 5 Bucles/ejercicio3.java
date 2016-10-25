/*
*
* @author David León Galisteo
*
* Ejercicio 3 tema 5 - bucles
*
*/

public class ejercicio3 {
  public static void main(String[] args) {
    System.out.println("\nVamos a mostrar los múltiplos de 5 de 0 a 100");
    System.console().readLine();
    
    int numero = 1; 
    
    do {
     if (numero % 5 == 0) {
        System.out.println(numero);
      }
      numero ++; 
    }
    while (numero <101); 
    
  } 
}

