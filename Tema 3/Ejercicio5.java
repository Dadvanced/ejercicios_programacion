/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio5 {
  public static void main(String[] args) {

    System.out.println("¡Hola! Vamos a calcular el área de un rectángulo");
    System.out.println("Tenga en cuenta que mediremos el área del rectángulo en metros cuadrados");
    System.out.println("Por favor, introduzca la base del rectángulo:");

    double base = Double.parseDouble(System.console().readLine());

    System.out.println("Ahora introduzca la altura");

    double altura = Double.parseDouble(System.console().readLine());

    double area = base * altura;

    System.out.printf("El área del rectángulo es: %.2f \n", area);
     

  }
}
