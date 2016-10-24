/*
*
* @author David León Galisteo
* Ejercicio 13  - Tema 4
*
*/

 public class Ejercicio13 {
	 public static void main(String[] args) {
		 System.out.println("Vamos a ordenar 3 números que introduzca usted");
		 System.out.println("Los números serán enteros y se ordenarán de menor a mayor");
		 System.out.printf("______________________________________ \n");
		 System.out.println("Por favor introduce el primer número");
		 System.out.printf("Primer número ");
		 
		 int a = Integer.parseInt(System.console().readLine());
		 
		 System.out.printf("______________________________________ \n");
		 System.out.printf("______________________________________ \n");
		 
		 System.out.println("Ahora introduzca el segundo número");
		 System.out.print("Segundo número ");
		 
		 int b = Integer.parseInt(System.console().readLine());
		 
		 System.out.printf("______________________________________ \n");
		 System.out.printf("______________________________________ \n");
		 
		 System.out.println("Y ahora el último número");
		 System.out.print("Tercer número ");
		 
		 int c = Integer.parseInt(System.console().readLine());
		 
		 if (a < b && a < c) {
			 if (b < c) {
				 System.out.println("El orden sería el siguiente: " + a + b + c);
			 } else {
				 System.out.println("El orden sería el siguiente: " + a + c + b);
			 }
		 } else if (b < a && b < c) {
			 if (a < c) {
				 System.out.println("El orden sería el siguiente: " +  b + a + c);
			 } else {
				 System.out.println("El orden sería el siguiente: " +  b + c + a);
			 }
		 } else {
			if (c < a && c < b) {
				if (a < b) {
					System.out.println("El orden sería el siguiente: " +  c + a + b);
				} else {
					System.out.println("El orden sería el siguiente: " +  c + b + a);
				}
			}
			
		}
		
	}
}
			 
