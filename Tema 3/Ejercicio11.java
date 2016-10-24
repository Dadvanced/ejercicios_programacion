/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("¡Hola!");
    System.out.println("Vamos a convertir Kb a Mb");
    System.out.println("Por favor, introduzca la cantidad de Kb que desee convertir");

    double kiloBytes = Double.parseDouble(System.console().readLine());

    double conversor = kiloBytes / 1024;

    System.out.printf("La cantidad de Mb introducida son: %.2f %s \n", conversor, "Mb"); 
  }
}
