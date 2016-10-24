/*
*
* @author David León Galisteo
* Ejercicio 9  - Tema 4
*
*/

 public class Ejercicio9 {
	 public static void main(String[] args) {
	 
		System.out.println("Vamos a resolver la ecuación de segundo grado del tipo:");
		System.out.println("ax² + bx + c = 0");
		System.out.println("Para ello introduce primero el valor de a");
		System.out.printf("________________________________________ \n");
		
		double a = Double.parseDouble(System.console().readLine());
		
		System.out.println("Ahora introduzca el valor de b");
		System.out.printf("_____________________________________ \n");
		
		double b = Double.parseDouble(System.console().readLine());
		
		System.out.println("Y por último el valor de c");
		
		double c = Double.parseDouble(System.console().readLine());
		
		double solucion = (-b + (Math.sqrt(b * b - 4 * (a * c)))) / (2 * a); 
		double solucion2 = (-b - (Math.sqrt(b * b - 4 * (a * c)))) / (2 * a); 
		
		System.out.println("Una de las soluciones es: " + solucion);
		System.out.println("La otra solucion es: " + solucion2);
		
	}
}
