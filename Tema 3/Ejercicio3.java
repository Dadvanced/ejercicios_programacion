/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio3 {
  public static void main(String[] args) {

    System.out.println("Bienvenido al conversor de pesetas a euros.");
    System.out.println("Por favor, introduce la cantidad de pesetas a convertir:");

    double pesetas = Double.parseDouble(System.console().readLine());
  
    double conversor = pesetas / 166.386;

    System.out.printf("La cantidad de pesetas introducidas equivale a %.2f euros \n", conversor);

  }
}
