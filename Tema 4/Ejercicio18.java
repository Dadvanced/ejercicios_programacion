/*
*
* @author David León Galisteo
* Ejercicio 18  - Tema 4
*
*/

public class Ejercicio18 {
  public static void main(String[] args) {
	  System.out.println("En éste programa vamos a mostrar el primer número entero");
	  System.out.println(" de una cifra que usted haya introducido");
	  System.out.printf("________________________________________ \n");
	  System.out.print("Introduzca el número entero (de hasta 5 cifras ");
	  
	  int numero = Integer.parseInt(System.console().readLine());
	  
	  if (numero < 10) {
		  System.out.println("La primera cifra (y única) número introducido es " + numero);
	  } else if ((numero >=10) && (numero <=99)) {
		  System.out.println("La primera cifra del número introducido es " + (numero / 10));
	  } else if ((numero >=100) && (numero <=999)) {
		  System.out.println("La primera cifra del número introducido es " + (numero / 100));
	  } else if ((numero >=1000) && (numero <=9999)) {
		  System.out.println("La primera cifra del número introducido es " + (numero / 1000));
	  } else if ((numero >=10000) && (numero <=99999)) {
		  System.out.println("La primera cifra del número introducido es " + (numero / 10000));
	  } else {
		  System.out.println("El número introducido no está admitido");
	  }
  }
}
    
