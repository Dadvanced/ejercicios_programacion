/**
*
* @author David León
*/

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("Introduzca la cantidad de € a convertir: ");
    double euros = Double.parseDouble(System.console().readLine());
    
    double convertir = euros * 166.386;
    
    System.out.println("la cantidad de euros introducida es " + convertir + "pesetas");
  
  }
 }
