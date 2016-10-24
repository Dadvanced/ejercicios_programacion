/*
*
* @author: David León Galisteo 
* Tema 4
*/

public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println("Introduce la hora para recibir un saludo:");
    
    int hora = Integer.parseInt(System.console().readLine());
    
    if (hora >=6 && hora  <=12) {
       System.out.println("Buenos días");
       
       } else if (hora >=13 && hora <=20) {
		   System.out.println("Buenas tardes");
		   
	   } else if ((hora >=21 && hora <=23) || (hora >=0 && hora <=5)) {
			System.out.println("Buenas noches");
			
		} else {
			System.out.println("Esa hora no existe");
			
	}
       
  }
}
