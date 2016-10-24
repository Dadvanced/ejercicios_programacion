/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio6 {
  public static void main(String[] args) {

    System.out.println("¡Hola! Vamos a calcular el área de un triángulo");
    System.out.println("Por favor, introduzca la base del triángulo:");

    double base = Double.parseDouble(System.console().readLine());

    System.out.println("Ahora introduzca la altura");

    double altura = Double.parseDouble(System.console().readLine());

    double area = (base * altura) / 2;

    System.out.printf("El área del triángulo es: %.2f \n", area);
   

  }
}
