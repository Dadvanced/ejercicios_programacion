/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio9 {
  public static void main(String[] args) {

    System.out.println("¡Hola!");
    System.out.println("Vamos a calcular el volumen de un cono.");
    System.out.println("Para ello se requiere que introduzca la altura y el radio");
    System.out.println("Por favor, introduzca la altura del cono");

    double alturaCono = Double.parseDouble(System.console().readLine());

    System.out.println("Y ahora introduzca el radio");

    double radioCono = Double.parseDouble(System.console().readLine());

    double volumenCono = (3.14 * (radioCono * radioCono) * alturaCono) / 3;

    System.out.printf("El volumen del cono es: %.2f \n", volumenCono);
  }
}
