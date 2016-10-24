/*
*
* @author David León Galisteo
* Ejercicio 5 - Tema 4
*
*/

 public class ejercicio5 {
	 public static void main(String[] args) {
		
		System.out.println("Vamos a resolver una ecucación de primer grado");
		System.out.println("ax + b = 0");
		System.out.println("Por tanto necesito que introduzcas el valor de a");
		
		double a = Double.parseDouble(System.console().readLine());
		
		System.out.println("Ahora necesito que introduzcas el valor de b");
		
		double b = Double.parseDouble(System.console().readLine());
		
		double solucion = -b / a;
		
		System.out.println("X es igual a " + solucion);
		
	}
}
		
		
