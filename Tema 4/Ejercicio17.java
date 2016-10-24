/*
*
* @author David León Galisteo
* Ejercicio 17  - Tema 4
*
*/

public class Ejercicio17 {
  public static void main(String[] args) {
	  System.out.println("En éste programa vamos a mostrar el último número entero");
	  System.out.println(" de una cifra que usted haya introducido");
	  System.out.printf("________________________________________ \n");
	  System.out.print("Introduzca el número entero ");
	  
	  int numero = Integer.parseInt(System.console().readLine());

      System.out.println("La última cifra del número introducido es el " + (numero % 10));
  }
}
