/*
*
* @author David León Galisteo
* Ejercicio 8  - Tema 4
*
*/

 public class Ejercicio8 {
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
		
		String boletin = "nada";
		
		if (solucion <=5) {
			boletin = "insuficiente";
			System.out.printf("La media de las 3 notas es: %.2f \n", + solucion);
			System.out.println("Su calificacion es de: " + boletin);
			
		} else if (solucion >=5 && solucion <=6) {
			boletin = "suficiente";
			System.out.printf("La media de las 3 notas es: %.2f \n", + solucion);
			System.out.println("Su calificacion es de: " + boletin);
			
		} else if (solucion >=7 && solucion <=8) {
			boletin = "notable";
			System.out.printf("La media de las 3 notas es: %.2f \n", + solucion);
			System.out.println("Su calificacion es de: " + boletin);
		
		} else if (solucion >=9 && solucion <=10) {
			boletin = "sobresaliente";
			System.out.printf("La media de las 3 notas es: %.2f \n", + solucion);
			System.out.println("Su calificacion es de: " + boletin);
			
		} else {
			System.out.println("Ese número no es válido");
		}
		
		
	}
}
