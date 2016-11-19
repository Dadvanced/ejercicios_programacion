/*
*
* @author David León Galisteo
* Ejercicio 9  - Tema 6
*
*/


public class Ejercicio9 {
  public static void main(String[] args) { 
    System.out.println("El programa va a generar números aleatorios entre");
    System.out.println("el 0 y el 100.");
    System.out.println("No parará hasta sacar el 24 y posteriormente nos dirá");
    System.out.println("cuántos números ha tenido que generar hasta salir el 24.");
    System.out.println("___________________________________________");
    System.out.println("Presione INTRO para iniciar");
    System.console().readLine();
    
    int numero = 0;
    int cuenta = 0; //llevará la cuenta de los números generados
    while (numero != 24) {
      numero = (int)(Math.random()*100);
      cuenta++;
    }
    
    System.out.println("\nLa cantidad de números generados hasta llegar");
    System.out.println("al número 24 es de: " + cuenta);
    
  }
}
