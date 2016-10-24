/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.println("¡Hola!");
    System.out.println("Vamos a convertir Mb a Kb");
    System.out.println("Por favor, introduzca la cantidad de Mb que desee convertir");

    double megaBytes = Double.parseDouble(System.console().readLine());

    double conversor = megaBytes * 1024;

    System.out.printf("La cantidad de Mb introducida son: %.2f %s \n", conversor, "kb"); 
  }
}
