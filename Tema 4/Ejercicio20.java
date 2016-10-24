/*
*
* @author David León Galisteo
* Ejercicio 20  - Tema 4
*
*/

public class Ejercicio20 {
  public static void main(String[] args) {
	  System.out.println("\n En éste programa vamos a indicar si el número");
	  System.out.println(" introducido es capicúa");
	  System.out.printf("________________________________________ \n");
	  System.out.print("\n Introduzca un número (de hasta 5 cifras) ");
	  
	  int numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if (numero < 10) {
      System.out.println("El número introducido es capicúa: " + numero);
    } else if ((numero >=10) && (numero <=99)) {
      if ((numero / 10) == (numero % 10)) {                      //2 cifras
        System.out.println("El número introducido es capicúa " + numero);
      } else {
        System.out.println("El número introducido NO es capicúa " + numero);
      }
    } else if ((numero >=100) && (numero <=999)) {                //3 cifras
      if ((numero / 100) == (numero % 10)) {
        System.out.println("El número introducido es capicúa " + numero);
      } else {
        System.out.println("El número introducido NO es capicúa " + numero);
      }
    } else if ((numero >=1000) && (numero <=9999)) {               // 4 cifras
      if (((numero / 1000) == (numero % 10)) && (((numero / 100) % 10) == ((numero / 10) % 10))) {
        System.out.println("El número introducido es capicúa " + numero);
      } else {
        System.out.println("El número introducido NO es capicúa " + numero);
      }
    } else if ((numero >=10000) && (numero <=99999)) {            //5 cifras
      if (((numero / 10000) == (numero % 10)) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        System.out.println("El número introducido es capicúa " + numero);
      } else {
        System.out.println("El número introducido NO es capicúa " + numero);
      }
    }
    
    if (numero >99999) {
      System.out.println("El número introducido no es correcto");
    }
  }
}
    
  
      
	  
