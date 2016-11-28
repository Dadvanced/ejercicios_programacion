/*
*
* @author David León Galisteo
* Ejercicio 25  - Tema 6
*
*/


public class Ejercicio25 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar 100 números aleatorios enteros comprendidos");
    System.out.println("entre el 10 y el 200 ambos incluídos y separados por");
    System.out.println("espacios. Los primos aparecerán entre almohadillas y");
    System.out.println("los múltiplos de 5 entre corchetes.");
    System.out.println("______________________________________________");
    System.out.println("\nPulse INTRO para empezar");
    System.console().readLine();
    
    int numero = 0;
    boolean esPrimo = true;
    boolean esMultiplo5 = false;
            
    for (int i = 1; i <= 100; i++) {
      numero = (int)(Math.random()*191) + 10;
      
      for (int j = 1; j < numero; j++) {
        if (numero % i == 0) {
          esPrimo = false;
        }
        
        if (numero % 5 == 0) {
          esMultiplo5 = true;
        }
                 
      }//for de comprobar si es primo o múltiplo de 5
      
      if (esPrimo) {
          System.out.print(" #" + numero + "# ");
        } else if (esMultiplo5) {
          System.out.print(" [" + numero + "] ");
        } else {
          System.out.print(numero + " ");
        }
        
      esPrimo = true;
      esMultiplo5 = false;
    }//for
  }
}
