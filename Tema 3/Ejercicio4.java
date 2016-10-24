/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio4 {
  public static void main(String[] args) {

    System.out.println("Bienvenido al programa de operaciones sencillas");
    System.out.println("Ahora vamos a sumar, restar, multiplicar y dividir 2 números elegidos por usted");
    System.out.println("Por favor introduzca el primer número:");

    double primerNumero = Double.parseDouble(System.console().readLine());

    System.out.println("Ahora introduzca el segundo número");

    double segundoNumero = Double.parseDouble(System.console().readLine());

    double suma = primerNumero + segundoNumero;
    double resta = primerNumero - segundoNumero;
    double producto = primerNumero * segundoNumero;
    double division = primerNumero / segundoNumero;

    System.out.printf("La suma de ambos números es: %.2f \n", suma);
    System.out.printf("La resta de ambos números es: %.2f \n", resta);
    System.out.printf("La multiplicación de ambos números es: %.2f \n", producto);
    System.out.printf("La división de ambos números es: %.2f \n", division);

   

  }
}
