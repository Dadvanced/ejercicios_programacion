/**
* Ejercicio 1
*
* @author David León
*/

public class Ejercicio1 {
  public static void main(String[] args) {
	  System.out.println("por favor, introduce un número entero:");
    
    int primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.println("y ahora otro número más:");
	
	int segundoNumero = Integer.parseInt(System.console().readLine());
	
	int multiplicar = primerNumero * segundoNumero;
	
	System.out.println("la multiplicación de ambos números es: " + multiplicar);
	
	
  }
}
