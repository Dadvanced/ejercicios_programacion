/*
* @author David León Galisteo
* Ejercicio 13  - Tema 6
*
*/


public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Vamos a simular la tirada de 2 dados que se lanzarán");
    System.out.println("una y otra vez hasta que ambos dados tengan el mismo valor.");
    System.out.println("_______________________________________________");
    System.out.println("\nPulse INTRO para comenzar las tiradas.");
    System.console().readLine(); //obliga al usuario a pulsar INTRO para continuar el programa
    
    int dadoA = 0;
    int dadoB = 0;
    
    do {
      dadoA = (int)(Math.random()*6) + 1;
      System.out.print(dadoA + " ");
      dadoB = (int)(Math.random()*6) + 1;
      System.out.print(dadoB);
      
      System.out.println();
    } while (dadoA != dadoB);
    
  }
}
