/*
*
* @author David León Galisteo
* Ejercicio 7  - Tema 4
*
*/

 public class Ejercicio7 {
	 public static void main(String[] args) {
		System.out.println("Vamos a calcular la media de 3 notas");
		System.out.println("Para ello introduce la primera nota");
		System.out.printf("___________________________________ \n");
		
		double primeraNota = Double.parseDouble(System.console().readLine());
		
		System.out.println("Ahora la segunda nota");
		System.out.printf("___________________________________ \n");
		
		double segundaNota = Double.parseDouble(System.console().readLine());
		
		System.out.println("Y por último, la tercera nota");
		System.out.printf("___________________________________ \n");
		
		double terceraNota = Double.parseDouble(System.console().readLine());
		
		double solucion = (primeraNota + segundaNota + terceraNota) / 3;
		
		System.out.println("La media de las 3 notas es: " + solucion);
		
	}
}
