/*
*
* @author David León Galisteo
* Ejercicio 4  - Tema 6
*
*/


public class Ejercicio4 {
  public static void main(String[] args) { 
    System.out.println("Vamos a mostrar 20 números aleatorios entre el 0 y el 10");
    System.out.println("(ambos incluídos)");
    System.out.println("___________________________________________");
    System.out.println("Presione INTRO para mostrar los números");
    System.console().readLine();
    
    int numero = 0;
    
    for (int i = 1; i <= 20; i++) {
      numero = (int)(Math.random()*11);
      System.out.print(numero); //imprimimos el número aleatorio obtenido
      System.out.print(" "); //insertamos un espacio después del número
    }
    
  }
}
