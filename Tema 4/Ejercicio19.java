/*
*
* @author David León Galisteo
* Ejercicio 19  - Tema 4
*
*/

public class Ejercicio19 {
  public static void main(String[] args) {
	  System.out.println("\n En éste programa vamos a indicar el número de cifras");
	  System.out.println(" de un número que usted haya introducido");
	  System.out.printf("________________________________________ \n");
	  System.out.print("\n Introduzca el número entero (de hasta 5 cifras) ");
	  
	  int numero = Math.abs(Integer.parseInt(System.console().readLine()));
	  
	  
	  
	  if (numero < 10) {
		  System.out.println("El número introducido tiene 1 cifra");
	  } else if ((numero >=10) && (numero <=99)) {
		  System.out.println("El número introducido tiene 2 cifras");
	  } else if ((numero >=100) && (numero <=999)) {
		  System.out.println("El número introducido tiene 3 cifras");
	  } else if ((numero >=1000) && (numero <=9999)) {
		  System.out.println("El número introducido tiene 4 cifras");
	  } else if ((numero >=10000) && (numero <=99999)) {
		  System.out.println("El número introducido tiene 5 cifras");
	  } else {
		  System.out.println("El número introducido no está admitido");
	  }
  }
}
    
