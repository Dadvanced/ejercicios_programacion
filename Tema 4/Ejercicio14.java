/*
/
/ @author David León Galisteo
/
/ Ejercicio 14
*/

public class Ejercicio14 {
  public static void main(String[] args) {
	System.out.println("Vamos a comprobar si el número introducido es par y/o");
	System.out.println("divisible entre 5");
	System.out.println("Por favor, introduzca el número");
	System.out.printf("____________________________________ \n");
	System.out.print("Número: ");
	
	double numero = Double.parseDouble(System.console().readLine());
	
	if (numero % 5 == 0) {
		System.out.println("El número introducido es divisible entre 5");
	} else { 
		System.out.println("El número introducido NO es divisible entre 5");
	}
	
	if (numero % 2 == 0) {
		System.out.println("El número introducido es par");
	} else {
		System.out.println("El número introducido NO es par");
	}
	
}
}
	
		
	
