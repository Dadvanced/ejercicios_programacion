/*
*
* @author David León Galisteo
* Tema 8: Funciones - Ejercicio 16
*
*/

import matematicas.FuncionesMatematicas;

public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Se mostrará todos los números capicúa comprendidos entre el 1 y el 99999");
    System.out.println("Pulse INTRO para empezar.");
    System.console().readLine();
    
    for (int i = 1; i <= 99999; i++) {
      if (FuncionesMatematicas.esCapicua(i)) {
        System.out.println(i);
      }
    }
    
  }
}
