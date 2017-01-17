/*
*
* @author David León Galisteo
* Tema 8: Funciones - Ejercicio 15
*
*/

import matematicas.FuncionesMatematicas;

public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Se mostrará todos los números primos comprendidos entre el 1 y el 1000");
    System.out.println("Pulse INTRO para empezar.");
    System.console().readLine();
    
    for (int i = 2; i <= 1000; i++) {
      if (FuncionesMatematicas.esPrimo(i)) {
        System.out.println(i);
      }
    }
    
  }
}
