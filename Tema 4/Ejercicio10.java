/*
*
* @author David León Galisteo
* Ejercicio 10  - Tema 4
*
*/

 public class Ejercicio10 {
	 public static void main(String[] args) {
	 
	 System.out.println("Encuentra tu horóscopo a través del día y mes de nacimiento");
	 System.out.println("Por favor, escribe el mes de nacimiento");
	 System.out.printf("___________________________________________ \n");
	 
	 String mes = System.console().readLine().toLowerCase();
	 
	 System.out.println("Y ahora el número de día");
	 System.out.printf("____________________________________________ \n");
	 
	 int dia = Integer.parseInt(System.console().readLine());
	 
	 switch (mes) {
		 case "enero":
			if (dia <=19) {
				System.out.println("Tu signo es Capricornio ♑");				
			} else {
				System.out.println("Tu signo es Acuario ♒");
			}
		 break;
		
		//Febrero
		
		case "febrero":
			if (dia <=18) {
				System.out.println("Tu signo es Acuario ♒");				
			} else {
				System.out.println("Tu signo es Piscis ♓");
			}
		break;				
		
		//Marzo
		
		case "marzo":
			if (dia <=19) {
				System.out.println("Tu signo es Piscis ♓");				
			} else {
				System.out.println("Tu signo es Aries ♈");
			}
			break;
			
		//Abril
		
		case "abril":
			if (dia <=19) {
				System.out.println("Tu signo es Aries ♈");				
			} else {
				System.out.println("Tu signo es Tauro ♉");
			}
			break;
			
		//Mayo
			
		case "mayo":
				if (dia <=20) {
					System.out.println("Tu signo es Tauro ♉");
				} else {
					System.out.println("Tu signo es Géminis ♊");
				}
				break;
				
		//Junio
		
		case "junio":
			if (dia <=20) {
				System.out.println("Tu signo es Géminis ♊");
			} else {
				System.out.println("Tu signo es Cáncer ♋");
			}
			break;
			
		//Julio
		
		case "julio":
			if (dia <=22) {
				System.out.println("Tu signo es Cáncer ♋");
			} else {
				System.out.println("Tu signo es Leo ♌");
			}
			break;
			
		//Agosto
		
		case "agosto":
			if (dia <=22) {
				System.out.println("Tu signo es Leo ♌");
			} else {
				System.out.println("Tu signo es Virgo ♍");
			}
			break;
			
		//Septiembre
		
		case "septiembre":
			if (dia <=22) {
				System.out.println("Tu signo es Virgo ♍");
			} else {
				System.out.println("Tu signo es Libra ♎");
			}
			break;
			
		//Octubre
		
		case "octubre":
			if (dia <=22) {
				System.out.println("Tu signo es Libra ♎");
			} else {
				System.out.println("Tu signo es Escorpio ♏");
			}
			break;
			
		//Noviembre
		
		case "noviembre":
			if (dia <=21) {
				System.out.println("Tu signo es Escorpio ♏");
			} else {
				System.out.println("Tu signo es Sagitario ♐");
			}
			break;
			
		//Diciembre
		
		case "diciembre":
			if (dia <=21) {
				System.out.println("Tu signo es Sagitario ♐");
			} else {
				System.out.println("Tu signo es Capricornio ♑");
			}
			break;
			
		default:
			System.out.println("Mes incorrecto");
				
		
		
	}
	
  }
}
	 
