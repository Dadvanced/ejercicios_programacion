/*
*
* @author David León Galisteo
* Ejercicio 6 - Tema 4
*
*/

 public class Ejercicio6 {
	 public static void main(String[] args) {
		System.out.println("Vamos a calcular el tiempo que tarda en caer un objeto desde la altura h");
		
		System.out.println("Para ello introduce la altura");
		System.out.printf("_____________________________ \n");
		
		double altura = Double.parseDouble(System.console().readLine());
		
		double solucion = Math.sqrt((2 * altura) / 9.81);
		
		System.out.printf("La solución es: %.2f segundos \n", solucion);
		
	}
}
