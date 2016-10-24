/*
*
* @author David León Galisteo
* Ejercicio 3 - Tema 4
*
*/

 public class ejercicio3 {
	 public static void main(String[] args) {
		 
		 System.out.println("Introduce un número del 1 al 7");
		 System.out.printf("_______________________________ \n");
		 
		 int dia = Integer.parseInt(System.console().readLine());
		 
		 switch (dia) {
			 
			 case 1:
				System.out.println("Hoy es Lunes");
				break;
				
			case 2:
				System.out.println("Hoy es Martes");
				break;
				
			case 3:
				System.out.println("Hoy es Miércoles");
				break;
				
			case 4:
				System.out.println("Hoy es Jueves");
				break;
				
			case 5:
				System.out.println("Hoy es Viernes");
				break;
				
			case 6:
				System.out.println("Hoy es Sábado");
				break;
				
			case 7:
				System.out.println("Hoy es Domingo");
				break;
				
			default:
				System.out.println("Número introducido incorrecto");
				
		}
	}
}
			
